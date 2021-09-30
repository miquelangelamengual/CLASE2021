package es.hulk.programacio.lab.les07.objects;

import java.util.Scanner;

/**
 * Created by Hulk
 * at 30/09/2021 12:20
 */

public class DateTwo {

    public void displayDay() {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();

        if (dayNumber > 7) {
            System.err.println("An internal error has ocurred while attempting to do that");
        }

        if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else if (dayNumber == 7) {
            System.out.println("Sunday");
        }
    }

}
