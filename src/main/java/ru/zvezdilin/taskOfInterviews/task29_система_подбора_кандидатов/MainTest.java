package Home_Task_Netology.SixteenTreeSet_И_TreeMap.SystemOfCandidates;

import Home_Task_Netology.SixteenTreeSet_И_TreeMap.SystemOfCandidates.candidates.Candidate;

//import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    public static void main(String[] args) {
        System.out.println("Start");
        Candidate candidates = new Candidate();

        candidates.fillCandidate(new Candidate("Иванов Иван Иванович", "male", 2, 4));
    }
}