package shzeproject.rtti.typeinfo.pets;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import shzeproject.rtti.reflection.nullobject.Null;

public abstract class Pet implements IPet{
    public interface Factory<T> {
        T create();
    }
    
    private static final List<Factory<? extends IPet>> petFactories = new ArrayList<>();
    private static Random random = new Random();

    public Pet() {}

    static{
        petFactories.add(new Mutt.Factory());
        petFactories.add(new Manx.Factory());
        petFactories.add(new Hamster.Factory());
        petFactories.add(null);
    }

    public static IPet randomPet(){
        int randomNumber = random.nextInt(petFactories.size());
        return petFactories.get(randomNumber) != null ?
         petFactories.get(randomNumber).create() : Pet.newNullPet(Mouse.class);
    }


    public static List<Class<? extends IPet>> getClassPetsList(){
        return petFactories.stream()
                            .map(Pet.Factory::create)
                            .filter(Pet.class::isInstance)
                            .map(pet -> pet.getClass())
                            .collect(Collectors.toList());
                           
    }

    public static IPet newNullPet(Class<? extends IPet> type){
        return (IPet) Proxy.newProxyInstance(
            Pet.class.getClassLoader(), 
            new Class[] {IPet.class, Null.class},
            new NullPetProxyHandler(type));
    }    

    @Override
    public String getName(){
        return this.getClass().getSimpleName();
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++ ){
            System.out.println(Pet.randomPet());
        }
    }
}