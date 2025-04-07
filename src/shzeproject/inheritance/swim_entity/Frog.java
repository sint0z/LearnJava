package shzeproject.inheritance.swim_entity;

public class Frog extends Amphibian{

    @Override
    protected String getName() {
        return "Lena"; 
    }
   
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.setAmphibianName("Poleno");
        Amphibian.displayName(frog);
    }
}
