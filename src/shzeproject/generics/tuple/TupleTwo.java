package shzeproject.generics.tuple;

public class TupleTwo<A,B> {
    public final A obj1;
    public final B obj2;

    public TupleTwo(A a, B b){
        this.obj1 = a; 
        this.obj2 = b;
    }

    @Override
    public String toString() {
        return " | " + obj1 + " | " + obj2 + " | ";
    }

    

}
