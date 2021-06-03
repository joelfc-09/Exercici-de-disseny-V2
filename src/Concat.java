public class Concat extends Quantifier{
    @Override
    public Object empty() {
        return "";
    }

    @Override
    public Object combine(Object op1, Object op2) {
        return (String) op1 + op2;
    }
}
