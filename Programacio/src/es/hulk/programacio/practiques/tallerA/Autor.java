package es.hulk.programacio.practiques.tallerA;

import java.util.ArrayList;

/**
 * Created by Hulk
 * at 22/11/2021 11:36
 */

public class Autor {

    private String title;
    private ArrayList<Obra> obras;

    public Autor(String title) {
        this.title = title;
        obras = new ArrayList<>();
    }

    public Obra obraMesLlarga() {
        Obra obraMesLlarga = obras.get(0);
        for (Obra obra : obras) {
            if (obra.getPages() > obraMesLlarga.getPages()) {
                obraMesLlarga = obra;
            }
        }
        return obraMesLlarga;
    }

}
