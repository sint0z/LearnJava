package shzeproject.rtti.typeinfo.pets;


public class Mutt extends Dog {
    public Mutt() {
    }

  
    static class Factory implements Pet.Factory<Mutt>{

        @Override
        public Mutt create() {
            return new Mutt();
        }

    }

    @Override
    public void speak() {
        System.out.println("Mutt speak!");
    }
}
