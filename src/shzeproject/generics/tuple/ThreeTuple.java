package shzeproject.generics.tuple;

public class ThreeTuple<A,B,C> extends TupleTwo<A,B> {
    public final C obj;
    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.obj = c;
    }

    @Override
    public String toString() {
        return super.toString() + obj + " | ";
    }


    
}
