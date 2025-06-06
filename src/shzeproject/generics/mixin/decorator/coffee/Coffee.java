package shzeproject.generics.mixin.decorator.coffee;

public class Coffee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        WithDecorativeFoam withDecorativeFoam = new WithDecorativeFoam(new WithChocolate(new Coffee()));
        int sizeFoam = withDecorativeFoam.getSize();
        WithChocolate withChocolate = new WithChocolate(new WithCaramel(new Coffee()));
    //  withChocolate.isSalty() - недоступно, т.к работает с одним уровнем декорирования
    }
}
