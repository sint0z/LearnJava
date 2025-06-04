package shzeproject.arrays.generator;

import shzeproject.generics.generator.Generator;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        //Автоупаковка для массивов не работает
        //int[] ints = new Integer[10];

        double[] doubles = ConvertTo.primitive(Generated.array(Double.class, new CountingGenerator.GDouble(), 10));
        System.out.println("Double array = " + Arrays.toString(doubles));

       Generator<Character> gen = new  CountingGenerator.GCharacter();
       StringBuilder  builder = new StringBuilder();
        for (int i = 0; i < 5 ; i++) {
            builder.append(gen.next());
        }
        String result = builder.toString();
        System.out.println("GCharacter to String = " + result);
    }
}
