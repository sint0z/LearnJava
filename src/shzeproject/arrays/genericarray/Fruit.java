package shzeproject.arrays.genericarray;

public abstract class Fruit {
    private final String type;
    private final int size;

    public Fruit(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public final String getType() {
        return type;
    }

    public final int getSize() {
        return size;
    }
}
