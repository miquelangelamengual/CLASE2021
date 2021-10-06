package es.hulk.programacio.lab.les11;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import es.hulk.programacio.lab.les11.objects.DateThree;

/**
 * @author Administrator
 */

public class DateThreeTest {
    public static void main(String args[]) {
        DateThree dateThree = new DateThree();
        dateThree.setDate(1, 3, 2021);
        dateThree.displayDate();
    } // end main
} // end class
