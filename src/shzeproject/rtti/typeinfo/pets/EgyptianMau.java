package shzeproject.rtti.typeinfo.pets;

import shzeproject.rtti.typeinfo.Factory;

public class EgyptianMau extends Cat {

    public EgyptianMau() {
    }

    static class Factory implements Pet.Factory<EgyptianMau>{

        @Override
        public EgyptianMau create() {
          return new EgyptianMau();
        }
    
    }
    
   

}
