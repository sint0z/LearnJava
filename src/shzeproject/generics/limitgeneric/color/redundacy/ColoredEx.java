package shzeproject.generics.limitgeneric.color.redundacy;

import shzeproject.generics.limitgeneric.color.HasColor;
import shzeproject.inheritance.C;

import java.awt.*;

public class ColoredEx<C extends HasColor> extends HoldItem<C> {

    public ColoredEx(C item) {
        super(item);
    }

    public Color getColor(){
        return item.getColor();
    }
}
