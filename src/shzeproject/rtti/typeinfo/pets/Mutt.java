package shzeproject.rtti.typeinfo.pets;

import shzeproject.rtti.typeinfo.Factory;

public class Mutt extends Dog {
    public Mutt() {
    }

  
    static class Factory implements Pet.Factory<Mutt>{

        @Override
        public Mutt create() {
            return new Mutt();
        }

    }
}
