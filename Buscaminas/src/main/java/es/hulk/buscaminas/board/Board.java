package es.hulk.buscaminas.board;

import es.hulk.buscaminas.boxes.Box;
import es.hulk.buscaminas.utils.Colors;
import es.hulk.buscaminas.utils.Utilities;

import java.util.Random;
import java.util.Scanner;

public class Board {

    private static Box[][] board;

    public Board(int x, int y) {
        board = new Box[x][y];
    }

    public Box[][] getBoard() {
        return board;
    }

    public void setBoard(Box[][] board) {
        Board.board = board;
    }

    public void createBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new Box();
            }
        }
    }

    public void printBoard() {
        for (Box[] boxes : board) {
            for (Box box : boxes) {
                if (box.isFlag()) {
                    Utilities.log(Colors.green + " [ ? ] " + Colors.reset);
                } else if (!box.isPlugged()) {
                    Utilities.log(Colors.yellow + " [ - ] " + Colors.reset);
                } else {
                    Utilities.log(Colors.red + " [ x ] " + Colors.reset);
                }
            }
            Utilities.logNewLine("");
        }
    }

    public void putFlag() {
        Scanner scanner = new Scanner(System.in);

        Utilities.log("Trii una fila a on posar la bandera: ");
        int x = scanner.nextInt();

        Utilities.log("Trii una columna a on posar la bandera: ");
        int y = scanner.nextInt();

        board[x - 1][y - 1].setFlag(true);
        printBoard();

    }

    public void removeFlag() {
        Scanner scanner = new Scanner(System.in);

        Utilities.log("Trii la fila de la bandera que vol llevar: ");
        int x = scanner.nextInt();

        Utilities.log("Trii la columna de la bandera que vol llevar: ");
        int y = scanner.nextInt();

        if (board[x - 1][y - 1].isFlag()) {
            board[x - 1][y - 1].setFlag(false);
        } else {
            Utilities.logNewLine("No pots llevar una bandera a una casella on no esta asignada");
        }
    }

    public void putBombs(int bombs, int x, int y) {
        Random random = new Random();

        for (int i = 0; i < bombs; i++) {
            int xBomb = random.nextInt(x);
            int yBomb = random.nextInt(y);

            board[x - 1][y - 1].setBomb(true);
        }
    }

    public void removePlug() {
        Scanner scanner = new Scanner(System.in);

        Utilities.log("Trii la file de la casella que vol destapar: ");
        int x = scanner.nextInt();

        Utilities.log("Trii la columna de la casella que vol destapar: ");
        int y = scanner.nextInt();

        if (board[x - 1][y - 1].isBomb()) {
            lose();
        } else {
            board[x - 1][y - 1].setPlugged(false);
            printBoard();
        }
    }

    public void lose() {
        Utilities.logNewLine("");
        Utilities.logNewLine("Has perdut, per aixo t'hauries de dedicar a jugar a Hello Kitty Online");
        Utilities.logNewLine("");
        System.exit(0);
    }
}

