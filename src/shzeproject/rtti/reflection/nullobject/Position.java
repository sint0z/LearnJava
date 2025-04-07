package shzeproject.rtti.reflection.nullobject;

public class Position {
    private final String title;
    private Person person;

    public Position(String title, Person employer){
        this.title = title;
        this.person = employer != null ? employer : Person.NULL;
    }

    public Position(String title){
        this.title = title;
        this.person = Person.NULL;
    }

    public String getTitle(){
        return title;
    }

    public Person getPerson(){
        return person;
    }

    public void setPerson(Person employer){
        this.person = employer != null ? employer : Person.NULL;
    }
}

