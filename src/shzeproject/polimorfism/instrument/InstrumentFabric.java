package shzeproject.polimorfism.instrument;

import java.util.Random;

public class InstrumentFabric {
    private final Random random = new Random(47);

    public Instrument next(){
        return switch(random.nextInt(5)){
            case 0 -> new Stringer();
            case 1 -> new Guitar();
            case 3 -> new Percussion();
            case 4 -> new Wind();
            default -> new Instrument();
        };
    }

}
