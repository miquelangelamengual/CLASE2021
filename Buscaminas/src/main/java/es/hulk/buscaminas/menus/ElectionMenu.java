package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Box;
import es.hulk.buscaminas.utils.ResetGame;
import es.hulk.buscaminas.utils.Text;
import es.hulk.buscaminas.utils.Utilities;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ElectionMenu {

    private MainMenu menu = Buscaminas.getMenu();
    private Box[][] box = Buscaminas.getMenu().getBoard().getBoard();

    private int x;
    private int y;

    public void electionMenu() {
        Text.printElectionMenu();
        int option = Utilities.readInt();

        switch (option) {
            case 1:
                this.askNumbers(x, y);
                box[x][y].openBox();
                this.printBoardAndElectionMenu();
                break;
            case 2:
                this.askNumbers(x, y);
                box[x][y].putFlag();
                this.printBoardAndElectionMenu();
                break;
            case 3:
                this.askNumbers(x, y);
                box[x][y].removeFlag();
                this.printBoardAndElectionMenu();
                break;
            case 4:
                ResetGame.askResetGame();
                break;
            case 5:
                System.exit(404);
                break;
        }
    }

    public void printBoardAndElectionMenu() {
        menu.getBoard().printBoard();
        this.electionMenu();
    }

    private void askNumbers(int x, int y) {
        Utilities.log(Text.CUSTOM_BOARD_ROWS);
        x = Utilities.readInt();

        Utilities.log(Text.CUSTOM_BOARD_COLS);
        y = Utilities.readInt();
    }
}
