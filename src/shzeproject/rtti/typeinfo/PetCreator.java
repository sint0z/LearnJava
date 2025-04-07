package shzeproject.rtti.typeinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import shzeproject.rtti.typeinfo.pets.Pet;

public abstract class PetCreator implements Creator<Pet> {
    private final Random random = new Random();

    public abstract List<Class<? extends Pet>> types();

    @Override
    public Pet randomCreate(){
        int i = random.nextInt(types().size());
        Pet pet = null;
        
        try {
            Constructor<? extends Pet> constructor =  types().get(i).getDeclaredConstructor();
            pet = constructor.newInstance();
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException  
                | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        if(pet == null){
            throw new NullPointerException("Животное не смогло сгенерироваться");
        }
        return pet;
    }

    @Override
    public Pet[] createObjectArray(int size) {
        Pet[] pets = new Pet[size];
        for(int i = 0; i < size; i++){
            pets[i] = randomCreate();
        }
        return pets;
    }
}
