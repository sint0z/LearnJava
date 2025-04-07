package shzeproject.polimorfism.instrument;

public class Stringer extends Instrument {
    @Override
    void play(Note note) {
        System.out.println("Stringer.play() + Note: " + note);
    }

    @Override
    String what() {
        return "Stringer";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringer");
    }
}
