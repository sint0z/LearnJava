package shzeproject.generics.mixin.decorator;

public class WithCaramel extends CoffeeDrink{
    private boolean isSalty;

    public WithCaramel(Coffee coffee) {
        super(coffee);
    }

    public boolean isSalty() {
        return isSalty;
    }

    public void setSalty(boolean salty) {
        isSalty = salty;
    }
}
