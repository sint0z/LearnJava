 package shzeproject.interface_and_abstraction.instrument;

public class Brass extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() + Note: " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Brass");
    }

    @Override
    public void clearSpitValve(){
        System.out.println("Brass.clearSpitValve();");
    }
}
