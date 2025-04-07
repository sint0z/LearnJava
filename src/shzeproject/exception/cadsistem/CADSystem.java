package shzeproject.exception.cadsistem;

class Shape {
    Shape(int i) { System.out.println("KoHCTpyKTop Shape"); }
    void dispose() { System.out.println("Завершение Shape"); }
}


class Circle extends Shape {

    Circle(int i) { 
        super(i);
        System.out.println("Рисуем окружность Circle");
    }

    @Override
    void dispose() {
    System.out.println("CTnpaeM окружность Circle");
    super.dispose();
 }
 }
 

class Triangle extends Shape {
    Triangle(int i) { 
        super(i);
        System.out.println("PncyeM треугольник Triangle");
    }

    @Override
    void dispose() {
        System.out.println("CTMpaeM треугольник Triangle"); 
        super.dispose();
    }
}
   
class Line extends Shape { 
    private int start, end;
    Line(int start, int end) { 
        super(start); 
        this.start = start; 
        this.end = end;
        System.out.println("Pиcyeм линию Line: " + start + ", " + end);
    }

    @Override
    void dispose() {
        System.out.println("Стираем линию Line: " + start + ", " + end); 
        super.dispose();
    }

}

public class CADSystem extends Shape { 
    private Circle c; 
    private Triangle t; 
    private Line[] lines = new Line[3]; 
    
    public CADSystem(int i) { 
        super(i + 1);
        for(int j = 0; j < lines.length; j++){
            lines[j] = new Line(j, j*j); 
        }
        c = new Circle(1); 
        t = new Triangle(1);
        System.out.println("Комбинированный конструктор");
        
    }
    @Override
    void dispose() {
        System.out.println("CADSystem.dispose() ");
 
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1; i >= 0; i--) {
            lines[i].dispose(); 
        }
        super.dispose();
    }

    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void main(String[] args) {
        CADSystem x = new CADSystem(47); 
        try {
            System.out.println("Выполнение кода в try");
            return;
        } finally { 
            x.dispose();
         }
    }
}

