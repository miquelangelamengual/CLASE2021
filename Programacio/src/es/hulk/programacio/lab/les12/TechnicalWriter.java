package es.hulk.programacio.lab.les12;

import java.util.ArrayList;

/**
 * Created by Hulk
 * at 19/01/2022
 * Project: CLASE2021
 * Class: TechnicalWriter
 */

public class TechnicalWriter extends Employee {

    private ArrayList<String> skills = new ArrayList<>();

    public TechnicalWriter() {
    }

    public ArrayList<String> getSkill() {
        return skills;
    }

    public void setSkill(String skill) {
        skills.add(skill);
    }

    public void displayInformation() {
        super.displayInformation();
        System.out.println("This technical writer has the following skills: ");
        for (String skill : skills) {
            System.out.println(skill);
        }
    }

}
