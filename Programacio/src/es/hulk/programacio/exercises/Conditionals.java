package es.hulk.programacio.exercises;

import java.util.Scanner;

/**
 * Created by Hulk
 * at 13/10/2021 9:36
 */

public class Conditionals extends Thread {

    private Scanner scanner = new Scanner(System.in);

    public void positiveOrNegative() {
        int y = scanner.nextInt();

        if (y < 0) {
            System.out.println("The Number is negative");
        } else if (y > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("This number is neutral");
        }
    }

    public void multiplyOfTwo() {
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("This number is multiple of 2");
        } else {
            System.out.println("Wrong number");
        }
    }
}
