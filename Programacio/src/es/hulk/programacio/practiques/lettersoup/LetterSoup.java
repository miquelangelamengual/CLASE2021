package es.hulk.programacio.practiques.lettersoup;

import es.hulk.programacio.practiques.lettersoup.Board;

/**
 * Created by Hulk
 * At 10/11/21 12:29
 * By: github.com/miquelangelamengual
 */

public class LetterSoup {

    public static void main(String[] args) {
        Board board = new Board();
        board.initBoard();
        board.printBoard();
        System.out.println();

        for (int i = 0; i < Board.getWords().length; i++) {
            if (board.isWord(Board.getWords()[i]) && board.getAlignment(Board.getWords()[i]) != ' ')  {
                System.out.println(Board.getWords()[i] + " its on the board");
                System.out.println("Alignment: " + board.getAlignment(Board.getWords()[i]));
            } else {
                System.out.println(Board.getWords()[i] + " its not on the board");
            }
        }
    }

}