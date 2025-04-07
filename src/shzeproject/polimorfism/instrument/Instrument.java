package shzeproject.polimorfism.instrument;

public class Instrument {
    void play(Note note){
        System.out.println("Instrument.play() + Note: " + note);
    }

    String what(){
        return "Instrument";
    }

    void adjust(){
        System.out.println("Adjusting Instrument");
    }

    @Override
    public String toString() {
        return what();
    }

    
}
