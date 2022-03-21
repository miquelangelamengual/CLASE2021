package es.hulk.programacio.practiques.lleihondt.hondtlawoop;

import java.util.List;

public class Elections {

    private final List<Candidate> candidates;
    private final int numSeats;

    public Elections(List<Candidate> candidates, int numSeats) {
        this.candidates = candidates;
        this.numSeats = numSeats;

        this.exceedPercentage();
        new CalculateHondt(candidates, this);
    }

    public int[][] dividingVotesInEscons() {
        int[][] seats = new int[candidates.size()][numSeats];
        int temp = 0;

        System.out.println("Table of divided votes per party: ");
        for (int k = 0; k < candidates.size(); k++) {
            if (!candidates.get(k).isExclosed()) {
                System.out.print(candidates.get(k).getName() + " ");
                for (int j = 0; j < numSeats; j++) {
                    if (j == 0) {
                        seats[k][j] = candidates.get(k).getVotes();
                        temp = 2;
                    } else {
                        seats[k][j] = candidates.get(k).getVotes() / temp;
                        temp++;
                    }
                    System.out.print(seats[k][j] + " | ");
                }
                System.out.println();
            }
        }
        return seats;
    }

    private float percentatgeVotes() {
        int total = 0;
        float percentage = 0.03F;

        for (Candidate candidature : candidates) {
            total += candidature.getVotes();
        }

        return total * percentage;
    }

    private void exceedPercentage() {
        for (Candidate candidature : candidates) {
            if (candidature.getVotes() < percentatgeVotes()) {
                candidature.setExclosed(true);
            }
        }
    }

    public int getSeats() {
        return numSeats;
    }
}
