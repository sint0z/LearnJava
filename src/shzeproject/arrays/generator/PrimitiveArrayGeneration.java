package shzeproject.arrays.generator;

import shzeproject.generics.limitgeneric.color.Solid;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class PrimitiveArrayGeneration {

    public static void main(String[] args) {
        final int size = 5;

        int[] ints = ConvertTo.primitive(Generated.array(Integer.class, new CRandomGenerator.RGInteger(), size));

        System.out.println("Array: int[] = " + Arrays.toString(ints));

    }
}
