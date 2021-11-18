package es.hulk.programacio.practiques.strings.impl;

import es.hulk.programacio.practiques.strings.Menu;

/**
 * Created by Hulk
 * At 17/11/21 13:04
 * By: github.com/miquelangelamengual
 */

public class ViewText {

    public ViewText() {
        run();
    }

    public void run() {
        Menu menu = new Menu();

        System.out.println(menu.text + "\n");

        menu.start();
    }
}
