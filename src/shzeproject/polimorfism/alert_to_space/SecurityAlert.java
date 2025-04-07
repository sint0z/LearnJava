package shzeproject.polimorfism.alert_to_space;

public class SecurityAlert extends Alert {

    @Override
    public void warm() {
        System.out.println("Уважаемый экипаж, пристегните ремни, опасность миновала!");
    }
    
}
