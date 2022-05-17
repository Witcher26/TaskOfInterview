package ru.zvezdilin.taskOfInterviews.task14_игра_на_музыкальных_инструментах;

import java.io.IOException;

public class Song {
    protected Instrument[] instruments;
    protected boolean[][] shouldPlay;

    public Song(Instrument[] instruments, boolean[][] shouldPlay) {
        this.instruments = instruments;
        this.shouldPlay = shouldPlay;
    }

    public void play() throws Exception {
        int time = shouldPlay[0].length; //протяженность времени
        for (int t = 0; t < time; t++) {
            for (int i = 0; i < instruments.length; i++) {
                if (shouldPlay[i][t]) {
                    Instrument instrument = instruments[i];
                    System.out.print(instrument.playSound() + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            Thread.sleep(1000);
        }

    }
}
