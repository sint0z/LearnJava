package shzeproject.inner_class.interface_and_innerclass;

public interface InnerInterface {

    public int getNumber();
    class InnerClass{
        public void method(){
            System.out.println("Inner class in Interface");
        }

        public static int getInt(InnerInterface impl){
            return impl.getNumber();
        }
    }
}
