package es.hulk.programacio.lab.les05.objects;

import java.util.Date;

/**
 * Created by Hulk
 * at 30/09/2021 9:38
 */

public class Person {

    private int years = 1;
    private int days;
    private long minutes;
    private long seconds;
    private long milliseconds;

    public void calculateAge() {
        this.days = years * 365;
        this.seconds = days * 24 * 60 * 60;
        this.minutes = seconds / 60;
        this.milliseconds = seconds * 1000;

        System.out.println("You are " + days + " days old");
        System.out.println("You are " + minutes + " minutes old");
        System.out.println("You are " + seconds + " seconds old");
        System.out.println("You are " + milliseconds + " milliseconds old");
    }

}

