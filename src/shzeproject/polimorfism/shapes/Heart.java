package shzeproject.polimorfism.shapes;

public class Heart extends Shape {

    @Override
    public void draw() {
        System.out.println("Heart.draw()");
    }
    @Override
    public void reboot() {
        System.out.println("Heart.reboot()");
        super.reboot();
    }
    
}
