package es.hulk.programacio;

import es.hulk.programacio.exercises.FirstExercises;
import es.hulk.programacio.objects.People;

/**
 * Created by Hulk
 * at 27/09/2021 9:52
 */

public class Programacio {

    public static void main(String[] args) {
        people();
    }

    public static People people() {
        People people = new People();
        people.setName("Polaris");
        people.setAge(20);
        people.setDni("NN");
        people.setTelephoneNumber(0);
        people.display();

        return people;
    }

}
