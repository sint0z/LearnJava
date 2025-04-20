package shzeproject.generics.limitgeneric.color.redundacy;

import shzeproject.generics.limitgeneric.color.Dimension;
import shzeproject.generics.limitgeneric.color.HasColor;
import shzeproject.generics.limitgeneric.color.Weight;

public class SolidEx<C extends Dimension & HasColor & Weight> extends ColoredDimensionEx<C>{
    public SolidEx(C item) {
        super(item);
    }

    public int weight(){
        return item.weight();
    }
}
