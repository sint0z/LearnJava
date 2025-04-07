package shzeproject.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListFeature {
    public static List<Integer> randomListInteger(final int size){
        List<Integer> tempList = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            tempList.add(random.nextInt(100)); 
        }

        return tempList;
    }

    public static void main(String[] args) {
        
        List<Integer> list = randomListInteger(7);
        System.out.println("1: " + list);

        Integer integer = 47;

        list.add(integer);
        System.out.println("2: " + list);
        System.out.println("3: " + list.contains(integer));

        list.remove(integer);
        Integer integer1 = list.get(2);
        System.out.println("4: " + integer1 + " | " + list.indexOf(integer1));

        System.out.println("5: " + list.remove(integer1));
        System.out.println("6: " + list);

        list.add(3, 616);
        System.out.println("7: " + list);

        List<Integer> subList = list.subList(2, 5);
        System.out.println("8: Частичный список: \n" + subList);
        System.out.println("9: " + list.containsAll(subList));

        Collections.sort(subList);
        System.out.println("10: Частичный список после сортировки: \n" + subList);
        System.out.println("11: " + list.containsAll(subList));

    }
}
