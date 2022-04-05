package es.hulk.buscaminas.utils;

import es.hulk.buscaminas.Buscaminas;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Text {

    public String REMOVE_FLAG = "Has quitado una bandera";
    public String PUT_FLAG = "Has puesto una bandera";
    public String WIN = "Has ganado";
    public String LOSE = "Has perdido";
    public String FLAGS_REMAINING = "Banderas restantes " + Buscaminas.getBoard().getBoard()[0][0].getNumFlags();

}
