package shzeproject.polimorfism.cycle;

public class Bicycle extends Cycle{

    public Bicycle(String string){
        super(string,2);
    }

    public void balance(){
        System.out.println("Bicycle.balance()");
    }

}
