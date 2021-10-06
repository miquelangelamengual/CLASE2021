package es.hulk.programacio.lab.les11;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import es.hulk.programacio.lab.les11.objects.Rectangle;

/**
 * @author Administrator
 */

public class RectangleTest {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        r1.draw();

        Rectangle r2 = new Rectangle(10, 30);
        System.out.println("Area of r2: " + r2.getArea());
        r1.draw();
    }// end main
} // end class
