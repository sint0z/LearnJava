package shzeproject.inheritance;

public class DetergentTwo extends Detergent {

    @Override
    public void scrub() {
        super.scrub("[null] ");
    }
    
    public void sterilize(){append("sterilize()");}
    
}
