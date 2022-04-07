package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Board;
import es.hulk.buscaminas.utils.CC;
import es.hulk.buscaminas.utils.Text;
import es.hulk.buscaminas.utils.Utilities;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MainMenu {

    private Board board = Buscaminas.getBoard();

    public void init() {
        Text.printMainMenu();
        int option = Utilities.readInt();
        switch (option) {
            case 1:
                generateBoard(8, 8, 8, 8);
                break;
            case 2:
                generateBoard(16, 16, 40, 40);
                break;
            case 3:
                generateBoard(16, 30, 99, 99);
                break;
            case 4:
                this.customBoard();
                break;
            case 5:
                Utilities.logNewLine(Text.LEFT_GAME);
                System.exit(0);
                break;
        }
    }

    public void customBoard() {
        Utilities.log(Text.CUSTOM_BOARD_ROWS);
        int x = Utilities.readInt();

        Utilities.log(Text.CUSTOM_BOARD_COLS);
        int y = Utilities.readInt();

        Utilities.log(Text.CUSTOM_BOARD_MINES);
        int mines = Utilities.readInt();

        if (x >= 200 && y >= 200 || x <= 4 || y <= 4) {
            Utilities.logNewLine(Text.CUSTOM_BOARD_ERROR);
            init();
        }

        generateBoard(x, y, mines, mines);
    }

    private void generateBoard(int x, int y, int mines, int numFlags) {
        board = new Board(x, y, mines, numFlags);
        board.printBoard();
        System.out.println(mines + " minas");
        System.out.println(numFlags + " banderas");
        new ElectionMenu().electionMenu();
    }
}
