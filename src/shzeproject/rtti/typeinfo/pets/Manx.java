package shzeproject.rtti.typeinfo.pets;

import shzeproject.rtti.typeinfo.Factory;

public class Manx extends Cat {

    static class Factory implements Pet.Factory<Manx>{

        @Override
        public Manx create() {
          return new Manx();
        }
    
    }

}
