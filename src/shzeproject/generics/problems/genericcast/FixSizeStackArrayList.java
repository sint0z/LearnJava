package shzeproject.generics.problems.genericcast;

import java.util.ArrayList;
import java.util.List;

// Реализация FixSizeStack, но используя List<T> вместо массива Object[]
public class FixSizeStackArrayList<T> {
    private final List<T> objects;
    private int index = 0;
    private final int capacity;

    FixSizeStackArrayList(int capacity){
        objects = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    public void push(T obj){
        if(index > capacity){
            throw new ArrayStoreException(index + " > " + capacity);
        }

        objects.add(obj);
        index++;
    }

    public T pop(){
        return index != 0 ? objects.get(--index) : null;
    }

    public int size(){
        return objects.size();
    }
}
