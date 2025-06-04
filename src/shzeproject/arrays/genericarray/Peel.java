package shzeproject.arrays.genericarray;

public class Peel<T extends Fruit> {
    private final T pulp;
    private double size = 0.1;

    public Peel(T pulp) {
        this.pulp = pulp;
        this.size += pulp.getSize();
    }

    public double getSize() {
        return size;
    }

    public T clearPeel(){
        return pulp;
    }
}
