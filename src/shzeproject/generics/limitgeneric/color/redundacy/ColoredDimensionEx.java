package shzeproject.generics.limitgeneric.color.redundacy;

import shzeproject.generics.limitgeneric.color.Dimension;
import shzeproject.generics.limitgeneric.color.HasColor;

public class ColoredDimensionEx<C extends Dimension & HasColor> extends ColoredEx<C> {

    public ColoredDimensionEx(C item) {
        super(item);
    }

    public int getX(){
        return item.getX();
    }
    public int getY(){
        return item.getY();
    }
    public int getZ(){
        return item.getZ();
    }
}
