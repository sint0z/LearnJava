package shzeproject.operators;

public class Literal {

    public static void main(String[] args) {
        long literalOne = 0x2314F;
        TestOne.print(Long.toBinaryString(literalOne));

        long literalTwo = 0123457;
        TestOne.print(Long.toBinaryString(literalTwo));
    }

}
