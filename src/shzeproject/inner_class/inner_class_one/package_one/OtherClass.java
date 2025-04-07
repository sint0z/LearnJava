package shzeproject.inner_class.inner_class_one.package_one;

import shzeproject.inner_class.inner_class_one.OtherInterface;

public class OtherClass {
    protected class InnerClass implements OtherInterface{

        public InnerClass(){}
        @Override
        public void method() {
            System.out.println("This is protected Inner method");
        }

    }
}
