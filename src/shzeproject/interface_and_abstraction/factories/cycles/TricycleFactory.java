package shzeproject.interface_and_abstraction.factories.cycles;

class TricycleFactory implements CycleFactory {

    @Override
    public Cycle createCycle() {
        return new Tricycle();
    }
}
