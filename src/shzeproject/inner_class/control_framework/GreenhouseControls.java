package shzeproject.inner_class.control_framework;

public class GreenhouseControls extends Controller {

    private boolean light = false;
    private boolean water = false;
    private boolean isOpenWindow = false;
    private String thermostat = "Night";

    public class AiringOn extends Event{

        public AiringOn(long delayTime) {
                    super(delayTime);
                }
        
                @Override
        public void action() {
            isOpenWindow = true;
        }

        @Override
        public String toString() {
            return "Проветривание началось";
        }
    }

    public class AiringOff extends Event{

        public AiringOff(long delayTime) {
                    super(delayTime);
                }
        
                @Override
        public void action() {
            isOpenWindow = false;
        }

        @Override
        public String toString() {
            return "Проветривание закончилось";
        }
    }

    public class LightOn extends Event{

        public LightOn(long delayTime) {
             super(delayTime);
        }
        
        @Override
        public void action() {
           light = true;
        }

        @Override
        public String toString() {
            return "Свет включен";
        }
        
        
    }

    public class LightOf extends Event{

        public LightOf(long delayTime) {
             super(delayTime);
        }
        
        @Override
        public void action() {
           light = false;
        }

        
        @Override
        public String toString() {
            return "Свет включен";
        }
    }

    
    public class WaterOn extends Event{
    
        public WaterOn(long delayTime) {
            super(delayTime);
            
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Вода включена";
        }
    }

    public class WaterOff extends Event{
    
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "Вода включена";
        }
    }    

    public class ThermostatNight extends Event{
    
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Термостат переведен в ночной режим";
        }
    }

    public class ThermostatDay extends Event{
    
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Термостат переведен в дневной режим";
        }
    }

    public class Bell extends Event{

        
        public Bell(long delayTime) {
            super(delayTime);
        }
                    
        @Override
        public void action() {
          addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "БАМ!";
        }        
    }

    public class Restart extends Event{
        private Event[] eventArray;
    
        public Restart(long delayTime,Event[] eventArray) {
            super(delayTime);
            this.eventArray = eventArray;
            for(Event event : this.eventArray){
                addEvent(event);
            }
        }

        @Override
        public void action() {
            for(Event e : eventArray){
                e.start();
                addEvent(e);
            }
            //start();
           // addEvent(this);
        }

        @Override
        public String toString() {
            return "Рестарт нА!";
        }
        
    }

    public static class Terminate extends Event{

        public Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() {
            return "Отключение";
        }
        
    }   
    
}
