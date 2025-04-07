package shzeproject.polimorfism.rodent;

public class Hamster extends Rodent{
    private Description description = new Description("Hamster.description");
    
    public Hamster(Characteristic c){
        super(c);
        System.out.println("Object Hamster is init ");
    }

    @Override
    public void eat(){
        System.out.println("Hamster.eat()");
    }

    @Override
    public void sleep(){
        System.out.println("Hamster.sleep()");
    }
}
