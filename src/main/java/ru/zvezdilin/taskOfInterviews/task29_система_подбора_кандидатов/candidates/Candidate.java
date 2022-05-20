package Home_Task_Netology.SixteenTreeSet_И_TreeMap.SystemOfCandidates.candidates;

import java.util.*;

public class Candidate implements Comparable<Candidate> {

    private String fio;
    private String gender;
    private Integer relevance;
    private Integer ratio;

    public Integer getRelevance() {
        return relevance;
    }

    public Integer getRatio() {
        return ratio;
    }

    public Candidate() {
    }

    public Candidate(String fio, String gender, Integer relevance, Integer ratio) {
        this.fio = fio;
        this.gender = gender;
        this.relevance = relevance;
        this.ratio = ratio;
    }

    private TreeSet<Candidate> storage = new TreeSet<>();

    public void fillCandidate(Candidate candidate) {
        storage.add(candidate);
    }

    public void printAll() {
        for (Candidate candidate : storage) {
            System.out.println(candidate);
        }
    }

    @Override
    public String toString() {
        return fio + ", рейтинг: " + relevance + ", анкета: " + ratio;
    }

    @Override
    public int compareTo(Candidate altCandidate) {
        int result = altCandidate.relevance.compareTo(relevance);
        if (result == 0) {
            result = altCandidate.ratio.compareTo(ratio);
            if (result == 0) {
                return this.relevance;
            }
        }
        return result;
    }
}
