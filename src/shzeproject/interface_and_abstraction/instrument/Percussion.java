package shzeproject.interface_and_abstraction.instrument;

public class Percussion implements  Instrument, Playable {
    @Override
    public void play(Note note) {
        System.out.println("Percussion.play() + Note: " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Percussion");
    }

    @Override
    public void prepareInstrument() {
        System.out.println("Percussion.prepare();");
    }

}
