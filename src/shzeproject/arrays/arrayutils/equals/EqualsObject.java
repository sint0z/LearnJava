package shzeproject.arrays.arrayutils.equals;

import java.util.Arrays;
import java.util.Random;

public class EqualsObject {
    private final int fieldInt;

    public EqualsObject(int fieldInt) {
        this.fieldInt = fieldInt;
    }

    public int getFieldInt() {
        return fieldInt;
    }
    /*
    * Т.к Arrays.equals() - проверяет массивы на основе содержимого (каждый элемент при помощи Object.equals(obj));
    * а два массива данных классов, без метода equals, но с идентичными значениями инициализации, не будут равны
    * */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof EqualsObject eo){
            return fieldInt == eo.getFieldInt();
        }

        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [" + fieldInt + "]";
    }

    public static void main(String[] args) {

        final int size = 4;
        EqualsObject[] equalsObjects1 = new EqualsObject[size];
        EqualsObject[] equalsObjects2 = new EqualsObject[size];

        Arrays.fill(equalsObjects1, new EqualsObject(10));
        Arrays.fill(equalsObjects2, new EqualsObject(10));

        System.out.println(Arrays.equals(equalsObjects1, equalsObjects2));

        int[][] arr1 = { {1, 2}, {3, 4} };
        int[][] arr2 = { {1, 2}, {3, 4} };
        System.out.println(Arrays.deepEquals(arr1, arr2)); // true
        System.out.println(Arrays.equals(arr1, arr2));     // false

    }
}
