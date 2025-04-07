package shzeproject.interface_and_abstraction.abstract_three;

public class MainAnbsClass {
    public static BaseAbstractClass getBaseClassInstance(){
        return new ChildAbstractBaseClass();
    }
    public static void main(String[] args) {
        BaseAbstractClass base = getBaseClassInstance();
        base.print();
    }
}
