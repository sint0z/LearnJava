package shzeproject.interface_and_abstraction.interface_three;

public abstract class AbstractClass {
    private int i = 1;
    public abstract void abstractMethod();

    int inc(){
        return ++i;
    }
}
