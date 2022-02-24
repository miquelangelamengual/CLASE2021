package es.hulk.programacio.utils;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Colors {

    @Getter
    private static final String reset = "\u001B[0m";

    @Getter
    private static final String black = "\u001B[30m";
    @Getter
    private static final String red = "\u001B[31m";
    @Getter
    private static final String green = "\u001B[32m";
    @Getter
    private static final String yellow = "\u001B[33m";
    @Getter
    private static final String blue = "\u001B[34m";
    @Getter
    private static final String purple = "\u001B[35m";
    @Getter
    private static final String cyan = "\u001B[36m";
    @Getter
    private static final String white = "\u001B[37m";

    public static void printColor(String mode, String color, String text) {
        if (mode.equals("newline")) {
            newLineColor(color, text);
        } else if (mode.equals("line")) {
            printLine(color, text);
        }
    }


    public static void printLine(String color, String text) {
        switch (color) {
            case "reset" -> System.out.print(reset + text);
            case "black" -> System.out.print(black + text);
            case "red" -> System.out.print(red + text);
            case "green" -> System.out.print(green + text);
            case "yellow" -> System.out.print(yellow + text);
            case "blue" -> System.out.print(blue + text);
            case "purple" -> System.out.print(purple + text);
            case "cyan" -> System.out.print(cyan + text);
            case "white" -> System.out.print(white + text);
        }
    }

    public static void printNewLine(String color, String text) {
        newLineColor(color, text);
    }

    private static void newLineColor(String color, String text) {
        switch (color) {
            case "reset" -> System.out.println(reset + text);
            case "black" -> System.out.println(black + text);
            case "red" -> System.out.println(red + text);
            case "green" -> System.out.println(green + text);
            case "yellow" -> System.out.println(yellow + text);
            case "blue" -> System.out.println(blue + text);
            case "purple" -> System.out.println(purple + text);
            case "cyan" -> System.out.println(cyan + text);
            case "white" -> System.out.println(white + text);
        }
    }

    public static void noup() {
        Colors.printNewLine("red", "You are doing something wrong");
    }

    public static void error(Exception e) {
        Colors.printNewLine("red", "ERROR: " + e);
    }

}
