package es.hulk.programacio.objects;

/**
 * Created by Hulk
 * at 13/10/2021 9:16
 */

public class Dog {

    private String name;
    private int age;
    private String dogType;
    private int numVaccines;
    private boolean pedigree;

    public Dog() {
    }

    public Dog(String name, int age, String dogType, int numVaccines, boolean pedigree) {
        this.name = name;
        this.age = age;
        this.dogType = dogType;
        this.numVaccines = numVaccines;
        this.pedigree = pedigree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public int getNumVaccines() {
        return numVaccines;
    }

    public void setNumVaccines(int numVaccines) {
        this.numVaccines = numVaccines;
    }

    public boolean isPedigree() {
        return pedigree;
    }

    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(dogType);
        System.out.println(pedigree);
        System.out.println(numVaccines);
    }

    public int newVaccine(int newVaccine) {
        int aux = numVaccines;
        numVaccines = aux + newVaccine;
        return numVaccines;
    }

}
