package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.objects.Board;
import es.hulk.buscaminas.utils.Colors;
import es.hulk.buscaminas.utils.Utilities;

import java.util.Scanner;

public class Menu {

    private Board board;

    public Menu() {
        this.init();
    }

    public void init() {
        Scanner scanner = new Scanner(System.in);
        Utilities.logNewLine(Colors.reset + "Trii una de les seguents opcions");
        Utilities.logNewLine("");
        Utilities.logNewLine("1 - Principiant (Tauler 8x8 amb 10 mines");
        Utilities.logNewLine("2 - Normal (Tauler 16x16 amb 40 mines)");
        Utilities.logNewLine("3 - Dificil (Tauler 16x30 amb 99 mines");
        Utilities.logNewLine("4 - Personalitzat (Tauler maxim 200x200 amb x mines maxim");
        Utilities.logNewLine("");
        Utilities.logNewLine("5 - Surtir del programa");
        Utilities.logNewLine("");
        Utilities.log("Trii una de les opcions: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1 -> {
                generateBoard(8, 8, 0, 0);
            }
            case 2 -> {
                generateBoard(16, 16, 0, 0);
            }
            case 3 -> {
                generateBoard(16, 30, 0, 0);
            }
            case 4 -> {
                Utilities.log("X: ");
                int x = scanner.nextInt();

                Utilities.log("Y: ");
                int y = scanner.nextInt();

                if (x >= 200 && y >= 200 || x <= 4 || y <= 4) {
                    Utilities.logNewLine(Colors.red + "El tablero no puede ser menor de 4x4 o mayor de 200x200");
                    init();
                }

                generateBoard(x, y, 0, 0);
            }
            case 5 -> {
                Utilities.logNewLine(Colors.red + "Has sortit del Buscaminas");
                System.exit(0);
            }
        }
    }

    public void generateBoard(int x, int y, int mines, int flags) {
        board = new Board(x, y);
        board.printBoard();
        init();
    }
}
