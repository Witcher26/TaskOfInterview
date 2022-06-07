package ru.zvezdilin.taskOfInterviews.task14_игра_на_музыкальных_инструментах;

public class Main {
    public static void main(String[] args) throws Exception {
        Instrument [] instruments = {
                new Guitar(),
                new Piano(),
                new Flute(),
                new Guitar()
        };

        boolean[][] shouldPlay = {
                {false, true, true, true, false, true},  // здесь каждая строка - это инструмент, вторая - секунда
                {true, true, false, false, true, true},
                {false, true, true, true, false, true},
                {true, true, false, true, true, true}
        };

        Song song = new Song(instruments, shouldPlay);
        song.play();
    }
}
