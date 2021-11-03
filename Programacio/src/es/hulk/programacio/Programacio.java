package es.hulk.programacio;

import es.hulk.programacio.exercises.Conditionals;
import es.hulk.programacio.objects.Dog;
import es.hulk.programacio.objects.People;

import java.util.Scanner;

/**
 * Created by Hulk
 * at 27/09/2021 9:52
 */

public class Programacio {

    public static void main(String[] args) {
        Conditionals conditions = new Conditionals();
        conditions.dateTime();
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

    public static void scannerPeople(People people) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        people.setName(scanner.nextLine());

        System.out.print("DNI: ");
        people.setDni(scanner.nextLine());

        System.out.print("SexType: ");
        people.setSexType(scanner.nextLine());

        System.out.print("Age: ");
        people.setAge(scanner.nextInt());

        System.out.print("Telephone: ");
        people.setTelephoneNumber(scanner.nextInt());
        people.display();
    }

    public static void doggy() {
        Dog segonca = new Dog("Name", 1, "a", 1, true);

        segonca.newVaccine(786);
        segonca.display();
    }
}
