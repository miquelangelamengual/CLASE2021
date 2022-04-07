package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Board;
import es.hulk.buscaminas.utils.Text;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MainMenu {

    private Board board = Buscaminas.getBoard();

    public void init() {
        Text.printMainMenu();
        int option = Text.readInt();
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
                Text.logNewLine(Text.LEFT_GAME);
                System.exit(0);
                break;
        }
    }

    private void customBoard() {
        Text.log(Text.CUSTOM_BOARD_ROWS);
        int x = Text.readInt();

        Text.log(Text.CUSTOM_BOARD_COLS);
        int y = Text.readInt();

        Text.log(Text.CUSTOM_BOARD_MINES);
        int mines = Text.readInt();

        if (x >= 200 && y >= 200 || x <= 4 || y <= 4) {
            Text.logNewLine(Text.CUSTOM_BOARD_ERROR);
            init();
        }

        generateBoard(x, y, mines, mines);
    }

    private void generateBoard(int x, int y, int mines, int numFlags) {
        board = new Board(x, y, mines, numFlags);
        board.printBoard();
        new ElectionMenu().electionMenu();
    }
}
