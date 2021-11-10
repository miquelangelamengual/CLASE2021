package es.hulk.programacio.exercises;

import es.hulk.programacio.utils.Colors;
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
            Colors.printColor("newline", "cyan", " [" + i + "] ");
        }
    }

    public void ifNegativeStop() {
        Colors.printColor("line", "purple", "Tellme a number: ");
        int x = scanner.nextInt();
        Colors.printColor("newline", "green", "Number is " + x);

        while (x > 0) {
            x = scanner.nextInt();
            Colors.printColor("newline", "green", "Number is " + x);
        }
        Colors.printColor("newline", "red", "Negative number, stoping the loop...");
    }

    public void if0Stop() {
        Colors.printColor("line", "purple", "Tellme one number: ");
        int x = scanner.nextInt();
        Utils.numberPositiveOrNegative(x);

        while (x != 0) {
            x = scanner.nextInt();
            Utils.numberPositiveOrNegative(x);
        }
        Colors.printColor("newline", "red", "Number 0, stoping the loop....");
    }

    public void ifMultipleOf2Stop() {
        Colors.printColor("line", "purple", "Tellme a number: ");
        int x = scanner.nextInt();

        while (x % 2 != 0) {
            x = scanner.nextInt();
        }
        Colors.printColor("newline", "red", "Multiple of 2, stoping the loop....");
    }

    public void saveNumberIfNumberNegative() {
        int counter = 0;
        Colors.printColor("line", "purple", "First Number: ");
        int x = scanner.nextInt();
        Colors.printColor("newline", "green", "Number is " + x);

        while (x > 0) {
            x = scanner.nextInt();
            Colors.printColor("newline", "green", "Number is " + x);
            counter++;
        }
        Colors.printColor("newline", "red", "Negative number, stoping the loop...");
        Colors.printColor("newline", "blue", "Total counted numbers: " + counter);
    }

    public void sumNumberIfNumberNegative() {
        int total = 0;
        Colors.printColor("line", "purple", "First Number: ");
        int x = scanner.nextInt();
        total += x;

        while (x > 0) {
            x = scanner.nextInt();
            if (x < 0) {
                break;
            }
            total += x;

        }
        Colors.printColor("newline", "red", "Negative number, stoping the loop...");
        Colors.printColor("newline", "blue", "Result: " + total);

    }

    public void calculAveraged() {
        int total = 0;
        Colors.printColor("line", "purple", "First Number: ");
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
        Colors.printColor("newline", "red", "Negative number, stoping the loop...");
        Colors.printColor("newline", "blue", "Result: " + (double) total / counter);
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
            Colors.printColor("newline", "blue", "Counter: " + counter);
        }

        Colors.printColor("newline", "green", "Product: " + mult);
    }

    public void doingAGame() {
        Random random = new Random();
        int attempts = 0;
        int hiddenNum = random.nextInt(100);

        Colors.printColor("line", "purple", "Put a number and try to win: ");
        int playerNum = scanner.nextInt();
        Utils.isHigherOrLower(playerNum, hiddenNum);
        attempts++;

        if (playerNum == hiddenNum) {
            Colors.printColor("newline", "green", "You win this game, good job.");
            Colors.printColor("newline", "blue", "Attempts done: " + attempts);
            return;
        }

        while (playerNum != hiddenNum) {
            Colors.printColor("line", "purple", "Put a number and try to win: ");
            playerNum = scanner.nextInt();

            Utils.isHigherOrLower(playerNum, hiddenNum);

            if (playerNum == hiddenNum) {
                Colors.printColor("newline", "green", "You win this game, good job.");
                Colors.printColor("newline", "blue", "Attempts done: " + attempts);
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
            Colors.printColor("line", "purple", "Number: ");
            int num = scanner.nextInt();
            if (num > 0) {
                counter++;
            } else {
                isNegative = true;
                negativeCounter++;
            }
        }

        if (isNegative) {
            Colors.printColor("newline", "red", "Negative numbers found: " + negativeCounter);
            Colors.printColor("newline", "red", "Positive numbers found: " + counter);
        } else {
            Colors.printColor("newline", "red", "Positive numbers found: " + counter);
        }
    }

    public void askNumbers() {
        int aux = 0;
        int num;

        for (int i = 0; i < MAX_COUNT; i++) {
            Colors.printColor("line", "purple", "Number: ");
            num = scanner.nextInt();

            if (num > aux) {
                aux = num;
            }
        }
        Colors.printColor("newline", "blue", "Higher Number: " + aux);
    }

    public void markCalculation() {
        int invalidMarks = 0;
        int suspended = 0;
        int approved = 0;
        int sum = 0;

        for (int i = 0; i < MAX_COUNT; i++) {
            Colors.printColor("line", "purple", "Number: ");
            int num = scanner.nextInt();

            if (num > 10 || num < 0) {
                invalidMarks++;
                sum += num;
                continue;
            }

            if (num < 5) {
                suspended++;
                sum += num;
            }

            if (num == 10 || num < 5 || num == 5) {
                approved++;
            }
        }

        int validMarks = suspended + approved;
        double avg = (double) sum / validMarks;

        Colors.printColor("newline", "blue", "Invalid Marks: " + invalidMarks);
        Colors.printColor("newline", "blue", "Valid Marks: " + validMarks);
        Colors.printColor("newline", "blue", "Approved: " + approved);
        Colors.printColor("newline", "blue", "Suspended: " + suspended);
        Colors.printColor("newline", "blue", "Average Valid Marks: " + avg);
    }

    public void reverseString() {
        String str = scanner.nextLine();
        StringBuilder res = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            res.append(str.charAt(i));
        }

        /* it can be done using the following code:
          res.append(str);
          res.reverse();
         */

        System.out.print("Reversed String of '" + str + "' is: ");
        System.out.println(res);
    }

    public void isPalindrom() {
        String str = scanner.nextLine();
        StringBuilder res = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            res.append(str.charAt(i));
        }

        if (res.toString().equals(str)) {
            Colors.printColor("newline", "green", "The string is a palindrome.");
        } else {
            Colors.printColor("newline", "red", "The string is not a palindrome.");
        }
    }

    public void countWords() {
        String str = scanner.nextLine();
        String[] words = str.split("\\W+");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            count++;
        }

        Colors.printColor("newline", "blue", "Number of words: " + count);
    }

    //Method that counts how many 'a' char appear
    public void countLetterA() {
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }

        Colors.printColor("newline", "blue", "Number of 'a' char: " + count);
    }

    public void countVowels() {
        char[] vowels = "aeiou".toCharArray();
        String str = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.charAt(i) == vowels[j]) {
                    count++;
                }
            }
        }
        Colors.printColor("newline", "blue", "Number of vowels: " + count);
    }


}
