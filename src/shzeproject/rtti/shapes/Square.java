package shzeproject.rtti.shapes;

import java.util.Random;

public class Square extends Shape{

    @Override
    public void rotate() {
        Random random = new Random();
        
        System.out.printf("Rotate at (%d, %d)\n", random.nextInt(20), random.nextInt(20));
    }

}
