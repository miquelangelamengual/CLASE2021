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

    public void betterOrNotBetter() {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is bigger than " + num2);
        } else {
            System.out.println(num2 + " is bigger than " + num1);
        }
    }

    public void dayOfWeek(String type) {

        if (!(type.equals("IF") || type.equals("SWITCH"))) {
            System.out.println("Invalid Type");
            System.out.println("Valid types: IF & SWITCH (its case-sensitive)");
        }

        int day = scanner.nextInt();

        if (day > 7) {
            System.out.println("Invalid day");
            return;
        }

        if (type.equals("IF")) {
            if (day == 1) {
                System.out.println("Monday");
                return;
            }
            if (day == 2) {
                System.out.println("Tuesday");
                return;
            }
            if (day == 3) {
                System.out.println("Wednesday");
                return;
            }
            if (day == 4) {
                System.out.println("Thursday");
                return;
            }
            if (day == 5) {
                System.out.println("Friday");
                return;
            }
            if (day == 6) {
                System.out.println("Satueday");
                return;
            }
            if (day == 7) {
                System.out.println("Sunday");
                return;
            }
        }

        if (type.equals("SWITCH")) {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
        }
    }

    public void hourTime() {
        int hour = scanner.nextInt();

        if (hour < 8) {
            System.out.println("Invalid Hour");
        } else if (hour > 23) {
            System.out.println("Invalid Hour");
        }

        if (hour >= 8 && hour <= 12) {
            System.out.println("Mati");
            return;
        }

        if (hour >= 12 && hour <= 17) {
            System.out.println("Migdia");
            return;
        }

        if (hour >= 17 && hour <= 20) {
            System.out.println("Horabaixa");
            return;
        }

        if (hour >= 20 && hour <= 23) {
            System.out.println("Vespre");
        }
    }

}
