package shzeproject.generics.dacktypeproblem.methodforsequence;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class FilledList<T> extends ArrayList<T> {
    public FilledList(Class<? extends T> type, int size){
        try {
            for (int i = 0; i < size; i++){
                Constructor<? extends T> constructor = type.getDeclaredConstructor();
                add(constructor.newInstance());
            }
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
