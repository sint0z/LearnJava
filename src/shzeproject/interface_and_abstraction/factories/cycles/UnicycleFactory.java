package shzeproject.interface_and_abstraction.factories.cycles;

class UnicycleFactory implements CycleFactory{

    @Override
    public Cycle createCycle() {
       return new Unicycle();
    }
}
