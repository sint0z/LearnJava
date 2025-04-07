package shzeproject.rtti.typeinfo;

import java.util.ArrayList;
import java.util.List;
import shzeproject.rtti.typeinfo.pets.Pet;

public class ForNameCreator extends PetCreator {
    private static final String MAIN_PACKAGE = "shzeproject.rtti.";
    private static final List<Class<? extends Pet>> types = new ArrayList<>();

    private static final String[] TYPE_NAME = {
        "typeinfo.pets.Mutt",
        "typeinfo.pets.Pug",
        "typeinfo.pets.Manx",
        "typeinfo.pets.Cymric",
        "typeinfo.pets.Rat",
        "typeinfo.pets.Mouse",
        "typeinfo.pets.Hamster"
    };


    private static void loader(){
       try {
           for(String name: TYPE_NAME){
                types.add(Class.forName(MAIN_PACKAGE + name).asSubclass(Pet.class));
           }
       } catch (ClassNotFoundException e) { 
            throw new RuntimeException(e);
       } 
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

    static {
        loader();
    }

}
