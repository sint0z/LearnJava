package shzeproject.rtti.typeinfo.pets;

public class Mouse extends Rodent {

    public Mouse() {
    }
    
    static class Factory implements Pet.Factory<Mouse>{

        @Override
        public Mouse create() {
          return new Mouse();
        }
    
    }

    @Override
    public void speak() {
        System.out.println("Mouse speak!");
    }
}
