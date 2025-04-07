package shzeproject.rtti.typeinfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public interface Creator<T> {

    T randomCreate();
    
    T[] createObjectArray(int size);

    default List<T> createObjectList(int size){
        List<T> list = new ArrayList<>();
        Collections.addAll(list, createObjectArray(size));
        return list;
    }
}
