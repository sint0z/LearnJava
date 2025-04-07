package shzeproject.inheritance;

public class Bank {
    Money money;

    public Bank(){

    }

    public int convertMoney(int size){
        if(money == null) {
            money = new Money(10);
        } 
        return money.getCost() * size;
    }
}
