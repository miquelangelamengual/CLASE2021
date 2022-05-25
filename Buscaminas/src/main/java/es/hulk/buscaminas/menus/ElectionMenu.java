package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Board;
import es.hulk.buscaminas.objects.Box;
import es.hulk.buscaminas.utils.ErrorCatching;
import es.hulk.buscaminas.utils.Text;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class ElectionMenu {

    private final Box[][] box = Buscaminas.getMenu().getBoard().getBoard();

    public void init() {
        Text.printElectionMenu();
        int option = ErrorCatching.returnChoseInt(0, 3);

        if (option == 3) {
            System.exit(404);
            return;
        }

        Text.log(Text.CUSTOM_BOARD_ROWS);
        int x = ErrorCatching.returnParseInt(true);

        Text.log(Text.CUSTOM_BOARD_COLS);
        int y = ErrorCatching.returnParseInt(true);

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
                System.out.println(Text.INVALID_POSITION);
                this.printBoardAndElectionMenu();
                break;
        }
    }

    private void printBoardAndElectionMenu() {
        Text.printBoard();
        this.init();
    }
}
