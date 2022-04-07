package es.hulk.buscaminas.utils;

import lombok.experimental.UtilityClass;

import java.util.Scanner;

@UtilityClass
public class Text {

    private final Scanner scanner = new Scanner(System.in);

    public void logNewLine(String str) {
        System.out.println(str);
    }

    public void log(String str) {
        System.out.print(str);
    }

    public int readInt() {
        return scanner.nextInt();
    }

    public String readString() {
        return scanner.next();
    }

    public void printMainMenu() {
        logNewLine(CC.RESET + "Trii una de les seguents opcions");
        logNewLine("");
        logNewLine("1 - Principiant (Tauler 8x8 amb 10 mines");
        logNewLine("2 - Normal (Tauler 16x16 amb 40 mines)");
        logNewLine("3 - Dificil (Tauler 16x30 amb 99 mines");
        logNewLine("4 - Personalitzat (Tauler maxim 200x200 amb x mines maxim");
        logNewLine("");
        logNewLine("5 - Surtir del programa");
        logNewLine("");
        log("Trii una de les opcions: ");
    }

    public void printElectionMenu() {
        logNewLine("Elige una opción:");
        logNewLine("");
        logNewLine("1. Destapar casilla");
        logNewLine("2. Poner bandera");
        logNewLine("3. Eliminar bandera");
        logNewLine("");
        logNewLine("4. Reiniciar Partida");
        logNewLine("5. Surtir del programa");
        logNewLine("");
        log("Opción: ");
    }

    public String LEFT_GAME = CC.RED + "Has sortit del Buscaminas";

    public String WIN = "Has ganado";
    public String LOSE = "Has perdido";

    public String REMOVE_FLAG = "Has quitado una bandera";
    public String PUT_FLAG = "Has puesto una bandera";
    public String FLAGS_REMAINING = "Banderas restantes";
    public String OUT_OF_FLAGS = "No te quedan mas banderas";
    public String PUT_FLAG_ERROR = "No puedes poner una bandera en esta casilla porque ya hay una bandera";
    public String REMOVE_FLAG_ERROR = "No puedes quitar una bandera en esta casilla porque no hay una bandera";

    public String BOX_ALREDY_OPEN = "Esta casilla ya esta abierta";
    public String OPEN_BOX = "Has abierto una casilla";

    public String CUSTOM_BOARD_ERROR = CC.RED + "El tablero no puede ser menor de 4x4 o mayor de 200x200";
    public String CUSTOM_BOARD_ROWS = "Introduce el numero de filas: ";
    public String CUSTOM_BOARD_COLS = "Introduce el numero de columnas: ";
    public String CUSTOM_BOARD_MINES = "Introduce el numero de minas: ";

    public String RESET_GAME = "Quieres reiniciar la partida? (yes/no)";
}
