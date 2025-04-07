package shzeproject.access_control.protect;

public class ProtectedMainMethod {

    private int cont;
    public String name = " ";
    protected int age;
    boolean protect;

    private ProtectedMainMethod(int startCount){
        this.cont = startCount;
    }

    public static ProtectedMainMethod createMethod(){
        return new ProtectedMainMethod(0);
    }

    protected int getCount(){
        return cont;
    }

    public void setName(String name){
        this.name = name;
        increment(cont);
    }

    private void increment(int num){
        if(num > -1){
            num++;
        }
    }
    public static void main(String[] args) {
        ProtectedTest test = new ProtectedTest();
        test.method("Method is done");

    }
}
