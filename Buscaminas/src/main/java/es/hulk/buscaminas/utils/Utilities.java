package es.hulk.buscaminas.utils;

public class Utilities {

    public static void logNewLine(String str) {
        System.out.println(str);
    }

    public static void log(String str) {
        System.out.print(str);
    }

    public static void clear() {
        for (int i = 0; i <= 200; i++) {
            logNewLine("");
        }
    }

}
