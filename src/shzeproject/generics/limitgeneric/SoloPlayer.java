package shzeproject.generics.limitgeneric;

public class SoloPlayer implements IPlayable {


    @Override
    public void play() {
        System.out.println("SoloPlay.play()");
    }

    @Override
    public void pause() {
        System.out.println("SoloPlay.pause()");
    }
}
