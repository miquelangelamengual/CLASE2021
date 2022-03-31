package es.hulk.buscaminas.utils;

public class Utilities {

    public static void logNewLine(String s) {
        System.out.println(s);
    }

    public static void log(String s) {
        System.out.print(s);
    }

    public static void clear() {
        for (int i = 0; i <= 200; i++) {
            logNewLine("");
        }
    }

}
