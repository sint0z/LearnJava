package shzeproject.rtti.typeinfo.pets;


public class Manx extends Cat {

    static class Factory implements Pet.Factory<Manx>{

        @Override
        public Manx create() {
          return new Manx();
        }


    }

    @Override
    public void speak() {
        System.out.println("Manx speak!");
    }
}
