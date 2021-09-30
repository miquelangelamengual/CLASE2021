package es.hulk.programacio.lab.les08;

/**
 * Created by Hulk
 * at 30/09/2021 12:39
 */

public class VacationScale {

    public int[] vacationDays;
    public int yearsOfService;

    public void setVacationScale() {
        vacationDays = new int[7];

        vacationDays[0] = 10;
        vacationDays[1] = 15;
        vacationDays[2] = 15;
        vacationDays[3] = 20;
        vacationDays[4] = 20;
        vacationDays[5] = 25;
        vacationDays[6] = 25;
    }

    public void displayVacationDays() {
        if (yearsOfService >= 0 && yearsOfService < 6) {
            System.out.println("Days of vacation: " + vacationDays[yearsOfService]);
        } else if (yearsOfService >= 6) {
            System.out.println("Days of vacation: " + vacationDays[6]);
        } else {
            System.out.println("Invalid years of service");
        }
    }
}
