package shzeproject.interface_and_abstraction.instrument;

public class MainMusic {

    static void tune(Playable playable) throws InterruptedException{
        playable.play(Note.B_FLAT);
        Thread.sleep(1000);
    }
    
    static void clean(Instrument instrument){
        instrument.prepareInstrument();
    }

    static void tuneAll(Playable[] playables) throws InterruptedException{
        for (Playable playable : playables){
            tune(playable);
        }
    }

    public static void main(String[] args) {
        Instrument[] orechestra = {
            new Wind(),
            new Brass(),
            new Stringer(),
            new Percussion(),
            new Stringer(),
        };
        for(Instrument ins : orechestra){
            clean(ins);
        }

       Playable play = new Wind();

       if(play instanceof Instrument inst){
        System.out.println(inst.getClass().getSimpleName());
       }
       for(Class<?> iface : play.getClass().getInterfaces()){
        System.out.println(iface.getCanonicalName());
       }
    }



}
