package shzeproject.polimorfism.poly_constructor;

public class RectangularGlyph extends Glyph {
    private int len = 1;
    private int weight = 1;

    public RectangularGlyph(int len, int weight) {
        this.len = len;
        this.weight = weight;
        System.out.println("RectangularGlyph() -> (lenght = " + len + " weight = "+ len + " )");
    }

    @Override
    void draw() {
        int area = weight * len;
        System.out.println("Area:= "+ len + " * " + weight + " = " +  area);
    }


    public static void main(String[] args) {
        new RectangularGlyph(10, 5);
    }
    

}
