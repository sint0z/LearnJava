package shzeproject.generics.dacktypeproblem.functionobj;

public class ClassOne {
    private int value;

    public ClassOne(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("ClassOne -> value [%d]", this.value);
    }
}
