package shzeproject.generics.problems.selfbounded.covariance;

public interface GenericGetter <T extends GenericGetter<T>>{
    T get();
}
