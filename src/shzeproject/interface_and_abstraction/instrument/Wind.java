package shzeproject.interface_and_abstraction.instrument;

public class Wind implements Instrument, Playable {

    public void clearSpitValve(){
        System.out.println("Wind.clearSpitValve();");
    }

    @Override
    public void play(Note note) {
        System.out.println("Wind.play() + Note: " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Wind");
    }

    @Override
    public void prepareInstrument() {
        clearSpitValve();
    }
    
}
