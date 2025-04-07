package shzeproject.rtti.typeinfo.pets;


public class Hamster extends Rodent{

    static class Factory implements Pet.Factory<Hamster>{

        @Override
        public Hamster create() {
          return new Hamster();
        }
    
    }

}
