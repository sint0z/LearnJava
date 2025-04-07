package shzeproject.rtti.typeinfo.pets;

public class Cymric extends Manx {
    
  static class Factory implements Pet.Factory<Cymric>{

    @Override
    public Cymric create() {
      return new Cymric();
    }

  }
}
