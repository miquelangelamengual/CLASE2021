package es.hulk.programacio.practiques.practica;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * Created by Hulk
 * at 22/11/2021 11:49
 */

@Getter
@Setter
public class Assignatura {

    private String nom;
    ArrayList<Alumne> alumnes;

    public Assignatura(String nom, ArrayList<Alumne> alumnes) {
        this.nom = nom;
        this.alumnes = new ArrayList<>();
    }

    public void nouMatriculat(Alumne alumne) {
        alumnes.add(alumne);
    }


    public void baixaMatriculat(Alumne alumne) {
        alumnes.remove(alumne);
    }

    public Alumne millorAlumne() {
        int max = 0;
        Alumne alumne = null;
        for (Alumne a : alumnes) {
            for (int i = 0; i < a.getNotas().length; i++) {
            if (alumne.getNotas()[i] > max) {
                    max = a.getNotas()[i];
                    alumne = a;
                }
            }
        }
        return alumne;
    }

    public void printAssignatura() {
        System.out.println("Assignatura: " + nom);
    }

    public void printAlumnes() {
        for (Alumne alumne : alumnes) {
            System.out.println("Nom: " + alumne.getNom());
        }
    }
}
