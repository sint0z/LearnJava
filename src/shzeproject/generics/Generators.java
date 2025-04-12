package shzeproject.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import shzeproject.generics.generator.Generator;
import shzeproject.generics.generator.Fibonacci;

public class Generators {
   /*  public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int size){
        for(int i = 0; i < size; i++){
            coll.add(gen.next());
        }

        return coll;
    } */


    public static <T, C extends Collection<T>> C fill(C coll, Generator<T> gen, int size){

        for(int i = 0; i < size; i++){
            coll.add(gen.next());
        }
        
        return coll;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = fill(new ArrayList<>(), new Fibonacci(),5);
        List<Integer> list2 = fill(new LinkedList<>(), new Fibonacci(), 5);

        /* 
         * С методом, который сохраняет конкретный тип коллекции (C extends Collection<T>), 
         * мы сможем различать List и LinkedList в том смысле, что метод будет возвращать тот же тип коллекции,
         * который был передан в качестве аргумента. 
         */
        LinkedList<Integer> ll = (LinkedList<Integer>) list2;
        System.out.println(ll);
    }
}
