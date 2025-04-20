package shzeproject.generics.limitgeneric.color;

import shzeproject.inheritance.C;

import java.awt.*;

public class Solid<C extends Dimension & Weight & HasColor> {
    C item;

    public Solid(C item) {
        this.item = item;
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
    int weight(){
        return item.weight();
    }

}
