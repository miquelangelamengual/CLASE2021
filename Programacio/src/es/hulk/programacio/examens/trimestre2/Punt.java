package es.hulk.programacio.examens.trimestre2;

import lombok.Getter;

@Getter
public class Punt {

    private int x;
    private int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punt calcularPunt(Punt punt) {
        return new Punt(punt.getX() - x, punt.getY() -y);
    }



}
