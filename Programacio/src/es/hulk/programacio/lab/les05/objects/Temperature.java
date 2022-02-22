package es.hulk.programacio.lab.les05.objects;

/**
 * Created by Hulk
 * at 30/09/2021 9:39
 */

public class Temperature {

    private float farenheits = 200;

    public float farenheitsToCelsius() {
        return (farenheits - 32) * 5 / 9;
    }

    public void calculateCelsius() {
        System.out.println("Farenheits to Celsius = " + farenheitsToCelsius());
    }

}
