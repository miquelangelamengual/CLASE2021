package es.hulk.programacio.exercises;

/**
 * Created by Hulk
 * at 8/11/21 12:43
 */

public class BooleanConditionalStringExercises {


    public static void main(String[] args) {
        isEqual();
    }

    public static void isEqual() {
        boolean result;
        int x = 5;
        int y = 7;
        result = x == y;
        System.out.println("x == y: " + result);
    }

    public static void isGreater() {
        boolean result;

        int x = 5;
        int y = 7;

        result = x > y;
        System.out.println("x > y: " + result);
    }

    public static void isLessOrEqual() {

        boolean result;

        int x = 5;
        int y = 7;

        result = x <= y;
        System.out.println("x <= y: " + result);
    }

    public static void isGreaterOrEqual() {
        boolean result;

        int x = 5;
        int y = 7;

        result = x >= y;
        System.out.println("x >= y: " + result);
    }

    public static void isLess() {
        boolean result;

        int x = 5;
        int y = 7;

        result = x < y;
        System.out.println("x < y: " + result);
    }


    public static void isNotEqual() {
        boolean result;

        int x = 5;
        int y = 7;

        result = x != y;
        System.out.println("x != y: " + result);
    }


    public static void isNotGreaterOrEqual() {
        boolean result;

        int x = 5;
        int y = 7;

        result = !(x > y);
        System.out.println("x < y: " + result);
    }

    public static void isTrueOrFalse() {
        boolean x = false;
        boolean y = true;

        boolean result = x == y;

        System.out.println("x == y: " + result);
    }

    public static void wtfIsThis() {
        int x, y;

        x = 1; y = 1;
        if (x > 5 & y > 7) System.out.println("x > 1 && y > 7");

        x = 6; y = 7;
        if (x > 5 & y > 7) System.out.println("x > 1 && y > 7");

        x = 15; y = 15;
        if (x > 5 & y > 7) System.out.println("x > 1 && y > 7");
    }



}
