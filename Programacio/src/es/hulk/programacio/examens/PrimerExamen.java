package es.hulk.programacio.examens;

/**
 * Created by Hulk
 * at 10/01/2022
 * Project: CLASE2021
 * Class: PrimerExamen
 */

public class PrimerExamen {

    String provaExecucio = "Una noia anomenada Anna va anar a cercar al bosc un home, alla hi va trobar un cec que intentava trobar un figura de metall d'un cuc ben rar. Astorada li va dir que si no ho intentava amb un radar no crec que el trobis. Amb un aparell d'aquests que fan pipiripip segur que el trobraras encara que estigui ben tapat !";
    char[] delimiters = {' ', '.', ',',  '!', '?', '-', '`'};

    public void stringToCharArray(String text) {
        int maxChars = text.length();
        char[] array = new char[maxChars];

        for (int i = 0; i < maxChars; i++) {
            array[i] = text.charAt(i);
        }
    }

    public void printArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public boolean isDelimiter(int index, char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                for (int j = 0; j < delimiters.length; j++) {
                    if (array[i] == delimiters[j]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean isStartOfWord(int index, char[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                for (int j = 0; j < delimiters.length; j++) {
                    if (array[i - 1] == delimiters[j] || Character.isUpperCase(array[i])) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
