package shzeproject.inner_class.inner_class_five;

public class UsingAnonimOneClass {
    public OneClass getOneClass(String string, int number){
        return new OneClass(string, number){
            @Override
            public void method(final String say){
                super.method(say);
            }
        };
    }

    public static void main(String[] args) {
        UsingAnonimOneClass anonimOneClass = new UsingAnonimOneClass();
        OneClass one = anonimOneClass.getOneClass("Pypa", 2);
        one.method("Hello WORLD");
    }
}
