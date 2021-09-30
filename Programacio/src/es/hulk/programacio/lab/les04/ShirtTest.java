package es.hulk.programacio.lab.les04;

/**
 * Created by Hulk
 * at 30/09/2021 9:35
 */

public class ShirtTest {

    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.setId("id");
        shirt.setName("a");
        shirt.setCode(1);
        shirt.setColor("Brown");

        shirt.display();
    }

}
