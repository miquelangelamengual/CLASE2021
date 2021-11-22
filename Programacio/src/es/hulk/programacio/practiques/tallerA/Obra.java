package es.hulk.programacio.practiques.tallerA;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Hulk
 * at 22/11/2021 11:34
 */

@Getter
@Setter
public class Obra {

    private String title;
    private String theme;
    private int pages;

    public Obra(String title, String theme, int pages) {
        this.title = title;
        this.theme = theme;
        this.pages = pages;
    }

    public Obra() {

    }

}
