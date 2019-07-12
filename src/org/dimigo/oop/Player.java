package org.dimigo.oop;
import org.dimigo.oop.MediaPlayer;

public class Player {
    public void play() {
        MediaPlayer mp = MediaPlayer.getInstance();
        mp.setVolume(10);
    }
}