package es.hulk.programacio.lab.les09.objects;

/**
 * Created by Hulk
 * at 06/10/2021 8:14
 */

public class ClassMap {

    public String[][] deskArray;
    public String name;

    public void setClassMap() {
        deskArray = new String[3][4];
    }

    public void setDesk() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (deskArray[i][j] == null) {
                    deskArray[i][j] = name;
                    return;
                }
            }
        }
    }

    public void displayDeskMap() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + deskArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void searchDesk() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (deskArray[i][j] != null && deskArray[i][j].equals(name)) {
                    System.out.println("Position of " + name + ":");
                    System.out.println("Row: " + i);
                    System.out.println("Column: " + j);
                    return;
                }
            }
        }
    }
}
