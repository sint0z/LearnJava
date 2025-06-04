package shzeproject.arrays.generator;

import shzeproject.generics.generator.Generator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GeneratorTest {
    public static int size = 10;
    public static void test(Class<? extends IGenerators> surroundingClass){
        for(Class<?> type : surroundingClass.getClasses()){

            System.out.print(type.getSimpleName() + ": ");
            try {
                Generator<?> generator = (Generator<?>) type.getDeclaredConstructor().newInstance();
                for(int i = 0; i < size; i++){
                    System.out.printf(generator.next() + " ");
                }
                System.out.println();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        GeneratorTest.test(CountingGenerator.class);
        GeneratorTest.test(CRandomGenerator.class);


    }
}
