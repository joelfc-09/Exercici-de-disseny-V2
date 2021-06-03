import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class Quantifier<E> extends Expression<E> implements Observer {
    private final List<Expression<E>> expressions = new ArrayList<>();

    private E evaluatedValue = this.empty();

    public void addExpression(Expression<E> expr) {
        expressions.add(expr);
        expr.addObserver(this);
        evaluatedValue = this.evaluate();
    }
    public void removeExpression(Expression<E> expr) {
        expressions.remove(expr);
        expr.deleteObserver(this);
        evaluatedValue = this.evaluate();

    }

    @Override
    public E evaluate() {
        if (expressions.isEmpty()) {
            return this.empty();
        }
        if (expressions.size() == 1) {
            return expressions.get(0).evaluate();
        } else {
            E toReturn = combine(expressions.get(0).evaluate(), expressions.get(1).evaluate());
            for (int i = 2; i < expressions.size(); i++) {
                toReturn = combine(toReturn, expressions.get(i).evaluate());
            }
            return toReturn;
        }
    }

    public abstract E empty();

    public abstract E combine(E op1, E op2);

    public void update(Observable o, Object arg) {
        E newValue = this.evaluate();
        if (!this.evaluatedValue.equals(newValue)) {
            notifyObservers(arg);
        }
        evaluatedValue = newValue;
    }

}
