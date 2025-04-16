package shzeproject.generics.ocean;

import java.util.Arrays;
import java.util.Random;
import shzeproject.generics.generator.*;

public class BigFish extends Fish{
    private static final Random random = new Random();
    private static long counter = 0;
    private final long id = counter++;
    private final Fish[] stomach;
    private int counterStomach = 0;
   

    private BigFish() {
        super(random.nextInt(5, 10));
        stomach = new Fish[size - 2];
    }

    public static Generator<BigFish> generator(){
        return () -> new BigFish();
    }

    public void clearStomach(){
        Arrays.fill(stomach, null);
        counterStomach = 0;
    }

    public boolean eat(Fish fish){
        if (fish instanceof LittleFish && counterStomach < stomach.length){
            stomach[counterStomach] = fish;
            counterStomach++;
            System.out.println("Рыба: " + this + " съела: " + fish);
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "[ " + id + " ]";
    }
}
