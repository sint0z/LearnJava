package shzeproject.generics.mixin.decorator.coffee;

public abstract class CoffeeDrink extends Coffee {
    protected Coffee coffee;

    public CoffeeDrink(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getName() {
        return coffee.getName();
    }

    public void setName(String val) {
        this.coffee.setName(val);
    }
}
