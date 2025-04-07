package shzeproject.interface_and_abstraction.factories.cast_emulation;

import java.util.Random;

public class Coin implements Throw {
    private final Random random = new Random();
    private final String[] variation = {"Орел", "Решка"};

    @Override
    public String getResult() {
        return variation[random.nextInt(2)];
    }
    
}
