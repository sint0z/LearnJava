package shzeproject.generics.exception;

import java.util.ArrayList;
import java.util.List;

public class ProcessRunner<T, E extends Exception> extends ArrayList<Processor<T,E>> {

    public List<T> processAll() throws E{
        List<T> resultCollection = new ArrayList<>();
        for(Processor<T,E> p : this) {
            p.process(resultCollection);
        }
        return resultCollection;
    }
}
