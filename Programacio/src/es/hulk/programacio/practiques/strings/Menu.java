package es.hulk.programacio.practiques.strings;

import es.hulk.programacio.practiques.strings.impl.NewText;
import es.hulk.programacio.practiques.strings.impl.ViewText;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.swing.text.View;
import java.util.Scanner;

/**
 * Created by Hulk
 * At 17/11/21 12:45
 * By: github.com/miquelangelamengual
 */

@Getter
@Setter
@NoArgsConstructor
public class Menu {

    public String text;
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Trii una de les opcions disponibles: ");
        System.out.println();
        System.out.println("1. Introduir un text nou.");
        System.out.println("2. Veure el text actual.");
        System.out.println("3. Comptar el numero de lletres.");
        System.out.println("4. Comptar el numero de paraules.");
        System.out.println("5. N umero d’aparicions de cada car`acters.");
        System.out.println("6. Dir el caracter mes repetit i el numero d’aparicions.");
        System.out.println("7. Dir la paraula mes repetida i el numero d’aparicions.");
        System.out.println("8. Introduir per teclat un car`acter i dir quantes vegades apareix.");
        System.out.println("9. Introduir per teclat una paraula i dir quantes vegades apareix.");
        System.out.println(" ");
        System.out.println("0. Surt del programa");
        System.out.println(" ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                new NewText();
                break;
            case 2:
                new ViewText();
                break;
        }
    }

}
