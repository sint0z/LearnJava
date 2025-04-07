package shzeproject.interface_and_abstraction.rodent;

public class MainRodent {
  
    public static void main(String[] args) {
        Characteristic characteristic = new Characteristic("This is Rodent");
        Mouse mouse = new Mouse(characteristic);
        Mouse mouse2 = new Mouse(characteristic);
        Hamster hamster = new Hamster(characteristic);

        mouse.getInformation();
        

        // Ошибка -> Rodent rodent = new Rodent(characteristic); - класс абстрактный, нельзя создать обьект
    }
}
