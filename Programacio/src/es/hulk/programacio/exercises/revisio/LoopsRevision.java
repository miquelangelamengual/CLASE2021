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

}
