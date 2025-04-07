package shzeproject.polimorfism.poly_constructor;

public class Glyph {

    public Glyph() {
        System.out.println("Glyth() до вызова drow()");
        draw();
        System.out.println("Glyth() после вызова drow()");
    }

    
    void draw() {
        System.out.println("Glyth().drow()");
    }
}
