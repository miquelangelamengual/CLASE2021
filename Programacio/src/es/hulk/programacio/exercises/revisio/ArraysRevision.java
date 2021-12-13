package es.hulk.programacio.exercises.revisio;

import java.util.Scanner;

public class ArraysRevision {

    private final static Scanner scanner = new Scanner(System.in);

    private static void addNumbersToArray(int[] arr, int max) {
        for (int i = 0; i < max; i++) {
            int nums = scanner.nextInt();
            arr[i] = nums;
        }
    }

    public static void reverseNumbers(int max) {
        int[] arr = new int[max];
        addNumbersToArray(arr, max);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(" [" + arr[i] + "] ");
        }
    }

    public static void averageCalculation(int max) {
        int[] arr = new int[max];
        addNumbersToArray(arr, max);

        int count = 0;

        for (int j : arr) {
            count += j;
        }

        System.out.println((float) count / arr.length);
    }

    public static void averageCalculationAndCount0(int max) {
        int[] arr = new int[max];
        int negative = 0;
        addNumbersToArray(arr, max);

        int count = 0;

        for (int j : arr) {
            count += j;
            if (j == 0) {
                negative++;
            }
        }

        System.out.println((float) count / arr.length);
        System.out.println(negative);
    }


}
