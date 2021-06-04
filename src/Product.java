public class Product implements Operation<Integer> {
    @Override
    public Integer empty() {
        return 1;
    }

    @Override
    public Integer combine(Integer op1, Integer op2) {
        return op1 * op2;
    }

}