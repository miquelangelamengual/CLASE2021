package es.hulk.programacio.lab.les10;

import es.hulk.programacio.lab.les10.objects.Order;
import es.hulk.programacio.lab.les10.objects.Shirt;

/**
 * Created by Hulk
 * at 06/10/2021 8:34
 */

public class OrderTest {

    public static void main(String[] args) {
        Order order = new Order();
        Shirt shirt = new Shirt();
        Shirt shirt2 = new Shirt();
        Shirt shirt3 = new Shirt();
        Shirt shirt4 = new Shirt();

        shirt.price = 14.99;
        shirt2.price = 20.99;
        shirt3.price = 1.99;
        shirt4.price = 4.99;

        double totalCost = order.addShirt(shirt) + order.addShirt(shirt2) + order.addShirt(shirt3) + order.addShirt(shirt4);
        System.out.println("The amount of the order is " + totalCost + "€.");
    }
}
