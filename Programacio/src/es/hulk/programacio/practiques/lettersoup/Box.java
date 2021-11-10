package es.hulk.programacio.practiques.lettersoup;

/**
 * Created by Hulk
 * At 10/11/21 12:48
 * By: github.com/miquelangelamengual
 */

public class Box {

    private char[] letter;

    public Box() {
        this.letter = "abcdefghijklmnopqrstuvwxyz".toCharArray();;
    }

    public char[] getLetter() {
        return letter;
    }

    public void setLetter(char[] letter) {
        this.letter = letter;
    }

}
