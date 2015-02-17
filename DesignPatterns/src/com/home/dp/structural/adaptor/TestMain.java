package com.home.dp.structural.adaptor;

public class TestMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "wakeup.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "gonegirl.vlc");
        audioPlayer.play("avi", "song.mp3");
    }
}
