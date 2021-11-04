package es.hulk.programacio.sortAlgorithms;

import com.sun.istack.internal.NotNull;
import es.hulk.programacio.utils.Color;

import java.util.Arrays;

/**
 * Created by Hulk
 * at 4/11/21 11:23
 */

public class SelectionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int aux = arr[i];
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
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
