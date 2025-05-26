package shzeproject.generics.dacktypeproblem.adapter;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// This class is another collection container
public class SimpleQueue<T> implements Iterable<T> {

    private final Queue<T> storage = new LinkedList<>();

    public void add(T element){
        storage.offer(element);
    }

    public T get(){
        return !storage.isEmpty() ? storage.poll() : null;
    }

    @Override
    public Iterator<T> iterator() {
        return storage.iterator();
    }
}
