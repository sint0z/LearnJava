package shzeproject.polimorfism.shapes;

import java.util.Iterator;
import java.util.Random;

public class ShapeFabric implements Iterable<Shape> {
    private final Random random = new Random();
    private final int size;

    public ShapeFabric(int size){
        this.size = size;
    }
    public Shape next(){
        int randNumber = random.nextInt(3);
        return switch(randNumber){
            case 0 -> new Circle();
            case 1 -> new Triangle();
            case 2 -> new Square();
            case 3 -> new Heart();
            default -> new Shape();
        };
    }

    @Override
    public Iterator<Shape> iterator() {
      return new Iterator<Shape>(){
        private int it = 0;
        @Override
        public boolean hasNext() {
            return it < size;
        }

        @Override
        public Shape next() {
            it++;
           return ShapeFabric.this.next();
        }
    };
    

    }

    public static void main(String[] args) {
        for(Shape shape: new ShapeFabric(6)){
            shape.draw();
        }
    }
}
