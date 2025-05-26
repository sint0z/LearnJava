package shzeproject.generics.mixin.decorator.pizza;

import java.util.Formatter;

public class PizzaMain {

    public static void printState(Pizza pizza){
        printState(pizza.getDescription(), pizza.getCost());
    }

    public static void printState(String type, double cost){
        Formatter formatter = new Formatter();
        formatter.format("Type  [%s], cost: %.2f \n", type, cost);
        System.out.println(formatter);
    }

    public static void main(String[] args) {
        Pizza pepperoni = new PepperoniPizza();

        printState(pepperoni);

        PizzaDecorator cheesePepperoni = new CheeseDecorator(pepperoni);

        printState(cheesePepperoni);

        NoCheeseDecorator noCheesePepperoni = new NoCheeseDecorator(cheesePepperoni);
        noCheesePepperoni.test();

        printState(noCheesePepperoni);


        CheeseDecorator cheeses = new CheeseDecorator(new NoCheeseDecorator(new PepperoniPizza("1")));
        //cheeses.test();
        printState(cheeses);
    }
}
