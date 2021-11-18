package es.hulk.programacio.practiques.strings.impl;

import es.hulk.programacio.practiques.strings.Menu;

import java.util.Scanner;

/**
 * Created by Hulk
 * At 17/11/21 12:47
 * By: github.com/miquelangelamengual
 */

public class NewText {

    public NewText () {
        run();
    }

    public String run() {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        menu.text = scanner.nextLine();
        menu.start();
        return menu.text;
    }
}