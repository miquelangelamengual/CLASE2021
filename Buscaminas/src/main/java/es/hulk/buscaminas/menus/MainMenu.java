package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Board;
import es.hulk.buscaminas.utils.CC;
import es.hulk.buscaminas.utils.Utilities;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MainMenu {

    private Board board = Buscaminas.getBoard();

    public void init() {
        Utilities.logNewLine(CC.RESET + "Trii una de les seguents opcions");
        Utilities.logNewLine("");
        Utilities.logNewLine("1 - Principiant (Tauler 8x8 amb 10 mines");
        Utilities.logNewLine("2 - Normal (Tauler 16x16 amb 40 mines)");
        Utilities.logNewLine("3 - Dificil (Tauler 16x30 amb 99 mines");
        Utilities.logNewLine("4 - Personalitzat (Tauler maxim 200x200 amb x mines maxim");
        Utilities.logNewLine("");
        Utilities.logNewLine("5 - Surtir del programa");
        Utilities.logNewLine("");
        Utilities.log("Trii una de les opcions: ");
        int option = Utilities.readInt();
        switch (option) {
            case 1:
                generateBoard(8, 8, 0, 0);
                break;
            case 2:
                generateBoard(16, 16, 0, 0);
                break;
            case 3:
                generateBoard(16, 30, 0, 0);
                break;
            case 4:
                this.customBoard();
                break;
            case 5:
                Utilities.logNewLine(CC.RED + "Has sortit del Buscaminas");
                System.exit(0);
                break;
        }
    }

    public void generateBoard(int x, int y, int mines, int numFlags) {
        board = new Board(x, y, mines, numFlags);
        board.printBoard();
        new ElectionMenu().electionMenu();
    }

    public void customBoard() {
        Utilities.log("X: ");
        int x = Utilities.readInt();

        Utilities.log("Y: ");
        int y = Utilities.readInt();

        if (x >= 200 && y >= 200 || x <= 4 || y <= 4) {
            Utilities.logNewLine(CC.RED + "El tablero no puede ser menor de 4x4 o mayor de 200x200");
            init();
        }

        generateBoard(x, y, 0, 0);
    }
}
