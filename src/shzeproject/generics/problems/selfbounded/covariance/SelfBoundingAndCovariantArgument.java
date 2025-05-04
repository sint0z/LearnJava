package shzeproject.generics.problems.selfbounded.covariance;

public class SelfBoundingAndCovariantArgument {
    void setter(Setter s1, Setter s2, GenericSetter<Setter> gSetter){
        s1.set(s2);
        s2.set(s1);

       // s1.set(gSetter); не работает, т.к возвращаемый тип метода базового класса был переопределен
    }
}
