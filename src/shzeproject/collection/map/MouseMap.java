package shzeproject.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import shzeproject.collection.gerbil.Gerbil;

public class MouseMap {
    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<>();
        
        for(int i = 0; i < 10; i++){
            map.put("Gerbil" + i, new Gerbil(i));
        }


        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            map.get(it.next()).hop();
        }
    }
}
