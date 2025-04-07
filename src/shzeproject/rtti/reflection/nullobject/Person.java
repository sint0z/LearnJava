package shzeproject.rtti.reflection.nullobject;

public class Person {

    
    private final String firstName;
    private final String lastName;
    private final String address;
    private final int age;
    
    public Person(String first, String last, String address, int age){
        this.firstName = first;
        this.lastName = last;
        this.address = address;
        this.age = age;
    }

    public static class NullPerson extends Person implements Null{

        private NullPerson() {
            super("Null", "Null", "Null", 0);
        }
        
    }

    public static final Person NULL = new NullPerson();
}
