package shzeproject.generics;

import shzeproject.rtti.typeinfo.Pets;
import shzeproject.rtti.typeinfo.pets.IPet;

public class Holder<T> {
    private T obj;

    public boolean isNull(){
        return obj == null;
    }

    public void set(T obj){
        this.obj = obj;
    } 

    public T get(){
        if(isNull()){
            throw new NullPointerException("Object is not contains");
        }
        return obj;
    }

    public static void main(String[] args) {
        Holder<IPet> petContainer = new Holder<>();
        petContainer.set(Pets.randomPet());

        IPet pet = petContainer.get();
        System.out.println(pet.getName());
        
    }
}
