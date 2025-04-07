package shzeproject.rtti.toy;

public class CharArray {

    public static void main(String[] args) {
        char[] chars = new char[10];

        Class<?> clazzChar = chars.getClass();

        System.err.println(clazzChar.isArray());
        System.out.println(clazzChar.getTypeName());
    }
}
