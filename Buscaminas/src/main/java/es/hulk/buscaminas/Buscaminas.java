package es.hulk.buscaminas;


import es.hulk.buscaminas.menus.MainMenu;
import es.hulk.buscaminas.objects.Board;
import lombok.Getter;

public class Buscaminas {

    @Getter private static MainMenu menu;
    @Getter private static Board board;

    public static void main(String[] args) {
        menu = new MainMenu();
        board = menu.getBoard();

        menu.init();
    }
}


