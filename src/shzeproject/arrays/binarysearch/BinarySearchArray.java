package shzeproject.arrays.binarysearch;

import shzeproject.arrays.arrayutils.equals.EqualsObject;
import shzeproject.arrays.generator.CRandomGenerator;
import shzeproject.arrays.generator.ConvertTo;
import shzeproject.arrays.generator.Generated;
import shzeproject.generics.generator.Generator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.random.RandomGenerator;

public class BinarySearchArray {

    public static void main(String[] args) {
        int[] array = ConvertTo.primitive(Generated.array(Integer.class, new CRandomGenerator.RGInteger(30), 19));
        System.out.println(Arrays.toString(array));

        int searchedIndex = Arrays.binarySearch(array, 10);
        System.out.println(Arrays.toString(array) + " -> " + searchedIndex);
        // [14, 5, 16, 22, 5, 10, 5, 0, 7, 14, 16, 18, 7, 6, 7, 14, 6, 1, 21] -> -10 - выдало что элемент 10 имеет индекс -10


        Integer[] objectIntegerArrays = Generated.array(new Integer[10], new CRandomGenerator.RGInteger(17));
        System.out.printf("\n[No sorted] Array Integer[10] -> %s\n", Arrays.toString(objectIntegerArrays));
        Arrays.sort(objectIntegerArrays, Comparator.reverseOrder());
        System.out.printf("[Sorted] Array Integer[10] -> %s\n", Arrays.toString(objectIntegerArrays));

        final Generator<EqualsObject> generator = new Generator<EqualsObject>() {
            private final Random random = new Random(10);

            @Override
            public EqualsObject next() {
                return new EqualsObject(random.nextInt(33));
            }
        };

        EqualsObject[] eo = Generated.array(new EqualsObject[10], generator);


        Comparator<EqualsObject> equalsObjectComparator = (o1, o2) -> {
            int fieldFO = o1.getFieldInt();
            int fieldSO = o2.getFieldInt();
            return Integer.compare(fieldFO, fieldSO);
        }; // Без Comparator - метод sort будет выдавать ошибку ClassCastException

        System.out.printf("\n[No sorted] array -> %s\n", Arrays.toString(eo));
        Arrays.sort(eo, equalsObjectComparator);
        System.out.printf("[Sorted] array -> %s\n", Arrays.toString(eo));

        System.out.println("[Searching start start...");
        while(true){
            int attempt = 1;
            EqualsObject object = generator.next();
            int index = Arrays.binarySearch(eo, object, equalsObjectComparator);
            System.out.println("[Searching] attempt " + attempt++);

            if(index >= 0){

                System.out.printf("[Searched] element <%s> index = {%d} in array %s", object, index, Arrays.toString(eo));
                break;
            }


            Map
        }
    }

}
