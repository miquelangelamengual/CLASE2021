package es.hulk.programacio.practiques.lettersoup;

/**
 * Created by Hulk
 * At 10/11/21 12:35
 * By: github.com/miquelangelamengual
 */

public class Board {

    private final int SIZE = 10;
    private final char[][] board = new char[SIZE][SIZE];
    private final String[] words = {"AVISPA", "AVION", "NEVERA", "VACA", "VASO", "VELETA", "VERANO"};

    public Board() {
        initBoard();
    }

    //Method to init the board
    public void initBoard() {

        // FIRST COLUMN
        board[0][0] = 'D';
        board[0][1] = 'U';
        board[0][2] = 'E';
        board[0][3] = 'V';
        board[0][4] = 'I';
        board[0][5] = 'J';
        board[0][6] = 'D';
        board[0][7] = 'H';
        board[0][8] = 'R';
        board[0][9] = 'D';

        // SECOND COLUMN
        board[1][0] = 'R';
        board[1][1] = 'V';
        board[1][2] = 'E';
        board[1][3] = 'R';
        board[1][4] = 'A';
        board[1][5] = 'N';
        board[1][6] = 'O';
        board[1][7] = 'K';
        board[1][8] = 'T';
        board[1][9] = 'C';

        // THIRD COLUMN
        board[2][0] = 'D';
        board[2][1] = 'Y';
        board[2][2] = 'V';
        board[2][3] = 'E';
        board[2][4] = 'L';
        board[2][5] = 'E';
        board[2][6] = 'T';
        board[2][7] = 'A';
        board[2][8] = 'K';
        board[2][9] = 'H';

        // FOURTH COLUMN
        board[3][0] = 'O';
        board[3][1] = 'V';
        board[3][2] = 'A';
        board[3][3] = 'P';
        board[3][4] = 'N';
        board[3][5] = 'E';
        board[3][6] = 'V';
        board[3][7] = 'E';
        board[3][8] = 'R';
        board[3][9] = 'A';

        // FIFTH COLUMN
        board[4][0] = 'F';
        board[4][1] = 'A';
        board[4][2] = 'V';
        board[4][3] = 'I';
        board[4][4] = 'K';
        board[4][5] = 'G';
        board[4][6] = 'E';
        board[4][7] = 'P';
        board[4][8] = 'C';
        board[4][9] = 'C';

        // SIXTH COLUMN
        board[5][0] = 'M';
        board[5][1] = 'P';
        board[5][2] = 'I';
        board[5][3] = 'V';
        board[5][4] = 'A';
        board[5][5] = 'C';
        board[5][6] = 'A';
        board[5][7] = 'B';
        board[5][8] = 'P';
        board[5][9] = 'A';

        // SEVENTH COLUMN
        board[6][0] = 'A';
        board[6][1] = 'P';
        board[6][2] = 'O';
        board[6][3] = 'K';
        board[6][4] = 'G';
        board[6][5] = 'I';
        board[6][6] = 'J';
        board[6][7] = 'A';
        board[6][8] = 'P';
        board[6][9] = 'I';

        // EIGHTH COLUMN
        board[7][0] = 'C';
        board[7][1] = 'P';
        board[7][2] = 'N';
        board[7][3] = 'M';
        board[7][4] = 'U';
        board[7][5] = 'U';
        board[7][6] = 'V';
        board[7][7] = 'I';
        board[7][8] = 'E';
        board[7][9] = 'Y';

        // NINTH COLUMN
        board[8][0] = 'E';
        board[8][1] = 'N';
        board[8][2] = 'J';
        board[8][3] = 'A';
        board[8][4] = 'V';
        board[8][5] = 'I';
        board[8][6] = 'S';
        board[8][7] = 'P';
        board[8][8] = 'A';
        board[8][9] = 'X';

        // TENTH COLUMN
        board[9][0] = 'V';
        board[9][1] = 'A';
        board[9][2] = 'S';
        board[9][3] = 'O';
        board[9][4] = 'O';
        board[9][5] = 'T';
        board[9][6] = 'X';
        board[9][7] = 'M';
        board[9][8] = 'Y';
        board[9][9] = 'D';
    }

    //Method to print the board
    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" [ " + board[i][j] + " ]");
            }
            System.out.println();
        }
    }

    /*
         public void printBoard() {
         for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board.length; j++) {
         if (board[i][j] != '\u0000') {
         Colors.printColor("line", "reset", " [ " + Colors.getYellow() + board[i][j] + Colors.getReset() + " ] ");
         } else if (board[i][j] == '-') {
         Colors.printColor("line", "reset", " [ " + Colors.getYellow() + "-" + Colors.getReset() + " ] ");
         }
         else {
         board[i][j] = randomLetter();
         Colors.printColor("line", "reset", " [ " + Colors.getYellow() + board[i][j] + Colors.getReset() + " ] ");
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

         public void selectChars() {
         }
     */

}
