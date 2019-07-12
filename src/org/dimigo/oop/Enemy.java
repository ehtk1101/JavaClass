package org.dimigo.oop;
import org.dimigo.oop.MediaPlayer;

public class Enemy {
    public void play() {
        MediaPlayer mp = MediaPlayer.getInstance();
        mp.setVolume(20);
    }
}