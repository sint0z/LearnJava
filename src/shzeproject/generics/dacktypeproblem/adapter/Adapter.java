package shzeproject.generics.dacktypeproblem.adapter;

import java.util.Collection;

public class Adapter {
    public static  <T> Addable<T> collectionAdapter(Collection<T> collection){
        return new AddableCollectionAdapter<>(collection);
    }
}
