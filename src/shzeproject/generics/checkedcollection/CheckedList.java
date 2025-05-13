package shzeproject.generics.checkedcollection;

import shzeproject.rtti.typeinfo.pets.Dog;
import shzeproject.rtti.typeinfo.pets.Hamster;
import shzeproject.rtti.typeinfo.pets.Pet;
import shzeproject.rtti.typeinfo.pets.Pug;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CheckedList {

    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List dogs){
        dogs.add(new Pug());
    }

    public static void main(String[] args) {
        List<Hamster> hamsters = new ArrayList<>();
        oldStyleMethod(hamsters); // Не выдает возражений

        List<Hamster> hamstersChecked = Collections.checkedList(new ArrayList<>(), Hamster.class);
        try {
            oldStyleMethod(hamstersChecked); // Возбуждает исключение
        }catch (ClassCastException ex){
            ex.printStackTrace(System.out);
        }

        List<Pet> pets = Collections.checkedList(new ArrayList<>(), Pet.class);
        // Работает нормально с производными типами
        pets.add(new Hamster());
        pets.add(new Pug());

        // Работает нормально
        oldStyleMethod(pets);
    }
}

