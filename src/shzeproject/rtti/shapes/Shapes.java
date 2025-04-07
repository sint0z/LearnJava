package shzeproject.rtti.shapes;

import java.util.Arrays;
import java.util.List;


public class Shapes {
    public static void rotate(Shape shape){

        if(shape == null){
            throw new NullPointerException("Link shape is null");
        }
        if(!(shape instanceof Circle)){
            shape.rotate();
        }else{
            System.out.println("Круги нет смысла изменять");
        }
    }

    public static <T extends Shape> void highlightByType(List<Shape> shapes, Class<T> clazz){
        for(Shape shape : shapes){
            if(clazz.isInstance(shape)){
                shape.setHightLight(true);
            }
        }
    }
    
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Triangle(), new Square(), new Circle());


        highlightByType(shapes, Triangle.class);

        for(Shape s : shapes){
            System.out.println(s);
        }
        
        
        Shape shape = new Rhomboid();
        System.out.println("Rhomboid восходящее преобразование:");
        shape.draw();

        System.out.println("Rhomboid нисходящее преобразование:");
        
        Rhomboid rhomboid = null;
        if(shape instanceof Rhomboid rhomb){
            rhomboid = rhomb;
        }

        if(rhomboid != null){
            rhomboid.draw();
        }
        

        /*
         * Нисходящее преобразование в данном случае не проходит
         * т.к компилятор знает, что ему нужен обьект Rhomboid,
         * т.е ссылка в переменной shape указывает на данный класс
         * а мы пытаемся преобразование его к Circle, что являеться
         * другим Class 
         * Circle circle = (Circle) shape;
         * circle.draw();
         */
    }
}
