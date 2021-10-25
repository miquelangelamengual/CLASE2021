package es.hulk.programacio.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {

    private static final String noup = Colorines.red + "Noup!";

    public static void noup() {
        System.out.println(noup);
    }

}
