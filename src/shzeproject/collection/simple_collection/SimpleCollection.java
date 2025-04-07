package shzeproject.collection.simple_collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        for(int i = 0; i < 10; i++){
            c.add(new Random().nextInt(100));
        }

        for(Integer integer : c){
            System.out.println("{ " + integer+ " }");
        }
    }
}
