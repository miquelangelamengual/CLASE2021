package es.hulk.programacio.lab.les09.objects;

/**
 * Created by Hulk
 * at 04/10/2021 11:50
 */

public class ChallengeSequence {

    public int firstNumber = 0;
    public int secondNumber = 1;
    public int nextNumber;

    public final int SEQUENCE_LIMIT = 100;
    public final int SEQUENCE_COUNT = 10;

    public void displaySequence() {
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");

        nextNumber = firstNumber + secondNumber;

        for (int i = 2; i <= SEQUENCE_COUNT; i++){
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
        }

        System.out.println();
    }

}
