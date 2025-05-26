package shzeproject.generics.mixin.decorator.pizza;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        // System.out.println("Add cheese");
        return pizza.getDescription() + " Cheese";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10.25;
    }
}
