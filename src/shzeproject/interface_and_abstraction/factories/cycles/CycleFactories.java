package shzeproject.interface_and_abstraction.factories.cycles;

public class CycleFactories {
    public static void cycleConsumer(CycleFactory factories){
        Cycle cycle = factories.createCycle();
        System.out.println(cycle.getClass().getSimpleName() + " -> " + cycle.wheels());
    }
    
    
    public static void main(String[] args) {
        cycleConsumer(new BicycleFactorys());
    }


}
