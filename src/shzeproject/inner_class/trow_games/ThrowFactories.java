package shzeproject.inner_class.trow_games;

import shzeproject.interface_and_abstraction.factories.cast_emulation.Throw;
import shzeproject.interface_and_abstraction.factories.cast_emulation.ThrowFactory;

public class ThrowFactories {
    public static void emulate(ThrowFactory factory){
        Throw thr = factory.getThrow();
        System.out.println(thr.getClass().getSimpleName() + ": Result -> " + thr.getResult());
    }

    public static void main(String[] args) {
        emulate(Coin.THROW_FACTORY);
        emulate(Dice.THROW_FACTORY);
    }
}
