package shzeproject.generics.mixin.decorator.pizza;

public class PepperoniPizza implements Pizza{
    private String type = "Pepperoni";

    public PepperoniPizza(){}
    public PepperoniPizza(String postfix){
        type += " " + postfix.trim();
    }
    @Override
    public String getDescription() {
        return type;
    }

    @Override
    public double getCost() {
        return 100.25;
    }
}
