package shzeproject.generics.exception;

import java.util.List;

public interface Processor <T, E extends Exception>{
    void process(List<T> list) throws E;
}
