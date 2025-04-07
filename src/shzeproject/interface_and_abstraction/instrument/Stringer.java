package shzeproject.interface_and_abstraction.instrument;

public class Stringer implements Instrument, Playable {
    @Override
    public void play(Note note) {
        System.out.println("Stringer.play() + Note: " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Stringer");
    }

    @Override
    public void prepareInstrument() {
        System.out.println("Stringer.prepare();");
    }
}
