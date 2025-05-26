package shzeproject.generics.dacktypeproblem.adapter;

import shzeproject.rtti.typeinfo.pets.Hamster;
import shzeproject.rtti.typeinfo.pets.IPet;
import shzeproject.rtti.typeinfo.pets.Manx;
import shzeproject.rtti.typeinfo.pets.Rat;

import java.util.ArrayList;
import java.util.List;

public class FillTest {
    public static void main(String[] args) {
        List<IPet> pets = new ArrayList<>();
        Fill.fill(new AddableCollectionAdapter<>(pets), Rat::new,3);
        Fill.fill(Adapter.collectionAdapter(pets), Manx.class, 5);

        for(IPet pet : pets){
            System.out.println(pet.getName());
        }

        SimpleQueueAdapter<IPet> adapter = new SimpleQueueAdapter<>();
        Fill.fill(adapter, Hamster.class, 5);

        System.out.println("\nAdapted object");
        for (IPet pet : adapter){
            System.out.println(pet.getName());
        }
    }
}
