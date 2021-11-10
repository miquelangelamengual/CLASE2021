package es.hulk.programacio.sortAlgorithms;

/**
 * Created by Hulk
 * at 4/11/21 11:23
 */

public class SelectionSort {

    public static void applySort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int aux = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (aux > arr[j]) {
                    aux = arr[j];
                    index = j;
                }
            }

            aux = arr[i];
            arr[i] = arr[index];
            arr[index] = aux;
            System.out.println(arr[i]);
        }
    }

}
