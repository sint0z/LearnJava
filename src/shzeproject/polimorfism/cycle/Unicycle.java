package shzeproject.polimorfism.cycle;

public class Unicycle extends Cycle {

    public Unicycle(String string) {
        super(string, 1);
    }
    public void balance(){
        System.out.println("Unicycle.balance()");
    }
}
