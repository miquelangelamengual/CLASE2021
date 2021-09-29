package es.hulk.programacio;

import java.util.Scanner;

/**
 * Created by Hulk
 * at 27/09/2021 9:52
 */

public class Programacio {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(suma());
    }

    public static void scanner() {
        String scan = scanner.nextLine();
        System.out.println(scan);
    }

    public static int suma() {
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        return num + num2;
    }

}
