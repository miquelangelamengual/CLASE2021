package es.hulk.programacio;

import es.hulk.programacio.utils.Colors;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Hulk
 * at 09/12/2021
 * Project: CLASE2021
 * Class: Main
 */

public class Main {

    public static void main(String[] args) throws Exception {

        File myFile = new File("file.txt");
        readFile(myFile);

    }

    public static void readFile(File file) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            Colors.error(e);
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                Colors.error(e);
            }
        }
    }

}
