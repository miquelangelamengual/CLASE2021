package es.hulk.programacio.sortAlgorithms;

/**
 * Created by Hulk
 * At 10/11/21 9:20
 * By: github.com/miquelangelamengual
 */

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insertLoop(arr, i);
        }
    }

    //Thats a method that move and insert numbers into a subarray to sort them.
    private static void insertLoop(int[] arr, int index) {
        while (index > 0 && arr[index] < arr[index - 1]) {
            swapItems(arr, index);
            index--;
        }
    }

    //This method swap elements of array.
    private static void swapItems(int[] arr, int index) {
        int temp = arr[index];
        arr[index] = arr[index - 1];
        arr[index - 1] = temp;
    }
}