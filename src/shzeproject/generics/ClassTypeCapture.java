package shzeproject.generics;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ClassTypeCapture{
    private final Map<String, Class<?>> types = new HashMap<>();

    public ClassTypeCapture(){

    }

    public void addType(String className, Class<?> clazz){
        types.put(className, clazz);
    }


    public <C> C create(String className, Class<C> castClass) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        return castClass.cast(create(className));
    }


    public Object create(String className) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> clazz = types.get(className);
    
        if(clazz == null){
            throw new IllegalArgumentException("Запрашиваемый класс отсутствует");
        }

        Constructor<?> constructor = clazz.getDeclaredConstructor();
        return constructor.newInstance();
    }
    

    public static void main(String[] args) {
        ClassTypeCapture capture = new ClassTypeCapture();
        capture.addType("test", Test.class);
        try {
            Object obj = capture.create("test");
            System.out.println("Class 1 -> " +  obj.getClass().getName());
            
            Test obj2 = capture.create("test", Test.class);
            System.out.println("Class 2 -> " +  obj.getClass().getName());

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
