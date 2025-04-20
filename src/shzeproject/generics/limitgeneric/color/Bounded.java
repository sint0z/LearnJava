package shzeproject.generics.limitgeneric.color;

import java.awt.*;

public class Bounded extends Dimension implements HasColor, Weight{
    @Override
    public Color getColor() {
        return null;
    }

    @Override
    public int weight() {
        return 0;
    }
}
