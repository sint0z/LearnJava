package shzeproject.polimorfism.instrument;

public class Percussion extends Instrument {
    @Override
    void play(Note note) {
        System.out.println("Percussion.play() + Note: " + note);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }

}
