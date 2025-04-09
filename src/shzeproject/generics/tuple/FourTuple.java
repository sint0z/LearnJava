package shzeproject.generics.tuple;

public class FourTuple<A,B,C,D> extends ThreeTuple<A, B, C> {
    public final D obj;
    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        this.obj = d;
    }

    @Override
    public String toString() {
        return super.toString() + obj + " | ";
    }

}
