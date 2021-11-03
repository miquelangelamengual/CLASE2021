package es.hulk.programacio.utils;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@Getter
@UtilityClass
public class Color {

    public static final String reset = "\u001B[0m";

    public static final String black = "\u001B[30m";
    public static final String red = "\u001B[31m";
    public static final String green = "\u001B[32m";
    public static final String yellow = "\u001B[33m";
    public static final String blue = "\u001B[34m";
    public static final String purple = "\u001B[35m";
    public static final String cyan = "\u001B[36m";
    public static final String white = "\u001B[37m";

    public static void printColor(String mode, String color, String text) {
        if (mode.equals("newline")) {
            switch (color) {
                case "reset":
                    System.out.println(reset + text);
                    break;
                case "black":
                    System.out.println(black + text);
                    break;
                case "red":
                    System.out.println(red + text);
                    break;
                case "green":
                    System.out.println(green + text);
                    break;
                case "yellow":
                    System.out.println(yellow + text);
                    break;
                case "blue":
                    System.out.println(blue + text);
                    break;
                case "purple":
                    System.out.println(purple + text);
                    break;
                case "cyan":
                    System.out.println(cyan + text);
                    break;
                case "white":
                    System.out.println(white + text);
                    break;
            }
        } else if (mode.equals("line")) {
            switch (color) {
                case "reset":
                    System.out.print(reset + text);
                    break;
                case "black":
                    System.out.print(black + text);
                    break;
                case "red":
                    System.out.print(red + text);
                    break;
                case "green":
                    System.out.print(green + text);
                    break;
                case "yellow":
                    System.out.print(yellow + text);
                    break;
                case "blue":
                    System.out.print(blue + text);
                    break;
                case "purple":
                    System.out.print(purple + text);
                    break;
                case "cyan":
                    System.out.print(cyan + text);
                    break;
                case "white":
                    System.out.print(white + text);
                    break;
            }
        }
    }

    public static void noup() {
        Color.printColor("newline","red", "You are doing something wrong");
    }

}