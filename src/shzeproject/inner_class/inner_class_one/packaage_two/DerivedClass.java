package shzeproject.inner_class.inner_class_one.packaage_two;

import shzeproject.inner_class.inner_class_one.OtherInterface;
import shzeproject.inner_class.inner_class_one.package_one.OtherClass;

public class DerivedClass extends OtherClass {
    public OtherInterface getInnerClass(){
        return new InnerClass();
    }

    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();
        OtherInterface oi = dc.getInnerClass();
        oi.method();
    }
}
