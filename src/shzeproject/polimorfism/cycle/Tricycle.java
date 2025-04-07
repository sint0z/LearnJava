package shzeproject.polimorfism.cycle;

public class Tricycle extends Cycle{

    public Tricycle(String string) {
        super(string,0);
    }

    @Override
    protected int wheels() {
        return 13;
    }
    
}
