public interface Operation<E> {
    E empty();

    E combine(E op1, E op2);
}
