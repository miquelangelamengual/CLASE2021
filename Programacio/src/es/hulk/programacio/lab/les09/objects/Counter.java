package es.hulk.programacio.lab.les09.objects;

/**
 * Created by Hulk
 * at 04/10/2021 11:36
 */

public class Counter {

    public final int MAX_COUNT = 100;

    public void displayCount() {
        for (int i = 0; i <= MAX_COUNT; i++) {
            if (i % 12 == 0) {
                System.out.println(i);
            }
        }
    }

}
