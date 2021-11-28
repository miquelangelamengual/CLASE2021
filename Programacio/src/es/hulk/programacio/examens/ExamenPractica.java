package es.hulk.programacio.examens;

/**
 * Created by Hulk
 * At 24/11/21 11:23
 * By: github.com/miquelangelamengual
 */

public class ExamenPractica {

    public static int averageArrayCalulation(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            counter += array[i];
        }

        return counter / array.length;
    }

    public static int minimumNumberIntoArray(int[] array) {
        int aux = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < aux) {
                aux = array[i];
            }
        }
        return aux;
    }

    public static int minimumIndexIntoArray(int[] array) {
        int aux = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < aux) {
                aux = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int maximumNumberIntoArray(int[] array) {
        int aux = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > aux) {
                aux = array[i];
            }
        }
        return aux;
    }

    public static int maximumIndexIntoArray(int[] array) {
        int aux = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > aux) {
                aux = array[i];
                index = i;
            }
        }
        return index;
    }

    public static boolean isArraySortedAsc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArraySortedDesc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static int[] reverseArray(int[] array) {
        int[] aux = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            aux[i] = array[array.length - 1 - i];
        }

        return aux;
    }

    public static int searchIndex(int[] array, int index) {
        int aux = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == index) {
                aux++;
            }
        }

        if (aux >= 2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static int searchNumberThatsCloseToAverageCalulation(int[] array) {
        int count = 0;
        int aux = 0;

        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }

        int average = count / array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > average - 1 && array[i] < average + 1) {
                array[i] = average;
            }
        }
        return aux;
    }

    public static int[] sortPerIndex(int[] array, int index) {
        int aux = 0;

        for (int i = index; i < index - 1; i--) {
            if (array[i] < array[i - 1]) {
                aux = array[i];
                array[i] = array[i - 1];
                array[i - 1] = aux;
            }
        }

        return array;
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1; j < array.length - 1; j++) {
                if (array[i] < array[j - 1]) {
                    int aux = array[j-1];
                    array[j-1] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
}
