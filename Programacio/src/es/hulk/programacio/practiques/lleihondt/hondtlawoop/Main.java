package es.hulk.programacio.practiques.lleihondt.hondtlawoop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Candidate c1 = new Candidate(120000, "Party A");
        Candidate c2 = new Candidate(100000, "Party A");
        Candidate c3 = new Candidate(40000, "Party A");
        Candidate c4 = new Candidate(5000, "Party A");
        Candidate c5 = new Candidate(2500, "Party A");

        List<Candidate> candidates = new ArrayList<>();

        candidates.add(c1);
        candidates.add(c2);
        candidates.add(c3);
        candidates.add(c4);
        candidates.add(c5);

        new Elections(candidates, 8);
    }
}
