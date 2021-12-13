package es.hulk.programacio.exercises;

import es.hulk.programacio.utils.Colors;

/**
 * Created by Hulk
 * At 24/11/21 9:52
 * By: github.com/miquelangelamengual
 */

public class ConditionalsWithMethodsExercises {

    public static boolean positiveOrNegative(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean multiplyOfTwo(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int isGreter(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static int dayOfWeek(int num) {
        switch (num) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                return 0;
        }
    }

    public static String hourTime(int hour) {
        if (hour >= 8 && hour <= 12) {
            return "Mati";
        }

        if (hour >= 12 && hour <= 17) {
            return "Migdia";
        }

        if (hour >= 17 && hour <= 20) {
            return "Horabaixa";
        }

        if (hour >= 20 && hour <= 23) {
            return "Vespre";
        }
        return null;
    }

    public static String marks(int mark) {

        if (mark >= 0 && mark <= 4) {
            return "Insuficient";
        }

        if (mark == 5) {
            return "Suficient";
        }

        if (mark == 6) {
            return "Be";
        }

        if (mark == 7 || mark == 8) {
            return "Notable";
        }

        if (mark == 9 || mark == 10) {
            return "Excelent";
        }
        return null;
    }

    public boolean dateTime(int d, int m, int y) {

        if (d > 30) {
            return false;
        }
        if (m > 12) {
            return false;
        }
        if (y > 3000) {
            return false;
        }

        return true;
    }

    public static String checkAge(int age) {
        if (age >= 18) {
            return "Major";
        } else {
            return "Menor";
        }
    }


}
