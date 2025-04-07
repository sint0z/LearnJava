package shzeproject.polimorfism.cycle;

public class Cycle {

    private final String name;
    private final int countWheels;

    public Cycle(String string, int countWheels){
        this.name = string;
        this.countWheels = countWheels;
    }
    
    protected int wheels(){ 
        return countWheels; 
    }

    protected void ride(){
        System.err.println("<"+ name +"> - ride | Wheels count - " + wheels());
    }
}
