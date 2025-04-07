package shzeproject.interface_and_abstraction.factories.cast_emulation;

import java.util.Random;

public class Dice implements Throw{
    private final Random random = new Random();

    @Override
    public String getResult() {
        return String.valueOf(random.nextInt(6) + 1);
    }

   

    

}
