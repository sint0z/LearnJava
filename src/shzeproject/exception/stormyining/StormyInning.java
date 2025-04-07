package shzeproject.exception.stormyining;

public class StormyInning extends Inning implements Storm{

    public StormyInning() throws RainedOut, BaseballException {
        super();
    }


    @Override
    public void walk() throws RainedOut {
        super.walk();
    }
    

    @Override
    public void event()throws RainedOut{} 

    @Override
    public void rainedHard() throws RainedOut {}

    @Override
    public void atBat() throws PopFoul {}

    public void isChampion(){
        throw new UmpireException("New UmpireException call");
    }

    public static void main(String[] args) {
        StormyInning sInning = new StormyInning();
        sInning.atBat();
        sInning.isChampion();
     

        
        Inning inning = new StormyInning();
        inning.atBat();
        
    }

  

}
