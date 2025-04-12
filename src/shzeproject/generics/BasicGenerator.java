package shzeproject.generics;

import java.lang.reflect.Constructor;
import shzeproject.generics.generator.Generator;

public class BasicGenerator<T> implements Generator<T> {
    private final Class<T> type;

    private BasicGenerator(Class<T> type){
        this.type = type;
    }

    @Override
    public T next() {
        try {
           Constructor<T> constructor = type.getDeclaredConstructor();
           return constructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<>(type);
    }
}
