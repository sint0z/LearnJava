package shzeproject;

import java.util.ArrayList;
import java.util.List;

public interface Utils {
   static List<Integer> range(int start, int stop, int step){
       List<Integer> temp_list = new ArrayList<>(stop);

       for(int i = start; i < stop; i+=step){
           temp_list.add(i);
       }

       return List.copyOf(temp_list);
   }

   static List<Integer> range(int start, int stop){
       return range(start, stop, 1);
   }

   static List<Integer> range(int bound){
       return range(0, bound, 1);
   }
}
