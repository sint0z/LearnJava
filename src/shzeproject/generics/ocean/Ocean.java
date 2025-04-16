package shzeproject.generics.ocean;

import java.util.LinkedList;
import java.util.Queue;
import shzeproject.generics.Generators;

public class Ocean {

    public static void main(String[] args) {

        Queue<LittleFish> little = new LinkedList<>();
        Generators.fill(little, LittleFish.generator, 10);

        Queue<BigFish> big = new LinkedList<>();
        Generators.fill(big, BigFish.generator(), 5);

        while(!little.isEmpty()){

            LittleFish lFish = little.peek();
            BigFish bFish = big.peek();

            if(bFish.eat(lFish)){
                little.poll();
            }else{
                bFish = big.poll();
                bFish.clearStomach();
                big.add(bFish);
            }
        }
    }
}
