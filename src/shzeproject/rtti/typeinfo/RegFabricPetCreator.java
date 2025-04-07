package shzeproject.rtti.typeinfo;

import shzeproject.rtti.typeinfo.pets.IPet;
import shzeproject.rtti.typeinfo.pets.Pet;

public class RegFabricPetCreator implements Creator<IPet>{

    @Override
    public IPet randomCreate() {
        return Pet.randomPet();
    }

    @Override
    public IPet[] createObjectArray(int size) {
        IPet[] pets = new IPet[size];
        for(int i = 0; i < size; i++){
            pets[i] = randomCreate();
        }
        return pets;
    }
}
