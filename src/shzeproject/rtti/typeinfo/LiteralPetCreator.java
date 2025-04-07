package shzeproject.rtti.typeinfo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import shzeproject.rtti.typeinfo.pets.*;
import shzeproject.rtti.typeinfo.pets.Dog;

public class LiteralPetCreator extends PetCreator {
    
    public static final List<Class<? extends Pet>> allTypes = Collections.unmodifiableList(
        Arrays.<Class<? extends Pet>>asList(
            Pet.class, Dog.class, Cat.class, Rodent.class,
            Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
            Cymric.class, Rat.class, Mouse.class, Hamster.class
        )
    );

    
    private static final List<Class<? extends Pet>> types = 
        allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }

}
