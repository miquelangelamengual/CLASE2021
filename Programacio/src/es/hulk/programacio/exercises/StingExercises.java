package es.hulk.programacio.exercises;

/**
 * Created by Hulk
 * At 17/11/21 9:59
 * By: github.com/miquelangelamengual
 */

public class StingExercises {

    public static void ex1() {
        String c1 = null;
        String c2 = " suma ";
        String c3 = " Suma ";
        c2 = c3;
        c3 = null;
        if (c3 == c2) {
            System.out.println(" Dentro If ");
        } else if (c2.equals(" suma ") || c1 == null || c3.equals(" Suma ")) {
            System.out.println(" Dentro Else - If ");
        } else {
            System.out.println(" Dentro Else ");
        }
    }


    public static void ex2() {
        String str1 = "Hola";
        String str2 = "Hola";

        boolean result1 = str1 == str2;
        boolean result2 = str1.equals(str2);
        System.out.println("Resutl1 value: " + result1);
        System.out.println("Resutl2 value: " + result2);
    }

    static double global = 5;

    public static void ex3() {
        metodo(3, "global");
        System.out.println((int) global);
    }

    private static void metodo(int num, String cadena) {
        switch (cadena.charAt(cadena.length() - 1)) {
            case 'f':
                global += num;
                break;
            case 'r':
                global -= num;
                break;
            case 'l':
                global *= num;
                break;
            default:
                global /= num;
        }
    }

    public static void ex4() {
        int valor;
        int x = metodo1();
        int y = metodo2(x);

        if (x == 7 && y == 2 || x == 6 && y == 7) valor = metodo3(x, y);
        else valor = metodo4(x, y);

        System.out.println(valor);
    }

    public static int metodo1() {
        int a = 5;
        int b = ++a + 1;
        return b;
    }

    public static int metodo2(int x) {
        int y = (int) 17 / x;
        return y;
    }

    public static int metodo3(int x, int y) {
        return y % x;
    }

    public static int metodo4(int x, int y) {
        return (x < y ? x + 1 : x - 1);
    }

}
