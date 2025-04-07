package shzeproject.rtti.typeinfo;

import java.util.List;
import shzeproject.rtti.typeinfo.pets.IPet;

public class Pets {
    private static final Creator<IPet> CREATOR = new RegFabricPetCreator();

    public static IPet randomPet(){
        return CREATOR.randomCreate();
    }

    public static List<IPet> createPetList(int size){
        return CREATOR.createObjectList(size);
    }

    public static IPet[] createPetArray(int size){
        return CREATOR.createObjectArray(size);
    }
}

