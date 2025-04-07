package shzeproject.inheritance;

import java.time.LocalTime;

public class C extends A{
    private B classB = new B("BE", LocalTime.now().toString());
    public C(String name) {
            super(name);
        }
    
        

    public static void main(String[] args) {
        C classC = new C("CI");
    }
}
