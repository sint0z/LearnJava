package shzeproject.access_control.protect;

public class ProtectedTest {

    public ProtectedTest() {
        System.out.println("I'm work");
    }

    
    protected void method(String string){
        if(string.length() > 4){
            System.out.println(string);
        }else{
            System.out.println("This string is very small");
        }
    }

    public static void main(String[] args) {
        ProtectedMainMethod method = ProtectedMainMethod.createMethod();
        int currentCount =  method.getCount();
        System.out.println("This is current count: " + currentCount);
        System.out.println(method.protect);
        method.setName("Igor");
    }
}
