package shzeproject.polimorfism.two_method;

public class BaseClass {
    public void methodOne(){
        System.out.println("BaseClass.methodOne()");
        methodTwo();
    }

    public void methodTwo(){
        System.out.println("BaseClass.methodTwo()");
    }
}
