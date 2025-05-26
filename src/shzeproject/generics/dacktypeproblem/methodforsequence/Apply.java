package shzeproject.generics.dacktypeproblem.methodforsequence;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method    ;

public class Apply {
    public static <T, S extends  Iterable<T>> void apply(S seq, Method method, Object ...arg){
        try {
            for(T element: seq){
                method.invoke(element, arg);
            }
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
