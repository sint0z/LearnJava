package shzeproject.rtti.typeinfo;

import java.util.List;
import shzeproject.rtti.typeinfo.pets.Pet;

public class Pets {
    private static final Creator<Pet> CREATOR = new RegFabricPetCreator();

    public static Pet randomPet(){
        return CREATOR.randomCreate();
    }

    public static List<Pet> createPetList(int size){
        return CREATOR.createObjectList(size);
    }

    public static Pet[] createPetArray(int size){
        return CREATOR.createObjectArray(size);
    }
}

