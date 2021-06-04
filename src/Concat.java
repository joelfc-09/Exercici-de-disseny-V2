public class Concat implements Operation<String> {

    @Override
    public String empty() {
        return "";
    }

    @Override
    public String combine(String op1, String op2) {
        return op1 + op2;
    }

}
