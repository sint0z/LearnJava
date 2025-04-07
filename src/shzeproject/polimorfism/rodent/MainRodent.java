package shzeproject.polimorfism.rodent;

public class MainRodent {
  
    public static void main(String[] args) {
        Characteristic characteristic = new Characteristic("This is Rodent");
        Mouse mouse = new Mouse(characteristic);
        Mouse mouse2 = new Mouse(characteristic);
        Hamster hamster = new Hamster(characteristic);

        mouse.getInformation();
     

    }
}
