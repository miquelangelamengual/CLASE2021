package es.hulk.programacio.exercises;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Hulk
 * at 3/11/21 11:09
 */

public class ArraysExercises {

    public void printArray(String mode) {
        mode = mode.toUpperCase(Locale.ROOT);
        if (mode.equals("NON-LOOP")) {
            int[] array = new int[10];

            array[0] = 1;
            array[1] = 2;
            array[2] = 3;
            array[3] = 4;
            array[4] = 5;
            array[5] = 6;
            array[6] = 7;
            array[7] = 8;
            array[8] = 9;
            array[9] = 10;

            System.out.print(array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4] + " " + array[5] + " " + array[6] + " " + array[7] + " " + array[8] + " " + array[9] + " ");
        } else if (mode.equals("LOOP")) {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public void insertNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void reverseInsertNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public void saveNumbersInArray() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            total += array[i];
        }

        System.out.println(total);
    }

    public void charArrayToString() {
        char[] array = {'h', 'u', 'l', 'k'};
        String str = "";

        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }

        System.out.println(str);
    }

    public void intArrayToString() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String str = "";

        for (int i = 0; i < array.length; i++) {
            str += array[i];
        }

        System.out.println(str);
    }

    public void averageCalculate() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int avg = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            avg = sum / array.length;
        }

        System.out.println((double) avg);
    }

    public void insertArraysIntoOne() {
        int[] arrayA = {3, 4, 1};
        int[] arrayB = {2, 7, 5};
        int[] arrayC = new int[6];

        for (int i = 0; i < 3; i++) {
            arrayC[i * 2] = arrayA[i];
            arrayC[i * 2 + 1] = arrayB[i];
        }

        for (int i = 0; i < arrayC.length; i++) {
            System.out.print(arrayC[i] + " ");
        }
    }

    public void isArraySorted() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean isAsc = true;
        boolean isDesc = true;

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i + 1]) {
                isAsc = false;
            } else if (array[i] < array[i + 1]) {
                isDesc = false;
            }
        }

        if (isAsc) {
            System.out.println("Ascending");
        } else if (isDesc) {
            System.out.println("Descending");
        } else {
            System.out.println("Not Sorted");
        }
    }

    public void introduceNumbersTill0() {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while (num != 0) {
            num = scanner.nextInt();
            if (num > 0) {
                positives.add(num);
            } else if (num < 0) {
                negatives.add(num);
            }
        }

        System.out.println("Positive numbers: " + positives);
        System.out.println("Negative numbers: " + negatives);
    }

    public void saveCharIntoArray() {
        char[] array = new char[5];
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next().charAt(0);
        }

        for (char c : array) {
            if (c == 'x') {
                count++;
            }
            System.out.print(c + " ");
        }

        System.out.println("Number of letter x found: " + count);
    }

    public void countXonCharArray() {
        char[] array = new char[5];
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        boolean yFound = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next().charAt(0);
        }

        for (char c : array) {
            if (c == 'y') {
                yFound = true;
            }
            if (yFound && c == 'x') {
                count++;
            }
        }

        System.out.println("Number of letter x found: " + count);
    }
}
