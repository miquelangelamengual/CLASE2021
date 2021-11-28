package es.hulk.programacio.practiques.practica;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Hulk
 * at 22/11/2021 11:48
 */

@Getter
@Setter
public class Alumne {

    private String id;
    private String nom;
    private int edat;
    private int[] notas;

    public Alumne(String id, String nom, int edat, int[] notas) {
        this.id = id;
        this.nom = nom;
        this.edat = edat;
        this.notas = notas;
    }

    public Alumne() {

    }

    public void mitjanaNotes() {
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        System.out.println("La mitjana de les notes de l'assignatura " + nom + " és: " + (suma / notas.length));
    }

    public void printAlumne() {
        System.out.println("ID: " + id);
        System.out.println("Nom: " + nom);
        System.out.println("Edat: " + edat);
        System.out.println("Notas: " + notas);
    }
}