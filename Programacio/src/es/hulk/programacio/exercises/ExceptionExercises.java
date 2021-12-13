package es.hulk.programacio.exercises;

import es.hulk.programacio.utils.Colors;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Hulk
 * at 09/12/2021
 * Project: CLASE2021
 * Class: ExceptionExercises
 */

public class ExceptionExercises {

    private static final Scanner scanner = new Scanner(System.in);

    public static void dividePer0(int a) {
        try {
            double result = a / 0;
            System.out.println(result);
        } catch (ArithmeticException exception) {
            Colors.error(exception);
        }
    }

    public static void checkEntry() {
        try {
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException exception) {
            Colors.error(exception);
        }
    }

    public static void ex3() {
        try {
            String num = scanner.nextLine();
            int numInt = Integer.parseInt(num);
            System.out.println(numInt);
        } catch (NumberFormatException exception) {
            Colors.error(exception);
        }
    }

    public static void ex4() {
        try {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

            int result = num1 / num2;
        } catch (NumberFormatException e) {
            Colors.error(e);
        }
    }

    public static void ex5() {
        try {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.get(10);
        } catch (IndexOutOfBoundsException e) {
            Colors.error(e);
        }
    }




}
