package shzeproject.generics.mixin.decorator.pizza;

public class NoCheeseDecorator extends PizzaDecorator{
    public NoCheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        String type = pizza.getDescription();
        if(type.contains("Cheese")){
            System.out.println("Remove cheese");
            type = type.replace(" Cheese", "");
        }

        return type;
    }

    @Override
    public double getCost() {
        double cost = pizza.getCost();
        return cost > 15.0 ? cost - 15.0 : 0;
    }

    public void test(){
        System.out.println("This method for testing pattern decorator");
    }
}
