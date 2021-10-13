package es.hulk.entorns.debugger;

/**
 * Created by Hulk
 * at 07/10/2021 11:44
 */

public class Debugger2 {

    public static void main(String[] args) {

        int a= 2;
        int b = 6;
        int c = 4;

        double expressio;

        expressio = -b + Math.sqrt(b * b - 4 * a * c);
        expressio = expressio / (2 * a);

        System.out.println(expressio);

    }

}
