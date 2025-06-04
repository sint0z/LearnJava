package shzeproject;

import java.util.*;

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

   static List<Map.Entry<Integer, Object>> enumerate(List<Object> list){
       List<Map.Entry<Integer, Object>> result = new ArrayList<>();

       for (int i = 0; i < list.size(); i++){
           result.add(new AbstractMap.SimpleImmutableEntry<>(i, list.get(i)));
       }
       return result;
   }


   static String matrixToString(Object[][] array){
       StringBuilder builder = new StringBuilder("[");
       boolean isFirst = true;
       for(Object[] objects : array){
           for (Object obj: objects){
               if (!isFirst) {
                   builder.append(", ");
               }

               if(obj != null){
                   builder.append(obj.toString());
               }else{
                   builder.append("null");
               }

               isFirst = false;
           }
           isFirst = true;
           builder.append(",\n");
       }
       builder.delete(builder.length() -2 ,builder.length());
       builder.append("]");
       return builder.toString();
   }


   static String arrayToString(Object[] array){
       StringBuilder builder = new StringBuilder("[");
       boolean isFirst = true;
       for (Object object : array) {
           if (!isFirst) {
               builder.append(", ");
           }

           if(object != null){
               builder.append(object.toString());
           }else{
               builder.append("null");
           }

           isFirst = false;
       }
       builder.append("]");

       return builder.toString();
   }

}
