public class Addition extends Quantifier<Integer> {
    @Override
    public Integer empty() {
        return 0;
    }

    @Override
    public Integer combine(Integer op1, Integer op2) {
        return op1 + op2;
    }

}