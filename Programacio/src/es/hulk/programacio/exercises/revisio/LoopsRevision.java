package es.hulk.programacio.exercises.revisio;

import java.util.Scanner;

public class LoopsRevision {

    public static void secondsToHours() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secondsLeft = seconds % 60;

        System.out.println(seconds + " seconds is " + hours + " hours, " + minutes + " minutes and " + secondsLeft + " seconds.");
    }

    //A partir d’un enter introdu ̈ıt per teclat, mostra la seva taula de multiplicar.
    public static void table() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    public static void introduceMarks() {
        Scanner scanner = new Scanner(System.in);
        int suspended = 0;
        int okay = 0;
        int notable = 0;
        int excelent = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a mark: ");
            int mark = scanner.nextInt();

            if (mark >= 0 && mark <= 5) {
                suspended++;
            } else if (mark >= 6 && mark <= 7) {
                okay++;
            } else if (mark >= 8 && mark <= 9) {
                notable++;
            } else {
                excelent++;
            }
        }
    }

    public static void siEsMultipleDe3() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 3 == 0) {
                System.out.println("The number is multiple of 3.");
            } else {
                System.out.println("The number is not multiple of 3.");
            }
        }
    }
}
