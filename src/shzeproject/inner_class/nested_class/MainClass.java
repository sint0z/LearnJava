package shzeproject.inner_class.nested_class;

public class MainClass {
    private static class NestedClass{
        private static final int INT = 10;

        public void voice(){
            System.out.println("I'm nested class");
        }
    }

    public static NestedClass createNestedClass(){
        return new NestedClass();
    }

    public static void main(String[] args) {
        createNestedClass().voice();
        int number = NestedClass.INT;
        System.out.println(number);
    }
}
