package shzeproject.interface_and_abstraction.rodent;

public class Mouse extends Rodent {
    private Description description = new Description("Mouse.description");

    public Mouse(Characteristic c){
        super(c);
        System.out.println("Object Mouse is init ");
    }
    @Override
    public void eat(){
        System.out.println("Mouse.eat()");
    }

    @Override
    public void sleep(){
        System.out.println("Mouse.sleep()");
    }
}
    
