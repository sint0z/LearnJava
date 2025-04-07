package shzeproject.initialization_and_completion;

public class Bank {

    public static  void getInformation(Money money){
       int value = switch (money) {
            case ONE -> 1;
            case FIVE -> 5;
            case TEN -> 10;
            case HUNDRED -> 100;
            case THOUSAND -> 1000;
            case MILLION -> 1000000;
            default -> 0;
        };
        System.out.println("Значение = " + value);
    }

    
    public static void main(String[] args) {
        Money[] moneys = Money.values();
        
        for(Money money:moneys){
            System.out.println(money + " = " + money.getValue() + ", ordinal: [" + money.ordinal()+"]");
        }
        System.out.println(" ");
        getInformation(Money.ONE);

    }
}
