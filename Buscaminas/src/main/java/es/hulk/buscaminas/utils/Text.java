package es.hulk.buscaminas.utils;

import es.hulk.buscaminas.Buscaminas;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Text {

    public void printMainMenu() {
        Utilities.logNewLine(CC.RESET + "Trii una de les seguents opcions");
        Utilities.logNewLine("");
        Utilities.logNewLine("1 - Principiant (Tauler 8x8 amb 10 mines");
        Utilities.logNewLine("2 - Normal (Tauler 16x16 amb 40 mines)");
        Utilities.logNewLine("3 - Dificil (Tauler 16x30 amb 99 mines");
        Utilities.logNewLine("4 - Personalitzat (Tauler maxim 200x200 amb x mines maxim");
        Utilities.logNewLine("");
        Utilities.logNewLine("5 - Surtir del programa");
        Utilities.logNewLine("");
        Utilities.log("Trii una de les opcions: ");
    }

    public void printElectionMenu() {
        Utilities.logNewLine("Elige una opción:");
        Utilities.logNewLine("");
        Utilities.logNewLine("1. Destapar casilla");
        Utilities.logNewLine("2. Poner bandera");
        Utilities.logNewLine("3. Eliminar bandera");
        Utilities.logNewLine("4. Salir");
        Utilities.logNewLine("");
        Utilities.log("Opción: ");
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


}
