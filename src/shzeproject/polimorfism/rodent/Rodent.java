package shzeproject.polimorfism.rodent;

public class Rodent {
    private Description description = new Description("Rodent.descriptio");
    private Characteristic characteristic;

    public Rodent(Characteristic characteristic){
        System.out.println("Object Rodent is init ");
        this.characteristic = characteristic;
        this.characteristic.addRef();
    }
       
    public void eat(){
        System.out.println("Rodent.eat()");
    }

    public void sleep(){
        System.out.println("Rodent.eat()");
    }

    public void getInformation(){
       System.out.println(characteristic.getRefCount());
    }
}
