package shzeproject.inner_class.inner_class_seven;

public class Inherit {
    public class InheritInner extends WithInner.InnerClass{
        public InheritInner(WithInner wi){
            wi.super(1);
        }

    }

}
