package shzeproject.exception.excaption_two;

public class Switch {
    private static boolean state = false;
    public boolean read(){
        return state;
    }

    public void on(){
        state = true;
        System.out.println(this);
    }

    
    public void off(){
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "Вкл" : "Выкл";
    }
}
