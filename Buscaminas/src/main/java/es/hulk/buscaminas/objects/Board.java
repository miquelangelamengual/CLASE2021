package es.hulk.buscaminas.objects;

import es.hulk.buscaminas.utils.CC;

public class Board {

    private int rows; // X
    private int columns; // Y
    private int mines;
    private int numFlags;

    private Box[][] board;

    public Board(int rows, int columns, int mines, int numFlags) {
        this.rows = rows;
        this.columns = columns;
        board = new Box[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = new Box(i, j, mines, numFlags);
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].isFlag()) {
                    System.out.print(CC.CYAN + " [ F ]" + CC.RESET);
                } else if (board[i][j].isOpen()) {
                    System.out.print(CC.CYAN + " [ O ]" + CC.RESET);
                } else {
                    System.out.print(CC.RED + " [ T ] " + CC.RESET);
                }
            }
            System.out.println();
        }
    }

    public void putFlag(int x, int y) {
        if (board[x][y].isFlag()) {
            System.out.println("No puedes poner una bandera aqui");
            return;
        }

        board[x][y].setFlag(true);
        numFlags--;
    }
}
