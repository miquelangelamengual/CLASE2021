package es.hulk.programacio.lab.les09.objects;

import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
public class VacationScaleTwo {
    public ArrayList vacationDays;
    
    public void setVacationScale(){
        vacationDays = new ArrayList(7);
        vacationDays.add(10);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(20);
        vacationDays.add(20);
        vacationDays.add(25);
    }

    public void displayVacationDays() {
        System.out.println("Names on arraylist: ");
        for (Object str : vacationDays) {
            System.out.println(str);
        }
    }
}
