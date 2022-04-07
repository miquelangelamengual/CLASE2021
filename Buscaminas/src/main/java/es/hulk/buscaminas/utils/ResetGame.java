package es.hulk.buscaminas.utils;

import es.hulk.buscaminas.menus.ElectionMenu;
import es.hulk.buscaminas.menus.MainMenu;
import es.hulk.buscaminas.objects.Board;
import lombok.experimental.UtilityClass;

@UtilityClass
public class ResetGame {

    private MainMenu menu;
    private Board board;

    public void resetGame() {
        menu = new MainMenu();
        board = menu.getBoard();
        menu.init();
    }

    public void askResetGame() {
        Text.log(Text.RESET_GAME);
        String reset = Text.readString();

        if (reset.equals("yes")) {
            ResetGame.resetGame();
        } else if (reset.equals("no")) {
            new ElectionMenu().electionMenu();
        }
    }
}
