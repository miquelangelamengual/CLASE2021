package es.hulk.programacio.practiques.lettersoup;

import es.hulk.programacio.utils.Colors;

/**
 * Created by Hulk
 * At 10/11/21 12:29
 * By: github.com/miquelangelamengual
 */

public class LetterSoup {

    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
        System.out.println();

        for (String str : Board.getWords())
            if (board.isWord(str)) {
                Colors.printNewLine("purple", str + " its on the board");
                if (board.getAlignment() != ' ') {
                    if (board.getAlignment() == 'H') {
                        Colors.printNewLine("purple", "Alignment is Horizontal");
                    } else if (board.getAlignment() == 'V') {
                        Colors.printNewLine("purple", "Alignment is Vertical");
                    }
                }
                System.out.println();
            } else {
                System.out.println(str + " its not on the board");
            }
    }
}