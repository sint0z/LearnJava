package shzeproject.generics.exception;

import java.util.List;
import java.util.Random;

public class CustomProcessor implements Processor<Integer, Failure> {
    private static int count = 3;

    @Override
    public void process(List<Integer> list) throws Failure {
        Random random = new Random();
        if(count < 0){
            throw new Failure();
        }

        if(count == 0){
            list.add(0);
        }else {
            list.add(random.nextInt(1, 100));
        }

        count--;
    }
}
