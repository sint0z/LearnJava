package shzeproject.polimorfism.poly_constructor;

public class RoundGlyph extends Glyph{
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph() + radius -> "+ radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph().draw() + radius ->" + radius);
    }
    

    

}
