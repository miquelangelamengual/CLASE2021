package es.hulk.programacio.sortAlgorithms;

/**
 * Created by Hulk
 * at 4/11/21 12:37
 */

public class BubbleSort {

    public static void applySort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int aux = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
