package es.hulk.programacio.lab.les08;

import java.util.ArrayList;

/**
 * Created by Hulk
 * at 30/09/2021 12:49
 */

public class NameList {

    public ArrayList<String> listOfNames;

    public void setList() {
        listOfNames = new ArrayList<>();
        listOfNames.add("Joe BurgerChallenge");
        listOfNames.add("Ocar Mezar");
        listOfNames.add("Sezar Blue");
        listOfNames.add("Marcos Lukars");
        System.out.println("List of Names: " + listOfNames);
        System.out.println("Arraylist's Size: " + listOfNames.size());
    }

    public void manipulateList() {
        listOfNames.remove(0);
        System.out.println("List of Names: " + listOfNames);
        System.out.println("Arraylist's Size: " + listOfNames.size());

        listOfNames.add(1, "Joe BurgerChallenge");
        System.out.println("List of Names: " + listOfNames);
        System.out.println("Arraylist's Size: " + listOfNames.size());
    }
}
