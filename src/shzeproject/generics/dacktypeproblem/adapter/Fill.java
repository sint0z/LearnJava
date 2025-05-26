package shzeproject.generics.dacktypeproblem.adapter;

import shzeproject.Utils;
import shzeproject.generics.generator.Generator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Fill {

    public static void wrongSize(int size){if(size < 0){
        throw new RuntimeException("This size %d < 0".formatted(size));
    }}

    public static <T> void fill(Addable<T> addable, Class<? extends T> markerType, int size){
        wrongSize(size);

        for(int i = 0; i < size; i++){
            try{
                Constructor<? extends T> constructor = markerType.getDeclaredConstructor();
                addable.add(constructor.newInstance());
            }catch (NoSuchMethodException | InvocationTargetException
                    | InstantiationException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static <T> void fill(Addable<T> addable, Generator<T> generator, int size){
        wrongSize(size);

        for(int i : Utils.range(size)){
            addable.add(generator.next());
        }
    }
}
