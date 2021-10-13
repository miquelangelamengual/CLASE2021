package es.hulk.entorns.debugger;

import java.util.Random;

/**
 * Created by Hulk
 * at 06/10/2021 12:03
 */

public class Debugger1 {

    public static void main(String[] args) {

        final int NUM_NOTES = 3;

        int notaA;
        int notaB;
        int notaC;

        double mitjana;

        Random rand = new Random(); // per calcular números aleatoris

        // Calcular les notes aleartòriament:
        notaA = rand.nextInt(11);
        notaB = rand.nextInt(11);
        notaC = rand.nextInt(11);

        mitjana = ((double)notaA + notaB + notaC) / NUM_NOTES;

        System.out.println(mitjana);
    }
}
