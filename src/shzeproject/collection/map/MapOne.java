package shzeproject.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

public class MapOne {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        for(int i = 0; i < 10; i++){
            map.put( "#" + String.valueOf(new Random().nextInt(20)), String.valueOf(i));
        }
        System.out.println("Hash Map: ");
        map.forEach((k,v) -> System.out.println("Key: + " + k + ", Value: " + v));
        
        List<String> list = new ArrayList<>();
        for (String key : map.keySet()){
            list.add(key);
        }
        
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

        LinkedHashMap<String, String> lhmaop = new LinkedHashMap<>();
        for (String key : list){
            if(map.containsKey(key)){
                lhmaop.put(key, map.get(key));
            }
        }

        System.out.println("\nLinkedHashMap");
        lhmaop.forEach((k,v) -> System.out.println("Key: + " + k + ", Value: " + v));

    }
}
