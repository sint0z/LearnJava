package shzeproject.inner_class.trow_games;

import java.util.Random;

import shzeproject.interface_and_abstraction.factories.cast_emulation.Throw;
import shzeproject.interface_and_abstraction.factories.cast_emulation.ThrowFactory;

public class Coin implements Throw{
    private final Random random = new Random();
    private final String[] variation = {"Орел", "Решка"};
    public static final ThrowFactory THROW_FACTORY = new ThrowFactory() {
        @Override
        public Throw getThrow() {
           return new Coin();
        }
    };

    @Override
    public String getResult() {
        return variation[random.nextInt(2)];
    }

}
