package shzeproject.arrays.arrayutils;

import shzeproject.Utils;
import shzeproject.arrays.arrayisobject.BerylliumSphere;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[2];
        BerylliumSphere[] temp = new BerylliumSphere[3];

        Arrays.fill(spheres, new BerylliumSphere());

        System.arraycopy(spheres, 0, temp, 0, spheres.length);

        System.out.println(Utils.arrayToString(spheres));
        System.out.println(Utils.arrayToString(temp));
        for (int i = 0; i < temp.length ; i++) {
            if(temp[i] == null){
                break;
            }

            if(temp[i].equals(spheres[i])){
                System.out.println("Элементы массивы идентичны (" + temp[i].toString() + " = " + spheres[i].toString() + ")" );
            }

        }
    }
}
