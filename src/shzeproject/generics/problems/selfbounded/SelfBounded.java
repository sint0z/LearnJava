package shzeproject.generics.problems.selfbounded;

public class SelfBounded<T extends SelfBounded<T>>{
    T element;

    SelfBounded<T> set(T arg){
        element = arg;
        return this;
    }

    T getElement(){
        return element;
    }

    public static void main(String[] args) {
        SelfA a = new SelfA();
        a.set(new SelfA());


        SelfBounded<SelfA> sbSA = a.getElement();

        SelfB b = new SelfB();
        b.set(new SelfA());
    }
}


