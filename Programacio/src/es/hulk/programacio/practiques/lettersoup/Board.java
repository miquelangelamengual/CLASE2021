package es.hulk.programacio.practiques.lettersoup;

import es.hulk.programacio.utils.Colors;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

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

    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '\u0000') {
                    Colors.printColor("line", "reset", " [ " + Colors.getYellow() + board[i][j] + Colors.getReset() + " ] ");
                } else {
                    board[i][j] = randomLetter();
                    Colors.printColor("line", "reset", " [ " + Colors.getYellow() + board[i][j] + Colors.getReset() + " ] ");
                }
            }
            System.out.println();
        }
        getWords();
    }

    private char randomLetter() {
        Random r = new Random();
        int random = r.nextInt(size);
        return letter[random];
    }

    public void getWords() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        String word = "";
        for (int i = x; i <= x2; i++) {
            for (int j = y; j <= y2; j++) {
                word += board[i][j];
            }
        }
        Colors.printColor("newline", "purple", "The word is: " + Colors.getCyan() + word);
        printBoard();
    }

}
