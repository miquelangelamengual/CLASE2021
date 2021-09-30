package es.hulk.programacio.lab.les07.objects;

/**
 * Created by Hulk
 * at 30/09/2021 12:20
 */

public class Clock {

    private int currentTime = 400;

    public void displayPartOfDay() {

        if (currentTime >= 400 && currentTime <= 1200) {
            System.out.println("Morning");
        } else if (currentTime >= 1200 && currentTime <= 2000) {
            System.out.println("Afternoon");
        } else if (currentTime >= 2000 && currentTime <= 400) {
            System.out.println("Evening");
        } else {
            System.out.println("I dont know how to say rn");
        }
    }
}
