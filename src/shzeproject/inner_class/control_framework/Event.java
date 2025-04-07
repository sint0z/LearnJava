package shzeproject.inner_class.control_framework;

public abstract class Event {
    private int eventTime;
    protected final long delayTime;

    public Event(long delayTime){
        this.delayTime = delayTime;
        start();
    }

    public final void start(){
        eventTime = (int) (System.nanoTime() + delayTime);
    }

    public boolean ready(){
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
