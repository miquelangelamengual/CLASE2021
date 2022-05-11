package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Board;
import es.hulk.buscaminas.utils.Text;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Getter
@NoArgsConstructor
public class MainMenu {

    private Board board = Buscaminas.getBoard();

    public void init() {
        try {
            Scanner scanner = new Scanner(System.in);
            Text.printMainMenu();
            int option = scanner.nextInt();
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
        } catch (Exception e) {
            this.init();
        }
    }

    private void customBoard() {
        try {
            Scanner scanner = new Scanner(System.in);
            Text.log(Text.CUSTOM_BOARD_ROWS);
            int x = scanner.nextInt();

            Text.log(Text.CUSTOM_BOARD_COLS);
            int y = scanner.nextInt();

            Text.log(Text.CUSTOM_BOARD_MINES);
            int mines = scanner.nextInt();

            if (x > 200 && y > 200 || x < 4 || y < 4) {
                Text.logNewLine(Text.CUSTOM_BOARD_ERROR);
                init();
            }

            generateBoard(x, y, mines);
        } catch (Exception exception) {
            this.customBoard();
        }
    }

    private void generateBoard(int x, int y, int mines) {
        board = new Board(x, y, mines);
        Text.printBoard();
        new ElectionMenu().init();
    }
}
