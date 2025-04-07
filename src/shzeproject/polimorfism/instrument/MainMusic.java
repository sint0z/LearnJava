package shzeproject.polimorfism.instrument;

public class MainMusic {
    private static InstrumentFabric fabric = new InstrumentFabric();

    public static void tune(Instrument instrument, Note note){
        instrument.play(note);
    }

    public static void tune(Instrument instrument){
        System.out.println(instrument);
    }

    public static void tuneAll(Instrument[] instruments){
        for (Instrument instrument : instruments)
            tune(instrument);
    }

    public static void main(String[] args) {
        Instrument[] orechestra = {
            new Wind(),
            new Brass(),
            new Stringer(),
            new Percussion(),
            new Stringer(),
        };
        tuneAll(orechestra);

        tune(fabric.next());
        tune(new Guitar(), Note.B_FLAT);
    }



}
