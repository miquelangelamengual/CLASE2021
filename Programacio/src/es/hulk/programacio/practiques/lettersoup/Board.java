package es.hulk.programacio.practiques.lettersoup;

import es.hulk.programacio.utils.Colors;

import java.util.Locale;
import java.util.Random;

/**
 * Created by Hulk
 * At 10/11/21 12:35
 * By: github.com/miquelangelamengual
 */

public class Board {

    private int size;
    private final char[][] board;
    private char[] letter = "abcdefghijklmnopqrstuvwxyz".toUpperCase(Locale.ROOT).toCharArray();

    public Board(int size) {
        this.size = size;
        this.board = new char[size][size];
    }

    public void initBoard() {

        for (int i = 0; i < Words.babosa.length(); i++) {
            board[0][i] = Words.babosa.charAt(i);
        }

        for (int i = 0; i < Words.blando.length(); i++) {
            board[1][i] = Words.blando.charAt(i);
        }

        for (int i = 0; i < Words.camisas.length(); i++) {
            board[2][i] = Words.camisas.charAt(i);
        }

        for (int i = 0; i < Words.oslo.length(); i++) {
            board[5][i] = Words.oslo.charAt(i);
        }

        for (int i = 0; i < Words.pasillo.length(); i++) {
            board[7][i] = Words.pasillo.charAt(i);
        }

        for (int i = 0; i < Words.pestañas.length(); i++) {
            board[8][i] = Words.pestañas.charAt(i);
        }

        for (int i = 0; i < Words.sibelius.length(); i++) {
            board[9][i] = Words.sibelius.charAt(i);
        }

        for (int i = 0; i < Words.suecia.length(); i++) {
            board[10][i] = Words.suecia.charAt(i);
        }

        for (int i = 0; i < Words.tormenta.length(); i++) {
            board[11][i] = Words.tormenta.charAt(i);
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '\u0000') {
                    Colors.printColor("line", "reset", " [ " + board[i][j] + " ] ");
                } else {
                    board[i][j] = randomLetter();
                    Colors.printColor("line", "reset", " [ " + board[i][j] + " ] ");
                }
            }
            System.out.println();
        }
    }

    private char randomLetter() {
        Random r = new Random();
        int random = r.nextInt(size);
        return letter[random];
    }

    public void getWords() {

    }

}
