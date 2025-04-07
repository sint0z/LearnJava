package shzeproject.polimorfism.alert_to_space;

public class StarShip {
   private static AlertStatus alertStatus = new AlertStatus();

   public static void main(String[] args) {
        alertStatus.play();
        alertStatus.statusChange(ColorSignal.RED);
        alertStatus.play();
        alertStatus.statusChange(ColorSignal.YELLOW);
        alertStatus.play();
        alertStatus.statusChange(ColorSignal.GREEN);
        alertStatus.play();
   }


}
