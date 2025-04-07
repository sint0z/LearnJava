package shzeproject.polimorfism.shapes;

public class Shapes {
    private static ShapeFabric shapeFabric = new ShapeFabric(10);

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = shapeFabric.next();
        }

        for(Shape shape : shapes){
            shape.reboot();
        }
    }

}
