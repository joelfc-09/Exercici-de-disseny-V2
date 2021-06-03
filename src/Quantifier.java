import java.util.ArrayList;
import java.util.List;

public abstract class Quantifier<E> implements Expression {
    private List<Expression<E>> expressions = new ArrayList<>();

    public void addExpression(Expression<E> expr) {
        expressions.add(expr);
    }
    public void removeExpression(Expression<E> expr) {
        expressions.remove(expr);
    }

    @Override
    public Object evaluate() {

        if (expressions.isEmpty()) {
            return this.empty();
        }
        if (expressions.size() == 1) {
            return expressions.get(0);
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

}
