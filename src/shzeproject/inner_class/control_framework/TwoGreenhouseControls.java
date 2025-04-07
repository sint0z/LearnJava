package shzeproject.inner_class.control_framework;

public class TwoGreenhouseControls extends GreenhouseControls {

    private boolean humidity = false;

    public class HumidificationOff extends Event{

        public HumidificationOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            humidity = false;
        }

        @Override
        public String toString() {
            return "Увлажнение окончено";
        }
    }

    public class HumidificationOn extends Event{

        public HumidificationOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            humidity = true;
        }

        @Override
        public String toString() {
            return "Увлажнение началось";
        }
        
        
    }

    public void test(){
        
    }
}
