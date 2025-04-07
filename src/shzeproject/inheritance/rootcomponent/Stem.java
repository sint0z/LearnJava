package shzeproject.inheritance.rootcomponent;

public class Stem extends Root{
    Component1 component1 = new Component1();
    Component2 component2 = new Component2();
    Component3 component3 = new Component3();

    public Stem(){
        System.out.println("Stem object is ready");
    }

    @Override
    public void dispose() {
        System.out.println("Stem is dispose");
        component3.dispose();
        component2.dispose();
        component1.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Stem stem = new Stem();

        try {
            
        } finally {
            stem.dispose();
        }
    }
}
