package shzeproject.interface_and_abstraction.factories.cycles;

class BicycleFactorys implements CycleFactory {

    @Override
    public Cycle createCycle() {
       return new Bicycle();
    }
}
