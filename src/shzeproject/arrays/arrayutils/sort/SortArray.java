package shzeproject.arrays.arrayutils.sort;

import shzeproject.arrays.arrayisobject.BerylliumSphere;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class SortArray {

    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[4];
        for(int i = 0; i < spheres.length; i++){
            spheres[i] = new BerylliumSphere();
        }

        System.out.println("Sorted");
        System.out.printf("Array after sort: %s \n", Arrays.toString(spheres));
        Arrays.sort(spheres);
        System.out.printf("Array before sort: %s \n", Arrays.toString(spheres));

        System.out.println("\nReverse sorted:");
        Comparator<BerylliumSphere> reverseComparator = Comparator.reverseOrder();
        System.out.printf("Array after sort: %s \n", Arrays.toString(spheres));
        Arrays.sort(spheres, reverseComparator);
        System.out.printf("Array before sort: %s \n", Arrays.toString(spheres));

    }
}
