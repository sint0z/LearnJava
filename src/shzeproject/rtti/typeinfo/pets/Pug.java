package shzeproject.rtti.typeinfo.pets;


public class Pug extends Dog{

    static class Factory implements Pet.Factory<Pug>{

        @Override
        public Pug create() {
          return new Pug();
        }
    
    }

    @Override
    public void speak() {
        System.out.println("Pug speak!");
    }

}
