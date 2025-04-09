package shzeproject.generics.tuple;

public class SixTuple<A,B,C,D,E,F> extends FiveTuple<A,B,C,D,E> {
    public final F obj;
    public SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        this.obj = f;
    }

    @Override
    public String toString() {
        return super.toString() + obj + " | ";
    }
}
