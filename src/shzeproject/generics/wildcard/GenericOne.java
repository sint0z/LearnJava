package shzeproject.generics.wildcard;

public class GenericOne<T> {

    void set(T item){
        System.out.println(item.getClass());
    }
}
