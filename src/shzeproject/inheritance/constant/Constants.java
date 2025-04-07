package shzeproject.inheritance.constant;

public class Constants {
    final String name = "Man";
    static final String NAME = "Len";

    @Override
    public String toString() {
        return NAME + name;
    }

    public static void main(String[] args) {
       String constString = Constants.NAME;
        System.err.println(constString);
        System.err.println("ИЛИ " + Constants.NAME);

        Constants constants = new Constants();
        System.out.println(constants.name);
    }
}
