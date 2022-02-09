package es.hulk.programacio.lab.les12;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * Created by Hulk
 * at 19/01/2022
 * Project: CLASE2021
 * Class: GraphicIllustrator
 */

@NoArgsConstructor
public class GraphicIllustrator extends Employee {

    private ArrayList<String> skills = new ArrayList<>();

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkill(String skill) {
        skills.add(skill);
    }

    public void displayInformation() {
        super.displayInformation();
        System.out.println("This graphic illustrator has the following skills: ");
        for (String skill : skills) {
            System.out.println(skill);
        }
    }
}
