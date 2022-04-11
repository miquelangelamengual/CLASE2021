package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Board;
import es.hulk.buscaminas.objects.Box;
import es.hulk.buscaminas.utils.Text;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ElectionMenu {

    private static final MainMenu menu = Buscaminas.getMenu();
    private final Box[][] box = Buscaminas.getMenu().getBoard().getBoard();
    private final Board board = Buscaminas.getBoard();
    @Getter public static boolean iteration = false;

    public void init() {
        Text.printElectionMenu();
        int option = Text.readInt();

        if (option == 3) {
            System.exit(404);
            return;
        }

        Text.log(Text.CUSTOM_BOARD_ROWS);
        int x = Text.readInt();

        Text.log(Text.CUSTOM_BOARD_COLS);
        int y = Text.readInt();

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
    }

    private void printBoardAndElectionMenu() {
        menu.getBoard().printBoard();
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
