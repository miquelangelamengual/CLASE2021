package es.hulk.buscaminas.objects;

import es.hulk.buscaminas.utils.Colors;

public class Board {

    private int rows; // X
    private int columns; // Y

    private Box[][] board;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        board = new Box[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = new Box(i, j);
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(Colors.red + " [ x ] ");
            }
            System.out.println();
        }
    }

}
