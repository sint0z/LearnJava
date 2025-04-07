package shzeproject.interface_and_abstraction.factories.cast_emulation;

public class DiceFactory implements ThrowFactory {

    @Override
    public Throw getThrow() {
        return new Dice();
    }

}
