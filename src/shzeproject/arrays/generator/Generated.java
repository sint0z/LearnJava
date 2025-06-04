package shzeproject.arrays.generator;

import shzeproject.generics.generator.Generator;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;

public interface Generated {
    private static <T> Collection<T> generateDataCollection(Generator<T> gen, int size){
        Collection<T> tempCollection = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            tempCollection.add(gen.next());
        }
        return tempCollection;
    }

    static <T> T[] array(T[] array, Generator<T> gen){
        return generateDataCollection(gen, array.length).toArray(array);
    }

    @SuppressWarnings("unchecked")
    static <T> T[] array(Class<T> marker, Generator<T> gen, int size){
        T[] array = (T[])Array.newInstance(marker, size);
        return array(array, gen);
    }

}
