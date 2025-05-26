package shzeproject.generics.dacktypeproblem.adapter;

public class SimpleQueueAdapter<T> extends SimpleQueue<T> implements Addable<T>{

    @Override
    public void add(T element) {
        super.add(element);
    }
}
