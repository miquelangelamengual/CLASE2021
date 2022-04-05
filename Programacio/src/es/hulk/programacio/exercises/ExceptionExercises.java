package es.hulk.programacio.exercises;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hulk
 * at 09/12/2021
 * Project: CLASE2021
 * Class: ExceptionExercises
 */

public class ExceptionExercises {

    private static final Scanner scanner = new Scanner(System.in);

    public static void dividePerZero() {
        int num = scanner.nextInt();

        try {
            System.out.println(num / 0);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        } finally {
            System.out.println("Fin del programa");
        }
    }

    public static void inputControl() {
        int num = scanner.nextInt();

        try {
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("Error de entrada");
        } finally {
            System.out.println("Fin del programa");
        }
    }

    public static void convertStringToInteger() {
        String num = scanner.next();

        try {
            System.out.println(Integer.parseInt(num));
        } catch (NumberFormatException e) {
            System.out.println("Error de formato");
        } finally {
            System.out.println("Fin del programa");
        }
    }

    public static void convertToMoro() {
        String num = scanner.next();
        String num2 = scanner.next();

        try {
            int div = Integer.parseInt(num) / Integer.parseInt(num2);
            System.out.println(div);
        } catch (NumberFormatException e) {
            System.out.println("Error de formato");
        } finally {
            System.out.println("Fin del programa");
        }
    }

    public static void outOfBounds() {
        String[] args = new String[5];
        List<String> list = new ArrayList<>();

        try {
            System.out.println(list.get(5));
            System.out.println(args[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error de formato");
        } finally {
            System.out.println("Fin del programa");
        }
    }

    public static void main(String[] args) throws Exception {

        File myFile = new File("file.txt");
        readFile(myFile);

    }

    public static void readFile(File file) throws IOException {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

}
