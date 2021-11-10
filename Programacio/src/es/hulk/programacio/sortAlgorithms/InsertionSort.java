package es.hulk.programacio.sortAlgorithms;

/**
 * Created by Hulk
 * At 10/11/21 9:20
 * By: github.com/miquelangelamengual
 */

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            moveAndInsertInArray(arr, i);
        }
    }

    private static void moveAndInsertInArray(int[] arr, int index) {
        while (index > 0 && arr[index] < arr[index - 1]) {
            swapItemsOfArray(arr, index);
            index--;
        }
    }

    private static void swapItemsOfArray(int[] arr, int index) {
        int temp = arr[index];
        arr[index] = arr[index - 1];
        arr[index - 1] = temp;
    }
}