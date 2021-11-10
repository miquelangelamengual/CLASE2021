package es.hulk.programacio.practiques.lettersoup;

/**
 * Created by Hulk
 * At 10/11/21 12:35
 * By: github.com/miquelangelamengual
 */

public class Board {

    private final char[][] board;
    private char[] letter = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public Board(int size) {
        this.board = new char[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                //Colors.printColor("line", "reset", " [ " +   " ] ");
                board[i][j] = randomLetter();

            }
            System.out.println();
        }
    }

    public char randomLetter() {
        for (int i = 0 ; i < letter.length; i++) {
            return letter[i];
        }
        return 0;
    }
}
