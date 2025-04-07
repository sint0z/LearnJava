package shzeproject.inner_class.interface_and_innerclass;

class DerivedClass implements InnerInterface {

    @Override
    public int getNumber() {
        return 10;
    }

    
    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();
        
        int a = InnerInterface.InnerClass.getInt(dc);
        System.out.println(a);
    }
}
