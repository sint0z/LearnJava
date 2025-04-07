package shzeproject.rtti.typeinfo.pets;

import shzeproject.rtti.typeinfo.Factory;

public class Hamster extends Rodent{

    static class Factory implements Pet.Factory<Hamster>{

        @Override
        public Hamster create() {
          return new Hamster();
        }
    
    }

}
