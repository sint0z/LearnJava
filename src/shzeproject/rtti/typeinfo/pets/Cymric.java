package shzeproject.rtti.typeinfo.pets;

import shzeproject.rtti.typeinfo.Factory;

public class Cymric extends Manx {
    
  static class Factory implements Pet.Factory<Cymric>{

    @Override
    public Cymric create() {
      return new Cymric();
    }

  }
}
