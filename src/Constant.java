public class Constant<E> extends Expression<E> {
    private final E value;

    public Constant(E value) {
        this.value = value;
    }

    @Override
    public E evaluate() {
        return value;
    }

}
