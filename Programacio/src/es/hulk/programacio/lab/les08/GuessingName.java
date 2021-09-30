package es.hulk.programacio.lab.les08;

import java.util.Random;

/**
 * Created by Hulk
 * at 30/09/2021 13:05
 */

public class GuessingName {

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = 0;
        int guess;

        if (args.length == 0 || args[0].equalsIgnoreCase("help")) {
            System.out.println("Select a correct number");
            return;
        }

        randomNum = random.nextInt(5);
        guess = Integer.parseInt(args[0]);

        if (Integer.parseInt(args[0]) < 1 || Integer.parseInt(args[0]) > 5) {
            System.out.println("Error, invalid argument, number must be a number between 1 and 5");
            return;
        }

        if (Integer.parseInt(args[0]) == randomNum) {
            System.out.println("You won this");
            return;
        }
        System.out.println("You lost");

    }

}
