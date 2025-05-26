package shzeproject.generics.mixin.decorator.coffee;

public class WithChocolate extends CoffeeDrink {
    private String typeChocolate;

    public WithChocolate(Coffee coffee) {
        super(coffee);
    }

    public String getTypeChocolate() {
        return typeChocolate;
    }

    public void setTypeChocolate(String typeChocolate) {
        this.typeChocolate = typeChocolate;
    }
}
