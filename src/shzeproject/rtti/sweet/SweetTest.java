package shzeproject.rtti.sweet;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class SweetTest {
    public static void main(String[] args)  {
        if(args.length < 1){
            System.out.println(Arrays.toString(args));
            System.out.println("Вы не передали аргументы");
            System.exit(0);
            
        }
        

        Sweet sweets = null;
        try {
            Class<?> clazz = Class.forName("shzeproject.rtti.sweet." + args[0]);
            Constructor<?> constructor = clazz.getDeclaredConstructor();

            sweets = ((Sweet) constructor.newInstance());
        } catch (Exception e) {
        }
        
        if(sweets != null){
            System.out.println(sweets.getClass().getSimpleName());
        }
    }
}
