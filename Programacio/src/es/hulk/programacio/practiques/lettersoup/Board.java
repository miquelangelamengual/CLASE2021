package es.hulk.programacio.practiques.lettersoup;

import es.hulk.programacio.utils.Colors;

import java.util.Random;

/**
 * Created by Hulk
 * At 10/11/21 12:35
 * By: github.com/miquelangelamengual
 */

public class Board {

    private int size;
    private final char[][] board;
    private char[] letter = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public Board(int size) {
        this.size = size;
        this.board = new char[size][size];
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = randomLetter();
                Colors.printColor("line", "reset", " [ " + board[i][j] + " ] ");
            }
            System.out.println();
        }
    }

    public char randomLetter() {
        Random randomLetter = new Random();
        for (int i = 0; i < letter.length; i++) {
            return letter[randomLetter.nextInt(size)];
        }
        return 0;
    }
}
