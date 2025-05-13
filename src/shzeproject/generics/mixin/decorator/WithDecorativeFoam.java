package shzeproject.generics.mixin.decorator;

public class WithDecorativeFoam extends CoffeeDrink{
    private int size;

    public WithDecorativeFoam(Coffee coffee) {
        super(coffee);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
