package shzeproject.generics.limitgeneric.color;

import java.awt.*;

public class Colored<T extends HasColor> {
    T item;
    public Colored(T item) {
        this.item = item;
    }

    T getItem(){
        return item;
    }

    Color color(){
       return item.getColor();
    }
}
