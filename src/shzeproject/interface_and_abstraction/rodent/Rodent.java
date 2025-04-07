package shzeproject.interface_and_abstraction.rodent;

public abstract class Rodent {
    private Description description = new Description("Rodent.description");
    private Characteristic characteristic;

    public Rodent(Characteristic characteristic){
        System.out.println("Object Rodent is init ");
        this.characteristic = characteristic;
        this.characteristic.addRef();
    }
       
    public abstract void eat();

    public  abstract void sleep();

    public void getInformation(){
       System.out.println(characteristic.getRefCount());
    }
}
