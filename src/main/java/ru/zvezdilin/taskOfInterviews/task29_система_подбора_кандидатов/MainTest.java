package ru.zvezdilin.taskOfInterviews.task29_система_подбора_кандидатов;

import ru.zvezdilin.taskOfInterviews.task29_система_подбора_кандидатов.candidates.Candidate;

class MainTest {
    public static void main(String[] args) {
        System.out.println("Start");
        Candidate candidates = new Candidate();

        candidates.fillCandidate(new Candidate("Иванов Иван Иванович", "male", 2, 4));
    }
}