package es.hulk.programacio.exercises;

import es.hulk.programacio.utils.Colors;

/**
 * Created by Hulk
 * at 3/11/21 11:09
 */

public class ArraysExercises {

    public void twoDimensionalArray() {
        int[][] array = new int[5][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Colors.printColor("line", "green", " [ + ] ");
            }
            Colors.printColor("newline", "green", "[ + ]");
        }
    }

}
