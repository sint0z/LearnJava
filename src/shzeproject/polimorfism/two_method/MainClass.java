package shzeproject.polimorfism.two_method;

public class MainClass {
  public static void main(String[] args) {
    DerivedClass cls = new DerivedClass();
    cls.methodOne();
    System.out.println("---------------------------");
    cls.methodTwo();
  }
}
