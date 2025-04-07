package shzeproject.rtti;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import shzeproject.polimorfism.instrument.Guitar;

public class ObjectRecursion {
    public static void printClassHierarchy(Object obj) throws Exception{
        Class<?> clazz = obj.getClass();
        printClassHierarchyRecursive(clazz);
    }
    private static void printClassHierarchyRecursive(Class<?> clazz){
        if(clazz == null || clazz.equals(Object.class)){
            return;
        }
        
        System.out.println(clazz.getName());

        if(Modifier.isAbstract(clazz.getModifiers())){
            System.out.println("-> is Abstract");
        }else if(clazz.isInterface()){
            System.out.println("-> is Interface");
        }
      
        for(Field field : clazz.getDeclaredFields()){
            System.out.println("-> class field: " + field.getName());
        }

        printClassHierarchyRecursive(clazz.getSuperclass());

        for(Class<?> interfaze : clazz.getInterfaces()){
            System.out.println("Using interface: " + interfaze.getName());
        }
    }

    public static void main(String[] args) throws Exception {
        Guitar guitar = new Guitar();
        printClassHierarchy(guitar);
    
        Class<Integer> f = int.class; 
    }
}
