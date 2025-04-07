package shzeproject.polimorfism.alert_to_space;

public class AlertStatus {
    private Alert alert = new SecurityAlert();
    
    public void statusChange(ColorSignal signal){
        alert = switch (signal) {
            case RED ->  new EvacuationAlert();
            case YELLOW -> new FireAlert();
            default -> new SecurityAlert();     
        };
    }

    public void play(){
        alert.warm();
    }

}
