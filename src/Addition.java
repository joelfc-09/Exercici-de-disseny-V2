public class Addition extends Quantifier<Integer> {
    @Override
    protected Integer empty() {
        return 0;
    }

    @Override
    protected Integer combine(Integer op1, Integer op2) {
        return op1 + op2;
    }

}