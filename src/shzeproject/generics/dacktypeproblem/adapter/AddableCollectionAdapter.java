package shzeproject.generics.dacktypeproblem.adapter;

import java.util.Collection;

public class AddableCollectionAdapter<T> implements Addable<T>{
    Collection<T> collection;

    public AddableCollectionAdapter(Collection<T> collection) {
        this.collection = collection;
    }

    @Override
    public void add(T element) {
        collection.add(element);
    }
}
