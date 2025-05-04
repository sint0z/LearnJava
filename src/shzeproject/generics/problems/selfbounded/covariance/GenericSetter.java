package shzeproject.generics.problems.selfbounded.covariance;

public interface GenericSetter<T extends  GenericSetter<T>> {
    void set(T arg);
}
