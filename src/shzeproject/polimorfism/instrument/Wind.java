package shzeproject.polimorfism.instrument;

public class Wind extends Instrument {

    @Override
    void play(Note note) {
        System.out.println("Wind.play() + Note: " + note);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
    
}
