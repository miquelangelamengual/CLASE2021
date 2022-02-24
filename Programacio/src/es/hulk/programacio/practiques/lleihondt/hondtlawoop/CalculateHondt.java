package es.hulk.programacio.practiques.lleihondt.hondtlawoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CalculateHondt {

    private final List<Candidate> candidates;
    private final Elections elections;
    private final int[][] seats;
    private final List<Integer> finalNumbers = new ArrayList<>();

    public CalculateHondt(List<Candidate> candidates, Elections elections) {
        this.elections = elections;
        this.candidates = candidates;
        this.seats = elections.dividingVotesInEscons();

        setNumbers();
        sort();
        assignSeats();
        printOkayParties();
        printExclosedParties();
    }

    private void setNumbers() {
        for (int[] seat : seats) {
            for (int i : seat) {
                finalNumbers.add(i);
            }
        }
    }

    private void sort() {
        Comparator<Integer> compared = Collections.reverseOrder();
        finalNumbers.sort(compared);

        int counter = elections.getSeats();
        for (int i = counter; i < finalNumbers.size(); i++) {
            finalNumbers.remove(i);
            i--;
        }
    }

    private void assignSeats() {
        int var1 = -1;
        int var2 = -1;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                for (int k = 0; k < finalNumbers.size(); k++) {
                    if (i == var1 && j == var2) {
                        continue;
                    }
                    if (seats[i][j] == finalNumbers.get(k)) {
                        candidates.get(i).setSeats(candidates.get(i).getSeats() + 1);
                        var1 = i;
                        var2 = j;
                        break;
                    }

                }
            }
        }
    }

    private void printOkayParties() {
        System.out.println("Seats per party: ");
        for (Candidate candidature : candidates) {
            System.out.println(candidature.getName() + " has " + candidature.getSeats() + " seats.");
        }
    }

    private void printExclosedParties() {
        System.out.println("Exclosed Parties: ");
        for (Candidate candidature : candidates) {
            if (candidature.isExclosed()) {
                System.out.println(candidature.getName() + " is exclosed for this elections. ");
            }
        }
    }

}
