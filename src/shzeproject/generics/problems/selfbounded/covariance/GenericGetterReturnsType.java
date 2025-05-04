package shzeproject.generics.problems.selfbounded.covariance;

public class GenericGetterReturnsType{
    void getter(Getter g){
        Getter getter = g.get();
        GenericGetter<Getter> gg = g.get();
    }
}
