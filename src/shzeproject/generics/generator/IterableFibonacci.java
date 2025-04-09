package shzeproject.generics.generator;

import java.util.Iterator;


/*
 *
 * По заданию, необходимо создать адаптер реализующий интерфейс {@link Iterable},
 * для раннее созданного класса {@link Fibonacci}, и при этом 
 * в классе использовать композицию, а не наследование, как указано в примере 
 * из книги.
 * 
 */
public class IterableFibonacci implements Iterable<Integer> {
    private final Fibonacci fibonacci = new Fibonacci();
    private int size;

    public IterableFibonacci(int size){
        this.size = size;
    }

    public IterableFibonacci() {
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            @Override
            public boolean hasNext() {
                return size > 0;
            }

            @Override
            public Integer next() {
                size--;
                return fibonacci.next();
            }
            
        };
    }

}
