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
            Colors.printColor("newline", "green", "Number is " + x + " is positive");
        } else {
            Colors.printColor("newline", "green", "Number is " + x + " is negative");
        }
    }

    public void isHigherOrLower(int playerNum, int hiddenNum) {
        if (playerNum > hiddenNum) {
            Colors.printColor("newline", "red", "This number is higher than the number i want");
        }

        if (playerNum < hiddenNum) {
            Colors.printColor("newline", "red", "This number is lower than the number i want");
        }
    }

}
