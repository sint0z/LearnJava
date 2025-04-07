package shzeproject.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Statistic {

    public static void test(Map<Integer,Integer> map, int test){

        int maxFrequency = 0;
        int mostFrequentNumber = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentNumber = entry.getKey();
            }
        }

        System.out.println("В тесте " + (test + 1) + ":");
        System.out.println("Число, которое генерируется чаще других: " + mostFrequentNumber);
        System.out.println("Его частота: " + maxFrequency);
        System.out.println();
        
    }
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<>();
        for(int number = 0; number < 10; number++ ){
            for(int i = 0; i < 1000000; i++){
                int r = random.nextInt(20);
                Integer freq = map.get(r);
                map.put(r, map.getOrDefault(freq, 0) + 1);

            }
            test(map, number);
        }
    }
}
