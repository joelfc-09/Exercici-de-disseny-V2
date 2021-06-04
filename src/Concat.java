public class Concat extends Quantifier<String> {
    @Override
    protected String empty() {
        return "";
    }

    @Override
    protected String combine(String op1, String op2) {
        return op1 + op2;
    }

}
