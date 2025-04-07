 package shzeproject.polimorfism.instrument;

public class Brass extends Wind {
    @Override
    void play(Note note) {
        System.out.println("Brass.play() + Note: " + note);
    }

    @Override
    String what() {
        return "Brass";
    }

}
