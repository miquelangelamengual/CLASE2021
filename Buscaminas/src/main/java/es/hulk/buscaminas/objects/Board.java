package es.hulk.buscaminas.objects;

import es.hulk.buscaminas.utils.CC;
import lombok.Getter;

public class Board {

    private final int rows; // X
    private final int columns; // Y
    private int mines;
    int minesAround = 0;

    @Getter private final Box[][] board;

    public Board(int rows, int columns, int mines) {
        this.rows = rows;
        this.columns = columns;
        this.mines = mines;
        board = new Box[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = new Box(i, j);
            }
        }
        this.putNumbers();
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(board[i][j].toString());
            }
            System.out.println();
        }
    }

    public void putRandomMines() {
        while (mines > 0) {
            int randomX = (int) (Math.random() * rows);
            int randomY = (int) (Math.random() * columns);
            if (!board[randomX][randomY].isMine()) {
                board[randomX][randomY].setMine(true);
                mines--;
            }
        }
    }

    public void putNumbers() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (!board[i][j].isMine()) {
                    int minesAround = 0;
                    if (i > 0 && j > 0 && board[i - 1][j - 1].isMine()) {
                        minesAround++;
                    }
                    if (i > 0 && board[i - 1][j].isMine()) {
                        minesAround++;
                    }
                    if (i > 0 && j < columns - 1 && board[i - 1][j + 1].isMine()) {
                        minesAround++;
                    }
                    if (j > 0 && board[i][j - 1].isMine()) {
                        minesAround++;
                    }
                    if (j < columns - 1 && board[i][j + 1].isMine()) {
                        minesAround++;
                    }
                    if (i < rows - 1 && j > 0 && board[i + 1][j - 1].isMine()) {
                        minesAround++;
                    }
                    if (i < rows - 1 && board[i + 1][j].isMine()) {
                        minesAround++;
                    }
                    if (i < rows - 1 && j < columns - 1 && board[i + 1][j + 1].isMine()) {
                        minesAround++;
                    }
                    board[i][j].setMinesAround(minesAround);
                }
            }
        }
    }

    public void printLastBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].isFlag()) {
                    System.out.print(CC.CYAN + " [ F ] " + CC.RESET);
                } else if (board[i][j].isOpen()) {
                    System.out.print(CC.GREEN + " [ O ] " + CC.RESET);
                } else {
                    System.out.print(CC.RED + " [   ] " + CC.RESET);
                }
            }
            System.out.println();
        }
    }
}
