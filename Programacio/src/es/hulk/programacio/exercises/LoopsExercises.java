package es.hulk.programacio.exercises;

import es.hulk.programacio.utils.Color;
import es.hulk.programacio.utils.Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Hulk
 * at 3/11/21 10:37
 */

public class LoopsExercises {

    private Scanner scanner = new Scanner(System.in);

    public void printNumbers() {
        try {
            int x = scanner.nextInt();

            for (int i = 0; i <= x; i++) {
                Color.printColor("newline", "cyan", " [" + i + "] ");
            }
        } catch (Exception e) {
            Color.printColor("newline", "red", "Oh oh, i think i broke something.......");
        }

    }

    public void ifNegativeStop() {
        Color.printColor("line", "purple", "Tellme a number: ");
        int x = scanner.nextInt();
        Color.printColor("newline", "green", "Number is " + x);

        while (x > 0) {
            x = scanner.nextInt();
            Color.printColor("newline", "green", "Number is " + x);
        }
        Color.printColor("newline", "red", "Negative number, stoping the loop...");
    }

    public void if0Stop() {
        Color.printColor("line", "purple", "Tellme one number: ");
        int x = scanner.nextInt();
        Utils.numberPositiveOrNegative(x);

        while (x != 0) {
            x = scanner.nextInt();
            Utils.numberPositiveOrNegative(x);
        }
        Color.printColor("newline", "red", "Number 0, stoping the loop....");
    }

}
