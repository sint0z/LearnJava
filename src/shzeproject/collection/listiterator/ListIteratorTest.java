package shzeproject.collection.listiterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i + new Random().nextInt(5));
        }

        System.out.println("Main List (1) -> " + list + " | " + list.size());

        List<Integer> subList = new ArrayList<>(list.size());
        
        System.out.println("Sub (1) -> " + subList + " | " + subList.size());

        ListIterator<Integer> lit = list.listIterator(list.size());
            while(lit.hasPrevious()){
                subList.add(lit.previous());
            }

        System.out.println("Sub (2) -> " + subList);

        LinkedList<Integer> linkedList = new LinkedList<>();
       
        Random random = new Random();
        linkedList.add(111);
        linkedList.add(111);

        for(int i = 2; i < 10; i++){
            ListIterator<Integer> listIterator = linkedList.listIterator();

            int middleIndex = linkedList.size() / 2;
            for(int j = 0; j < middleIndex; j++){
                listIterator.next();
            }

            listIterator.add(random.nextInt(100));
        }

        System.out.println("LinkedList<Integer> = " + linkedList);
    }
}
