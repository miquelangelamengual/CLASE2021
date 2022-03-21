package es.hulk.programacio.examens.trimestre1;

import java.util.Arrays;

/**
 * Created by Hulk
 * at 09/12/2021
 * Project: CLASE2021
 * Class: ExamenPracticaTest
 */

public class ExamenPracticaTest {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] arr2 = {7,4,1,3,5,6};

        System.out.println(ExamenPractica.averageArrayCalulation(arr));
        System.out.println(ExamenPractica.minimumNumberIntoArray(arr));
        System.out.println(ExamenPractica.minimumIndexIntoArray(arr));
        System.out.println(ExamenPractica.maximumNumberIntoArray(arr));
        System.out.println(ExamenPractica.maximumIndexIntoArray(arr));
        System.out.println(ExamenPractica.isArraySortedAsc(arr));
        System.out.println(ExamenPractica.isArraySortedDesc(arr));
        System.out.println(Arrays.toString(ExamenPractica.reverseArray(arr)));
        System.out.println(ExamenPractica.searchIndex(arr, 4));
        System.out.println(ExamenPractica.searchNumberThatsCloseToAverageCalulation(arr));
    }

}
