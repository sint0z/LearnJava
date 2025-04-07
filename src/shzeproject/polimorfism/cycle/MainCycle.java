package shzeproject.polimorfism.cycle;

public class MainCycle {
    public static void convertMethod(Cycle cycle){
        cycle.ride();
    }
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle("Reiser");
        Bicycle bicycle = new Bicycle("Forward");
        Tricycle tricycle = new Tricycle("Stels");
        
        convertMethod(unicycle);
        convertMethod(bicycle);
        convertMethod(tricycle);


        Cycle[] cycles = {
            new Tricycle("3 cycle"),
            new Bicycle("2 cycle"),
            new Unicycle("1 cycle")
        };
        
           
        ((Bicycle)cycles[1]).balance(); 
        ((Unicycle)cycles[2]).balance(); 
    }

}
