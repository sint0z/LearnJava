package shzeproject.rtti.typeinfo.pets;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PetTwo {
    static List<Class<? extends Pet>> petClazzes = new ArrayList<>();
    private static final Random random = new Random(); 

    static{
        petClazzes.add(Mutt.class);
        petClazzes.add(Mouse.class);
    }

    public static Pet randomPet(){
        int randomNumber = random.nextInt(petClazzes.size());
        Class<? extends Pet> clazz = petClazzes.get(randomNumber);
        try{
            Constructor<? extends Pet> constructor = clazz.getDeclaredConstructor();
            return constructor.newInstance(); 
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
