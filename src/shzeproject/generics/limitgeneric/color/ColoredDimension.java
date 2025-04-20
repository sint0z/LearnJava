package shzeproject.generics.limitgeneric.color;

import java.awt.*;

public class ColoredDimension <C extends Dimension & HasColor>{
    C item;

    public ColoredDimension(C item) {
        this.item = item;
    }

    C getItem(){
        return this.item;
    }

    Color color(){
        return item.getColor();
    }

    int getX(){
        return item.getX();
    }

    int getY(){
        return item.getY();
    }
    int getZ(){
        return item.getZ();
    }
}
