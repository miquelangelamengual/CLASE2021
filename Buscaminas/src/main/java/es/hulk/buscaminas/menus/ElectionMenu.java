package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Box;
import es.hulk.buscaminas.utils.Text;
import es.hulk.buscaminas.utils.Utilities;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ElectionMenu {

    private MainMenu menu = Buscaminas.getMenu();
    private Box[][] box = Buscaminas.getMenu().getBoard().getBoard();

    public void electionMenu() {
        Text.printElectionMenu();
        int option = Utilities.readInt();

        Utilities.log("Elige una columna: ");
        int x = Utilities.readInt();

        Utilities.log("Elige una fila: ");
        int y = Utilities.readInt();

        switch (option) {
            case 1:
                box[x][y].openBox();
                this.printBoardAndElectionMenu();
                break;
            case 2:
                box[x][y].putFlag();
                this.printBoardAndElectionMenu();
                break;
            case 3:
                box[x][y].removeFlag();
                this.printBoardAndElectionMenu();
                break;
        }
    }

    public void printBoardAndElectionMenu() {
        menu.getBoard().printBoard();
        this.electionMenu();
    }
}
