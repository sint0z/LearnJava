package shzeproject.inheritance.rootcomponent;

public class Root {
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public Root(){
        System.out.println("Root object is ready");
    }

    public void dispose(){
        component3.dispose();
        component2.dispose();
        component3.dispose();
        System.out.println("Root is dispose");
    }

}
