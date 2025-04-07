package shzeproject.inner_class.control_framework;

public class GreenhouseController{
    public static void main(String[] args) {
        System.out.println(System.nanoTime());

        GreenhouseControls gs = new TwoGreenhouseControls();
       // gs.addEvent(gs.new Bell(900));
    
        Event[] events = {
            ((TwoGreenhouseControls)gs).new HumidificationOff(100),
            gs.new ThermostatNight(0),
            gs.new LightOn(200),
            gs.new LightOf(400),
            gs.new AiringOn(500),
            gs.new WaterOn(600),
            gs.new WaterOff(800),
            gs.new ThermostatDay(1000),
            gs.new AiringOff(1500),
        };

        gs.addEvent(gs.new Restart(2000, events));

        if(args.length == 1){
            gs.addEvent(new GreenhouseControls.Terminate(Integer.parseInt(args[0])));
        }
        gs.run();
    }
}
