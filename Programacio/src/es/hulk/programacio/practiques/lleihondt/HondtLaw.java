package es.hulk.programacio.practiques.lleihondt;

/**
 * Created by Hulk
 * at 09/02/2022
 * Project: CLASE2021
 * Class: HondtLaw
 */

public class HondtLaw {

    private static int asignSeats;
    private static int numParties;
    private static int[] votesParties;
    private static String[] names;

    private static final float percentage = 0.03F;

    private static float[][] coefficientsHondt;

    private static boolean[] isMinimumVotes;

    private static int[] assignedSeats;
    private static int seats2;

    public static int[] init(int seats, String[] parties, int[] earnedVotes, int percentage) {
        votesParties = earnedVotes;
        seats2 = seats;
        numParties = parties.length;
        names = parties;

        calculateHondt();
        determinarPartitsAmbVotsMinims();
        assignSeats();
        printTable();
        printResults();
        return assignedSeats;
    }

    private static int totalVotes(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

    private static void calculateHondt() {
        coefficientsHondt = new float[numParties][seats2];

        for (int i = 0; i < votesParties.length; i++) {
            for (int j = 0; j < seats2; j++) {
                if (j == 0) {
                    coefficientsHondt[i][j] = votesParties[i];
                } else {
                    coefficientsHondt[i][j] = (float) votesParties[i] / (j + 1);
                }
            }
        }
    }


    private static void determinarPartitsAmbVotsMinims() {
        isMinimumVotes = new boolean[numParties];
        for (int i = 0; i < numParties; i++) {
            isMinimumVotes[i] = true;
            for (int j = 0; j < numParties; j++) {
                if (i != j && coefficientsHondt[i][0] > coefficientsHondt[j][0]) {
                    isMinimumVotes[i] = false;
                    break;
                }
            }
        }
    }

    private static void printTable() {
        float barrier = totalVotes(votesParties) * percentage;
        for (float[] floats : coefficientsHondt) {
            for (float aFloat : floats) {
                if (floats[0] > barrier) {
                    System.out.print(aFloat + " ");
                }
            }
            System.out.println();
        }
    }

    public static void assignSeats() {
        assignedSeats = new int[numParties];
        for (int i = 0; i < numParties; i++) {
            if (isMinimumVotes[i]) {
                assignedSeats[i]++;
            }
            for (int j = 0; j < numParties; j++) {
                if (coefficientsHondt[i][0] > coefficientsHondt[j][0]) {
                    assignedSeats[i]++;
                }
            }
        }
    }

    private static void printResults() {
        for (int i = 0; i < assignedSeats.length; i++) {
            System.out.println(names[i] + ": " + assignedSeats[i]);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Partit A", "Partit B", "Partit C", "Partit D", "Partit E"};
        int[] votes = {120000, 100000, 40000, 5000, 2500};

        int[] results = init(8, names, votes, 3);

    }

}
