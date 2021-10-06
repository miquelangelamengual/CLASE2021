package es.hulk.programacio.lab.les11.objects;

/**
 * Created by Hulk
 * at 06/10/2021 9:49
 */

public class Rectangle {

    private int height;
    private int width;

    public Rectangle() {
        width = 25;
        height = 10;
        System.out.println("Default rectangle: " + width + " " + height);
    }

    public Rectangle(int h, int w) {
        if (w > 0 && w < 30 && h > 0 && h < 30) {
            width = w;
            height = h;
            System.out.println("Rectangle created: width = " + width + " and height = " + height);
        } else {
            System.out.println("Invalid width and/or height. Each must be positive and less than 30.");
        }
    }

    public int getArea() {
        return height * width;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" [*] ");
            }
            System.out.println();
        }
    }

}
