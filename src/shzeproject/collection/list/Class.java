package shzeproject.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Class {
    private static long counter;
    private final long id = counter++; 

    @Override
    public String toString() {
        return "New Class.id(" + id + ")";
    }

    
    public static void main(String[] args) {
        Class[] classes = new Class[10];

        for (int i = 0; i < classes.length; i++) {
            classes[i] = new Class();
            System.out.print(classes[i] + " | ");
        }  
        System.out.println(" ");

        List<Class> classesList =  Arrays.asList(classes);
        List<Class> subClassesList = classesList.subList(4, 6);
        System.out.println(classesList);
        System.out.println(subClassesList + "\n");

        List<Class> temp = new ArrayList<>();
        for(Class cl : classesList){
            if(!subClassesList.contains(cl)){
               temp.add(cl); 
            }
        }


        classesList = temp;

        System.out.println(classesList);
        System.out.println(subClassesList);
    }
}
