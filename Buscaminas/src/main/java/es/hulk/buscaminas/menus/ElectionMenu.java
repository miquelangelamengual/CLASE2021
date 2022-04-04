package es.hulk.buscaminas.menus;

import es.hulk.buscaminas.Buscaminas;
import es.hulk.buscaminas.objects.Box;
import es.hulk.buscaminas.utils.Utilities;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ElectionMenu {

    private MainMenu menu = Buscaminas.getMenu();
    private Box[][] box = menu.getBoard().getBoard();

    public void electionMenu() {
        Utilities.logNewLine("Elige una opción:");
        Utilities.logNewLine("");
        Utilities.logNewLine("1. Destapar casilla");
        Utilities.logNewLine("2. Poner bandera");
        Utilities.logNewLine("3. Eliminar bandera");
        Utilities.logNewLine("4. Salir");
        Utilities.logNewLine("");
        Utilities.logNewLine("Opción: ");
        int option = Utilities.readInt();

        Utilities.log("Elige una columna: ");
        int x = Utilities.readInt();

        Utilities.log("Elige una fila: ");
        int y = Utilities.readInt();

        switch (option) {
            case 1 -> {
                box[x][y].openBox();
                this.printBoardAndElectionMenu();
            }
            case 2 -> {
                box[x][y].putFlag();
                this.printBoardAndElectionMenu();
            }
            case 3 -> {
                box[x][y].removeFlag();
                this.printBoardAndElectionMenu();
            }
        }
    }

    public void printBoardAndElectionMenu() {
        menu.getBoard().printBoard();
        this.electionMenu();
    }
}
