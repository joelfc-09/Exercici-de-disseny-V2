public class Variable <E> implements Expression {
    private E value;

    public Variable(E value) {
        this.value = value;
    }

    @Override
    public Object evaluate() {
        return value;
    }

    public void setValue(E newValue) {
        this.value = newValue;
    }
}
