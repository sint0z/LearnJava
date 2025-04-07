package shzeproject.interface_and_abstraction.instrument;

public class Woodwind extends Wind{
    @Override
    public void play(Note note) {
        System.out.println("Woodwind.play() + Note: " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting WoodWind");
    }

    @Override
    public void clearSpitValve(){
        System.out.println("WoodWind.clearSpitValve();");
    }
}
