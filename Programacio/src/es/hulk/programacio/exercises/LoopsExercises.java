package es.hulk.programacio.exercises;

import es.hulk.programacio.utils.Color;
import es.hulk.programacio.utils.Utils;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Hulk
 * at 3/11/21 10:37
 */

public class LoopsExercises {

    private Scanner scanner = new Scanner(System.in);
    private final int MAX_COUNT = 10;

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

    public void numStop() {
        int counter = 1;
        int num = 10;
        int mult = 1;

        for (int i = 1; i < num; i++) {
            if (counter > num) {
                break;
            }
            counter = counter + 2;
            mult *= counter;
            Color.printColor("newline", "blue", "Counter: " + counter);
        }

        Color.printColor("newline", "green", "Product: " + mult);
    }

    public void doingAGame() {
        Random random = new Random();
        int attempts = 0;
        int hiddenNum = random.nextInt(100);

        Color.printColor("line", "purple", "Put a number and try to win: ");
        int playerNum = scanner.nextInt();
        Utils.isHigherOrLower(playerNum, hiddenNum);
        attempts++;

        if (playerNum == hiddenNum) {
            Color.printColor("newline", "green", "You win this game, good job.");
            Color.printColor("newline", "blue", "Attempts done: " + attempts);
            return;
        }

        while (playerNum != hiddenNum) {
            Color.printColor("line", "purple", "Put a number and try to win: ");
            playerNum = scanner.nextInt();

            Utils.isHigherOrLower(playerNum, hiddenNum);

            if (playerNum == hiddenNum) {
                Color.printColor("newline", "green", "You win this game, good job.");
                Color.printColor("newline", "blue", "Attempts done: " + attempts);
                break;
            }
            attempts++;
        }
    }

    public void tellMeAllNumbers() {
        int counter = 0;
        int negativeCounter = 0;
        boolean isNegative = false;

        for (int i = 0; i < MAX_COUNT; i++) {
            Color.printColor("line", "purple", "Number: ");
            int num = scanner.nextInt();
            if (num > 0) {
                counter++;
            } else {
                isNegative = true;
                negativeCounter++;
            }
        }

        if (isNegative) {
            Color.printColor("newline", "red", "Negative numbers found: " + negativeCounter);
            Color.printColor("newline", "red", "Positive numbers found: " + counter);
        } else {
            Color.printColor("newline", "red", "Positive numbers found: " + counter);
        }
    }

    public void askNumbers() {
        int aux = 0;
        int num;

        for (int i = 0; i < MAX_COUNT; i++) {
            Color.printColor("line", "purple", "Number: ");
            num = scanner.nextInt();

            if (num > aux) {
                aux = num;
            }
        }
        Color.printColor("newline", "blue", "Higher Number: " + aux);
    }

    public void markCalculation() {
        int invalidMarks = 0;
        int suspended = 0;
        int approved = 0;
        int sum = 0;

        for (int i = 0; i < MAX_COUNT; i++) {
            Color.printColor("line", "purple", "Number: ");
            int num = scanner.nextInt();

            if (num > 10 || num < 0) {
                invalidMarks++;
                sum+= num;
                continue;
            }

            if (num < 5) {
                suspended++;
                sum+= num;
            }

            if (num == 10 || num < 5 || num == 5) {
                approved++;
            }
        }

        int validMarks = suspended + approved;
        double avg = (double) sum / validMarks;

        Color.printColor("newline", "blue", "Invalid Marks: " + invalidMarks);
        Color.printColor("newline", "blue", "Valid Marks: " + validMarks);
        Color.printColor("newline", "blue", "Approved: " + approved);
        Color.printColor("newline", "blue", "Suspended: " + suspended);
        Color.printColor("newline", "blue", "Average Valid Marks: " + avg);
    }
}
