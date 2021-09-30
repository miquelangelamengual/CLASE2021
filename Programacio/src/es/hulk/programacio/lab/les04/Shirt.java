package es.hulk.programacio.lab.les04;

/**
 * Created by Hulk
 * at 30/09/2021 9:27
 */

public class Shirt {

    private String id;
    private String name;
    private int code;
    private String color;

    public Shirt() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println(getId());
        System.out.println(getName());
        System.out.println(getCode());
        System.out.println(getColor());
    }

}
