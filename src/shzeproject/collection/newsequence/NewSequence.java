package shzeproject.collection.newsequence;

import java.util.ArrayList;
import java.util.Random;

import shzeproject.inner_class.sequence.Selector;

public class NewSequence {
    private ArrayList<Object> items = new ArrayList<>();
    
    public void add(Object o){
        items.add(o);
    }

    private class SequenceSelector implements Selector{
        private int iterator = 0;
        @Override
        public boolean end() {
            return items.indexOf(items.getLast()) == iterator;
        }

        @Override
        public Object current() {
            return items.get(iterator);
        }

        @Override
        public void next() {
           if(!end()) iterator++;
        }
    }

    public Selector getSelector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        NewSequence sequence = new NewSequence();
        for(int i = 0; i < 5; i++){
            sequence.add(i);
        }

        Selector selector = sequence.getSelector();
        selector.next();
        selector.next();
        selector.next();
        selector.next();
        selector.next();// По идее должен выбрасить Exception
        System.out.println(selector.current());
    }
}
