package shzeproject.collection.no_use_generic;

public class Apple {
    private static long counter;
    private final long id = counter++;
    public long getId(){
        return id;
    }
}
