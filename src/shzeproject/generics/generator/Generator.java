package shzeproject.generics.generator;

@FunctionalInterface
public interface Generator<T> {
    T next();
}
