package es.hulk.programacio.exercises;

import es.hulk.programacio.utils.Colors;

import java.util.Scanner;

/**
 * Created by Hulk
 * at 13/10/2021 9:36
 */

public class ConditionalsExercises extends Thread {

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
            Colors.noup();
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
            Colors.noup();
        }

        int day = scanner.nextInt();

        if (day > 7) {
            Colors.noup();
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
            Colors.noup();
        } else if (hour > 23) {
            Colors.noup();
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

    public void marks() {
        int mark = scanner.nextInt();

        if (mark > 11) {
            Colors.noup();
            return;
        }

        if (mark < -1) {
            Colors.noup();
            return;
        }

        if (mark >= 0 && mark <= 4) {
            System.out.println("Insuficient");
            return;
        }

        if (mark == 5) {
            System.out.println("Suficient");
            return;
        }

        if (mark == 6) {
            System.out.println("Be");
            return;
        }

        if (mark == 7 || mark == 8) {
            System.out.println("Notable");
            return;
        }

        if (mark == 9 || mark == 10) {
            System.out.println("Excelent");
        }
    }

    public void dateTime() {

        Colors.printColor("line", "purple", "Put the day you want: ");
        int d = scanner.nextInt();

        Colors.printColor("line", "purple", "Put the month you want: ");
        int m = scanner.nextInt();

        Colors.printColor("line", "purple", "Put the year you want: ");
        int y = scanner.nextInt();

        if (d > 30) {
            Colors.noup();
            return;
        }
        if (m > 12) {
            Colors.noup();
            return;
        }
        if (y > 3000) {
            Colors.noup();
            return;
        }

        Colors.printColor("newline", "green", "Your date is " + d + "/" + m + "/" + y);
    }

    public void dateTime_v2() {

        Colors.printColor("line", "purple", "Put the day you want: ");
        int d = scanner.nextInt();

        Colors.printColor("line", "purple", "Put the month you want: ");
        int m = scanner.nextInt();

        Colors.printColor("line", "purple", "Put the year you want: ");
        int y = scanner.nextInt();

        if (d > 30) {
            Colors.noup();
            return;
        }

        if (m > 12) {
            Colors.noup();
            return;
        }

        if (y > 3000) {
            Colors.noup();
            return;
        }

        for (int i = 0; i < 13; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                if (d > 31) {
                    Colors.noup();
                    return;
                }
            } else if (i == 2) {
                if (d > 28) {
                    Colors.noup();
                    return;
                }
            } else {
                if (d > 30) {
                    Colors.noup();
                    return;
                }
            }
        }
        Colors.printColor("newline", "green", "Your date is " + d + "/" + m + "/" + y);
    }

    public void getBestNumber() {
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x > y && x > z) {
            System.out.println("Higher number: " + x);
        } else if (x == y && x == z) {
            System.out.println("Equals Number: " + x + y + z);
        } else if (x < y && x < z) {
            System.out.println("Lower Number: " + x);
        }
    }

    public void checkAge() {
        int age = scanner.nextInt();

        if (age < 0) {
            Colors.noup();
            return;
        }

        if (age < 18) {
            Colors.printColor("newline", "red", "Your age is lower than 18, so you cannot go further");
        } else {
            Colors.printColor("newline", "green", "Your age is 18 or higher so congrats");
        }
    }
}
