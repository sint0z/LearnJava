package shzeproject.generics.ocean;

import java.util.Random;

import shzeproject.generics.generator.Generator;

public class LittleFish extends Fish{
    private static long counter = 0;
    private final long id = counter++;

    private  LittleFish() {
        super(new Random().nextInt(1,2));
    }

    public static Generator<LittleFish> generator = new Generator<LittleFish>() {

        public LittleFish next() {
            return new LittleFish();
        }
        
    };

    @Override
    public String toString() {
        return super.toString() + "[ " + id + " ]";
    }
    
}
