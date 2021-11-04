package es.hulk.programacio.sortAlgorithms;

import es.hulk.programacio.utils.Color;

/**
 * Created by Hulk
 * at 4/11/21 12:37
 */

public class BubbleSort {

    public static void applySort(int[] arr, String mode) {

        if (!(mode.equals("desc") || mode.equals("asc"))) {
            Color.printColor("newline", "red", "Wrong mode, Available modes: desc or asc");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (mode.equals("desc")) {
                    if (arr[j - 1] > arr[j]) {
                        int aux = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = aux;
                    }
                } else if (mode.equals("asc")) {
                    if (arr[j - 1] < arr[j]) {
                        int aux = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = aux;
                    }
                }
            }
        }
    }

}
