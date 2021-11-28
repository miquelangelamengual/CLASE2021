package es.hulk.programacio.practiques.practica;

import java.util.ArrayList;

/**
 * Created by Hulk
 * At 24/11/21 9:35
 * By: github.com/miquelangelamengual
 */

public class Main {

    public static void main(String[] args) {
        Alumne alumne1 = new Alumne("1", "Miquel Angel", 17, new int[]{1,2,3,4,5,6});
        Alumne alumne2 = new Alumne("2", "Alchachofa", 20, new int[]{5,6,7,8,9,10});
        Alumne alumne3 = new Alumne("3", "El Carvo", 14, new int[]{2,4,6,8,10});
        Alumne alumne4 = new Alumne("4", "Bomba Venenosa", 34, new int[]{3,6,9,12,15});
        Alumne alumne5 = new Alumne("5", "Lanzallamas Segundo", 24, new int[]{4,8,10,2,4});

        ArrayList<Alumne> alumnes = new ArrayList<>();
        alumnes.add(alumne1);
        alumnes.add(alumne2);
        alumnes.add(alumne3);

        Assignatura programacio = new Assignatura("Programacio", alumnes);

        programacio.nouMatriculat(alumne1);
        programacio.nouMatriculat(alumne2);
        programacio.nouMatriculat(alumne3);

        programacio.printAlumnes();

        System.out.println("\n");

        programacio.nouMatriculat(alumne4);
        programacio.nouMatriculat(alumne5);

        programacio.printAlumnes();
    }

}
