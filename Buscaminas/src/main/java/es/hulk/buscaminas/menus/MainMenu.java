package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Board;
import es.hulk.buscaminas.utils.ErrorCatching;
import es.hulk.buscaminas.utils.Text;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Getter
public class MainMenu {

    private Board board = Buscaminas.getBoard();
    private Scanner scanner = new Scanner(System.in);

    public void init() {
        Text.printMainMenu();
        int option = ErrorCatching.returnChoseInt(0, 6);
        switch (option) {
            case 1:
                generateBoard(8, 8, 8);
                break;
            case 2:
                generateBoard(16, 16, 40);
                break;
            case 3:
                generateBoard(16, 30, 99);
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
        int x = ErrorCatching.returnParseInt(false);

        Text.log(Text.CUSTOM_BOARD_COLS);
        int y = ErrorCatching.returnParseInt(false);

        Text.log(Text.CUSTOM_BOARD_MINES);
        int mines = ErrorCatching.returnParseInt(false);

        if (x > 200 && y > 200 || x < 4 || y < 4) {
            Text.logNewLine(Text.CUSTOM_BOARD_ERROR);
            init();
        }

        generateBoard(x, y, mines);
    }

    private void generateBoard(int x, int y, int mines) {
        board = new Board(x, y, mines);
        Text.printBoard();
        new ElectionMenu().init();
    }
}
