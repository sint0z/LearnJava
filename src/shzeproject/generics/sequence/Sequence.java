package shzeproject.generics.sequence;


import shzeproject.inner_class.sequence.*;

// Данный класс был раннее реализован, теперь его необходиомо обобщить
public class Sequence<T> {
    private T[] items;
    private int next = 0;
    public void add(T o){
        if(next > items.length - 1){
            throw new ArrayIndexOutOfBoundsException("Size is little");
        }

        items[next++] = o;
    }
    public Sequence(int size){
        items = (T[]) new Object[size];
    }

    public class SequenceSelector implements Selector{

        private int iterator = 0;

        private SequenceSelector(){}

        @Override
        public boolean end() {
         return iterator == items.length;  
        }

        @Override
        public T current() {
            return items[iterator];
        }

        @Override
        public void next() {
          iterator++;
        }

        public Sequence<T> getOther(){
            System.out.println("Get Other Class");
            return Sequence.this;
        }
    }
    
    public Selector selector(){
        return new SequenceSelector();
    }

    public Selector reversSelector(){
        return new Selector() {
            private int iterator = items.length - 1;

            @Override
            public boolean end() {
              return iterator == 0;
            }

            @Override
            public T current() {
               return items[iterator];
            }

            @Override
            public void next() {
                if(!end()){
                    iterator--;
                }
            }
            
        };
    }

    public static void main(String[] args) {
        Sequence<OtherOne> sequence = new Sequence<>(5);

        for(int i = 0; i < 5; i++){
            sequence.add(new OtherOne("String #" + i));
        }

        Selector selector1 = sequence.selector();
        Selector selector2 = sequence.reversSelector();

        Sequence<OtherOne> sequence2 = ((Sequence<OtherOne>.SequenceSelector) selector1).getOther();
        System.out.println(sequence2.equals(sequence));

        selector1.next();
        System.out.println(selector1.current());

        System.out.println("\nРеверс селектор:");
        System.out.println(selector2.current());
        selector2.next();
        System.out.println(selector2.current());
        selector2.next();
        System.out.println(selector2.end());
        System.out.println(selector2.current());
    }
}
