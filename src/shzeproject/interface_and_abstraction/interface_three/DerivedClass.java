package shzeproject.interface_and_abstraction.interface_three;

public class DerivedClass extends AbstractClass implements SuperDerivedInterface {

    @Override
    public void firstFirstInterfaceMethod() {
        System.out.println("1_1");
    }

    @Override
    public void secondFirstInterfaceMethod() {
        System.out.println("1_2");
    }

    @Override
    public void firstSecondInterfaceMethod() {
        System.out.println("2_1");
    }

    @Override
    public void secondSecondInterfaceMethod() {
        System.out.println("2_2");
        
    }

    @Override
    public void firstThirdInterfaceMethod() {
        System.out.println("3_1");
    }

    @Override
    public void secondThirdInterfaceMethod() {
        System.out.println("3_2");
    }

    @Override
    public void superDerivedInterfaceMethod() {
       System.out.println("SUPER");
    }

    @Override
    public void abstractMethod() {
        System.out.println("ABSTRACT");
    }

    static void method1(FirstInterface f1){ f1.firstFirstInterfaceMethod();}
    static void method2(SecondInterface f2){ f2.firstSecondInterfaceMethod();}
    static void method3(ThirdInterface f3){ f3.firstThirdInterfaceMethod();}
    static void method4(SuperDerivedInterface sdi){
        sdi.superDerivedInterfaceMethod();
        sdi.firstFirstInterfaceMethod();
    }

    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        method1(derivedClass);
        method2(derivedClass);
        method3(derivedClass);
        method4(derivedClass);
        System.out.println(derivedClass.inc());
    }

}
