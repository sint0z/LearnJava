package shzeproject.generics.tuple;

public class FiveTuple<A,B,C,D,E> extends FourTuple<A,B,C,D> {
    public final E obj;
    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        this.obj = e;
    }

    @Override
    public String toString() {
        return super.toString() + obj + " | ";
    }

}
