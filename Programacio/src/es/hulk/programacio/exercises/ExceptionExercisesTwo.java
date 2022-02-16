package es.hulk.programacio.exercises;

public class ExceptionExercisesTwo {

    public static void fixException() {
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);
            System.out.println("After the calculation\n");
        } catch (Exception e) {
            System.out.println("Exception caught");
        } finally {
            System.out.println("Finally block");
        }
    }

    public static void testString() {
        try {
            String s = null;
            int length = s.length();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public static void method() {
        try {
            int x1 = Integer.MAX_VALUE;
            int x2 = Integer.MAX_VALUE - 1000;
            int x3 = Math.addExact(x1, x2);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public static void arrayOutOfBounds() {
        try {
            int arrayIndex = 14;
            int[] iArray = new int[5];
            iArray[arrayIndex] = 1500;
            System.out.println("After the array index access attempt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }
    }
}
