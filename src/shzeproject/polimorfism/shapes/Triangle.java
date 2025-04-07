package shzeproject.polimorfism.shapes;

public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void reboot() {
        System.out.println("Triangle.reboot()");
    }

    
}