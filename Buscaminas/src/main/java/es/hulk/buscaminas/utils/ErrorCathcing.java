package es.hulk.buscaminas.utils;

import lombok.experimental.UtilityClass;

import java.util.InputMismatchException;

@UtilityClass
public class ErrorCathcing {

    public void parseNumber(int x, int y) {
        try {
            Text.log(Text.CUSTOM_BOARD_ROWS);
            x = Text.readInt();

            Text.log(Text.CUSTOM_BOARD_COLS);
            y = Text.readInt();
        } catch (InputMismatchException e) {
            System.out.println(Text.NUMBER_ERROR);
        }
    }

}
