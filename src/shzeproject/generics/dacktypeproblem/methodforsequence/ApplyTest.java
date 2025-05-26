package shzeproject.generics.dacktypeproblem.methodforsequence;

import shzeproject.rtti.typeinfo.pets.IPet;
import shzeproject.rtti.typeinfo.pets.Pet;

import java.util.ArrayList;
import java.util.List;

public class ApplyTest {
    public static void main(String[] args) throws NoSuchMethodException {
        List<IPet> pets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            pets.add(Pet.randomPet());
        }

        Apply.apply(pets, IPet.class.getMethod("speak"));
    }
}
