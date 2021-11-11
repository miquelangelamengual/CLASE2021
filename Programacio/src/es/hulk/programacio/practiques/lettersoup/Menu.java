package es.hulk.programacio.practiques.lettersoup;

import es.hulk.programacio.utils.Colors;

import java.util.Scanner;

/**
 * Created by Hulk
 * At 10/11/21 12:30
 * By: github.com/miquelangelamengual
 */

public class Menu {

    private static int option;
    private static final Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println();
        Colors.printColor("newline", "cyan", "Lettersoup");
        System.out.println();
        Colors.printColor("newline", "cyan", "1 - Start");
        Colors.printColor("newline", "cyan", "2 - Custom");
        Colors.printColor("newline", "cyan", "3 - Exit");
        System.out.println();
        Colors.printColor("line", "purple", "Option: ");
        option = scanner.nextInt();
        switch (option) {
            case 1:
                Board board = new Board(10);
                board.initBoard();
                board.printBoard();
                break;
            case 2:
                Colors.printColor("newline", "purple", "Enter the size of the board");
                int size = scanner.nextInt();

                if (size > 100) {
                    Colors.printColor("newline", "red", "The size of the board can't be greater than 100");
                    return;
                }

                Board board2 = new Board(size);
                board2.printBoard();
                break;
        }
    }
}