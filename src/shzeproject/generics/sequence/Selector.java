package shzeproject.generics.sequence;


public interface Selector {
    boolean end();
    Object current();
    void next();
}
