package shzeproject.interface_and_abstraction.interfase_two;

public class MyClass implements ThirdInterface {

    @Override
    public void firstDerivedMethod() {
        System.out.println("MyClass.firstDerivedMethod()");
    }

    @Override
    public void baseMethod() {
        System.out.println("MyClass.baseMethod()");
    }

    @Override
    public void secondDerivedMethod() {
        System.out.println("MyClass.secindDerivedMethod()");
    }

    @Override
    public void thirdMethod() {
        System.out.println("MyClass.thirdMethod()");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.thirdMethod();
        myClass.secondDerivedMethod();
    }
}
