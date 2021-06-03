public class Variable<E> extends Expression<E> {
    private E value;

    public Variable(E value) {
        this.value = value;
    }

    @Override
    public E evaluate() {
        return value;
    }

    public void setValue(E newValue) {
        ValueChanged<E> VC = new ValueChanged<>(this.value, newValue);
        if (!newValue.equals(this.value)) {
            notifyObservers(VC);
        }
        this.value = newValue;
    }

}
