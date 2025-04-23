package shzeproject.generics.limitgeneric;

import java.util.LinkedList;
import java.util.Queue;


public class MediaPlayer implements IPlayable, IRecordable{
    @Override
    public void play() {
        System.out.println("Music is playing");
    }

    @Override
    public void pause() {
        System.out.println("Music is playing");
    }

    @Override
    public void record() {
        System.out.println("Music is record");
    }

    @Override
    public void stop() {
        System.out.println("Music is stop record");
    }

    public static <I extends IPlayable> void player(I playable){
        playable.play();
        playable.pause();
    }

    public static <I extends  IRecordable> void record(I recordable){
        recordable.record();
        recordable.stop();
    }

    public static <I extends IRecordable & IPlayable> void recordAndPlayer(I rp ){
        rp.play();
        rp.record();
        rp.stop();
        rp.pause();
    }

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        Queue<IPlayable> queue = new LinkedList<>();
        System.out.println("First method:");
        player(mediaPlayer);
        System.out.println(" ");

        System.out.println("Second method:");
        record(mediaPlayer);
        System.out.println(" ");

        System.out.println("Multi method:");
        recordAndPlayer(mediaPlayer);
        System.out.println(" ");
    }
}
