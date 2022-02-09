package es.hulk.programacio.lab.les12;

import java.util.ArrayList;

/**
 * Created by Hulk
 * at 19/01/2022
 * Project: CLASE2021
 * Class: Editor
 */

public class Editor extends Employee {

    private ArrayList<String> skills = new ArrayList<>();
    private boolean prefersPaperEditing;

    public Editor() {}

    public ArrayList<String> getSkills() {
        return this.skills;
    }

    public void setSkill(String skill) {
        this.skills.add(skill);
    }

    public boolean isPrefersPaperEditing() {
        return this.prefersPaperEditing;
    }

    public void setPrefersPaperEditing(boolean prefersPaperEditing) {
        this.prefersPaperEditing = prefersPaperEditing;
    }

    public void displayInformation() {
        super.displayInformation();
        System.out.println("This editor has the following skills: ");
        for (String skill : skills) {
            System.out.println(skill);
        }
    }
}
