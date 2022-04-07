package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Box;
import es.hulk.buscaminas.utils.Text;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ElectionMenu {

    private MainMenu menu = Buscaminas.getMenu();
    private Box[][] box = Buscaminas.getMenu().getBoard().getBoard();

    private int x;
    private int y;

    public void electionMenu() {
        Text.printElectionMenu();
        int option = Text.readInt();

        if (option == 3) {
            System.exit(404);
            return;
        }

        Text.log(Text.CUSTOM_BOARD_ROWS);
        x = Text.readInt();

        Text.log(Text.CUSTOM_BOARD_COLS);
        y = Text.readInt();

        switch (option) {
            case 1:
                box[x][y].openBox();
                this.printBoardAndElectionMenu();
                break;
            case 2:
                box[x][y].changeFlag();
                this.printBoardAndElectionMenu();
                break;
        }
    }

    private void printBoardAndElectionMenu() {
        menu.getBoard().printBoard();
        this.electionMenu();
    }
}
