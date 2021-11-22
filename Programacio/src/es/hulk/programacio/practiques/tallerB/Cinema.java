package es.hulk.programacio.practiques.tallerB;

/**
 * Created by Hulk
 * at 22/11/2021 11:39
 */


public class Cinema {

    private String nom;
    private int numSala;
    private Pelicula[] pelicules;

    public Cinema(String nom, int numSala) {
        this.nom = nom;
        this.numSala = numSala;
    }

    public Pelicula peliculaMesLlarga() {
        for (Pelicula pelicula : pelicules) {
            if (pelicula.getDurada() > pelicula.getDurada()) {
                return pelicula;
            }
        }
        return null;
    }
}
