package es.hulk.programacio.lab.les11;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import es.hulk.programacio.lab.les11.objects.DateOne;

/**
 * @author Administrator
 */

public class DateOneTest {
    public static void main(String args[]) {

        DateOne dateOne = new DateOne();

        dateOne.day = 1;
        dateOne.month = 2;
        dateOne.year = 2022;

        System.out.println("DateOne: " + dateOne.day + "/" + dateOne.month + "/" + dateOne.year);
    }// end main
} // end class

