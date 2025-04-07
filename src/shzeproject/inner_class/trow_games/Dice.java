package shzeproject.inner_class.trow_games;

import java.util.Random;
import shzeproject.interface_and_abstraction.factories.cast_emulation.Throw;
import shzeproject.interface_and_abstraction.factories.cast_emulation.ThrowFactory;

public class Dice implements Throw{
    public static final ThrowFactory THROW_FACTORY = Dice::new;
    private final Random random = new Random();

    @Override
    public String getResult() {
        return String.valueOf(random.nextInt(6) + 1);
    }

   

    

}
