package es.hulk.programacio.exercises;

import es.hulk.programacio.utils.Color;
import es.hulk.programacio.utils.Utils;

import java.util.Scanner;

/**
 * Created by Hulk
 * at 3/11/21 10:37
 */

public class LoopsExercises {

    private Scanner scanner = new Scanner(System.in);

    public void printNumbers() {
        int x = scanner.nextInt();

        for (int i = 0; i <= x; i++) {
            Color.printColor("newline", "cyan", " [" + i + "] ");
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

    public void ifMultipleOf2Stop() {
        Color.printColor("line", "purple", "Tellme a number: ");
        int x = scanner.nextInt();

        while (x % 2 != 0) {
            x = scanner.nextInt();
        }
        Color.printColor("newline", "red", "Multiple of 2, stoping the loop....");
    }

    public void saveNumberIfNumberNegative() {
        int counter = 0;
        Color.printColor("line", "purple", "First Number: ");
        int x = scanner.nextInt();
        Color.printColor("newline", "green", "Number is " + x);

        while (x > 0) {
            x = scanner.nextInt();
            Color.printColor("newline", "green", "Number is " + x);
            counter++;
        }
        Color.printColor("newline", "red", "Negative number, stoping the loop...");
        Color.printColor("newline", "blue", "Total counted numbers: " + counter);
    }

    public void sumNumberIfNumberNegative() {
        int total = 0;
        Color.printColor("line", "purple", "First Number: ");
        int x = scanner.nextInt();
        total += x;

        while (x > 0) {
            x = scanner.nextInt();
            if (x < 0) {
                break;
            }
            total += x;

        }
        Color.printColor("newline", "red", "Negative number, stoping the loop...");
        Color.printColor("newline", "blue", "Result: " + total);

    }

    public void calculAveraged() {
        int total = 0;
        Color.printColor("line", "purple", "First Number: ");
        int x = scanner.nextInt();
        int counter = 1;
        total += x;

        while (x > 0) {
            x = scanner.nextInt();
            if (x < 0) {
                break;
            }
            total += x;
            counter++;
        }
        Color.printColor("newline", "red", "Negative number, stoping the loop...");
        Color.printColor("newline", "blue", "Result: " + (double) total / counter);
    }

}
