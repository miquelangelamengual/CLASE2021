package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Board;
import es.hulk.buscaminas.objects.Box;
import es.hulk.buscaminas.utils.Text;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class ElectionMenu {

    private static final MainMenu menu = Buscaminas.getMenu();
    private final Box[][] box = Buscaminas.getMenu().getBoard().getBoard();
    private final Board board = Buscaminas.getBoard();

    @Getter
    public static boolean iteration = false;

    public void init() {
        try {
            Scanner scanner = new Scanner(System.in);
            Text.printElectionMenu();
            int option = scanner.nextInt();

            if (option == 3) {
                System.exit(404);
                return;
            }

            Text.log(Text.CUSTOM_BOARD_ROWS);
            int x = scanner.nextInt();

            Text.log(Text.CUSTOM_BOARD_COLS);
            int y = scanner.nextInt();

            switch (option) {
                case 1:
                    box[x][y].openBox();
                    this.printBoardAndElectionMenu();
                    break;
                case 2:
                    box[x][y].changeFlag();
                    this.printBoardAndElectionMenu();
                    break;
                default:
                    this.init();
                    break;
            }
        } catch (Exception e) {
            this.init();
        }
    }

    private void printBoardAndElectionMenu() {
        Text.printBoard();
        this.secondIteration();
        this.init();
    }

    public void secondIteration() {
        if (!iteration) {
            menu.getBoard().putNumbers();
            menu.getBoard().putRandomMines();

            iteration = true;
        }
    }
}
