package shzeproject.collection.newsequence;

import java.util.Iterator;

public class SequenceIterator {
    private Object[] items;
    private int size = 0;

    public void add(Object o){
        if(size < items.length){
            items[size++] = o;
            
        }
    }

    public SequenceIterator(int size){
        items = new Object[size];
    }

    public Iterator<Object> iterator(){
        return new Iterator<Object>() {
            private int iterator = 0;

            private boolean isEnd(){
                return iterator >= items.length;
            }

            @Override
            public boolean hasNext() {
                return isEnd() || items[iterator] != null;
            }

            @Override
            public Object next() {
               return items[iterator++];
            }
            
        };
    }


    public static void main(String[] args) {
        SequenceIterator sequence = new SequenceIterator(10);
        for(int i = 0; i < 5; i++){
            sequence.add(i);
        }

        Iterator<Object> iterator = sequence.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            
        }
    }
}
