package shzeproject.operators;

import java.util.Random;

public class TossCoin {

    public static void main(String[] args) {
        
        Random random = new Random(47);

        System.out.println("Бросаеться монета:");
        
        int result = random.nextInt(2);

        System.out.println("Выпал Орел: " + (result == 1));
        System.out.println("Выпала Решка: " + (result == 2));
    }
}
