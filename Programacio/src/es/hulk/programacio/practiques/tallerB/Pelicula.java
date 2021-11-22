package es.hulk.programacio.practiques.tallerB;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Hulk
 * at 22/11/2021 11:39
 */

@Getter
@Setter
public class Pelicula {

    private String titol;
    private String director;
    private int durada;

    public Pelicula(String titol, String director, int durada) {
        this.titol = titol;
        this.director = director;
        this.durada = durada;
    }

}
