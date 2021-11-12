package es.hulk.programacio.lab.les09.objects;

/**
 * Created by Hulk
 * at 04/10/2021 11:41
 */

public class Sequence {

    public int firstNumber = 0;
    public int secondNumber = 1;
    public final int SEQUENCE_LIMIT = 100;
    public int nextNumber;

    public void displaySequence() {
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");

        nextNumber = firstNumber + secondNumber;

        while (nextNumber <= SEQUENCE_LIMIT) {
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
        }

        System.out.println();
    }


}
