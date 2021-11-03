package es.hulk.programacio.utils;

import lombok.experimental.UtilityClass;

/**
 * Created by Hulk
 * at 3/11/21 11:27
 */

@UtilityClass
public class Utils {

    public void numberPositiveOrNegative(int x) {
        if (x == 0) return;

        if (x > 0) {
            Color.printColor("newline", "green", "Number is " + x + " is positive");
        } else {
            Color.printColor("newline", "green", "Number is " + x + " is negative");
        }
    }

}
