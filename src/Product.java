public class Product extends Quantifier<Integer> {
    @Override
    protected Integer empty() {
        return 1;
    }

    @Override
    protected Integer combine(Integer op1, Integer op2) {
        return op1 * op2;
    }

}