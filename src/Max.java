public class Max extends Quantifier<Integer> {
    @Override
    protected Integer empty() {
        return Integer.MIN_VALUE;
    }

    @Override
    protected Integer combine(Integer op1, Integer op2) {
        if (op1 > op2) {
            return op1;
        } else {
            return op2;
        }
    }

}
