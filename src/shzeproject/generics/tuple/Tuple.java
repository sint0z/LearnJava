package shzeproject.generics.tuple;

public class Tuple {
    public static <A,B> TupleTwo<A,B> tuple(A objA,B objB){
        return new TupleTwo<>(objA, objB);
    }

    public static <A,B,C> ThreeTuple<A,B,C> tuple(A objA, B objB,C objC){
        return new ThreeTuple<>(objA, objB, objC);
    }

    public static <A,B,C,D> FourTuple<A,B,C,D> tuple(A objA, B objB, C objC, D objD){
        return new FourTuple<>(objA, objB, objC, objD);
    }

    
    public static <A,B,C,D,E> FiveTuple<A,B,C,D,E> tuple(A objA, B objB,C objC, D objD, E objE){
        return new FiveTuple<>(objA, objB, objC, objD, objE);
    }

    
    public static <A,B,C,D,E,F> SixTuple<A,B,C,D,E,F> tuple(A objA, B objB,C objC, D objD, E objE, F obF){
        return new SixTuple<>(objA, objB, objC, objD, objE, obF);
    }
}
