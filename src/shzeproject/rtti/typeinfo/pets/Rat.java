package shzeproject.rtti.typeinfo.pets;

import shzeproject.rtti.typeinfo.Factory;

public class Rat extends Rodent {

    static class Factory implements Pet.Factory<Rat>{

        @Override
        public Rat create() {
          return new Rat();
        }
    
    }

}
