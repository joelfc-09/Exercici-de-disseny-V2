public class Max extends Quantifier {

    @Override
    public Object empty() {
        return Integer.MIN_VALUE;
    }

    @Override
    public Object combine(Object op1, Object op2) {
        if ((Integer) op1 > (Integer) op2) {
            return (Integer) op1;
        } else {
            return (Integer) op2;
        }
    }

}
