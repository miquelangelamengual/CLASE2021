package es.hulk.programacio.lab.les11;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import es.hulk.programacio.lab.les11.objects.DateTwo;

/**
 * @author Administrator
 */

public class DateTwoTest {
    public static void main(String args[]) {
        DateTwo dateTwo = new DateTwo();
        dateTwo.setDay(6);
        dateTwo.setMonth(10);
        dateTwo.setYear(2021);

        System.out.println("DateTwo: " + dateTwo.getDay() + "/" + dateTwo.getMonth() + "/" + dateTwo.getYear());
    }

} // end class

