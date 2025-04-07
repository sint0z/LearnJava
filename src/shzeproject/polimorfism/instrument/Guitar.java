package shzeproject.polimorfism.instrument;

public class Guitar extends Stringer {
    private String name = "Gitar";
    void play(Note note){
        System.out.println("Guitar.play() + Note: " + note);
    }

    String what(){
        return "Guitar";
    }

}
