package shzeproject.arrays.returnarray;

import shzeproject.arrays.arrayisobject.BerylliumSphere;

public class ReturnArray {

    static BerylliumSphere[] createBerylliumSphereArray(int i){

        if(i < 0){
            throw new IllegalArgumentException();
        }

        BerylliumSphere[] spheres = new BerylliumSphere[i];
        for (int j = 0; j < i; j++) {
            spheres[j] = new BerylliumSphere();

        }

        return spheres;
    }
}
