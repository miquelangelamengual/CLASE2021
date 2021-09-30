package es.hulk.programacio.lab.les05.objects;

/**
 * Created by Hulk
 * at 30/09/2021 9:38
 */

public class Order {

    private long orderValue = 0L;
    private int itemQuantity = 10_000_000;
    private int itemPrice = 555_500;

    public void calculateTotal() {
        orderValue = (long) itemQuantity * itemPrice;
        System.out.println(orderValue);
    }

}
