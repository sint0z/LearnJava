package shzeproject.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.convertMoney(15));

        DetergentTwo dTwo = new DetergentTwo();
        dTwo.scrub();
        dTwo.sterilize();
        System.out.println(dTwo.toString());
    }
}
