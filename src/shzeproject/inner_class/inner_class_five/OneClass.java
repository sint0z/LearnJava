package shzeproject.inner_class.inner_class_five;

public class OneClass {
    private String string;
    private int number;

    public OneClass(String string, int number){
        this.string = string;
        this.number = number;
    }

    public void method(final String say) {
        System.out.println(string + " | " + number + " | " + say);
    }
}
