package shzeproject.rtti.typeinfo.pets;


public class Rat extends Rodent {

    static class Factory implements Pet.Factory<Rat>{

        @Override
        public Rat create() {
          return new Rat();
        }
    
    }

    @Override
    public void speak() {
        System.out.println("Rat speak!");
    }
}
