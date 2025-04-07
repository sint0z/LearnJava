package shzeproject.interface_and_abstraction.abstract_two;

public class ChildClass extends BaseClass{
    private int num = 0;
    @Override
    public void play() {
        System.out.println(num);
    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.play();
    }
}
