package shzeproject.polimorfism.instrument;

public class Woodwind extends Wind{
    @Override
    void play(Note note) {
        System.out.println("Woodwind.play() + Note: " + note);
    }

    @Override
    String what() {
        return "Woodwind";
    }

}
