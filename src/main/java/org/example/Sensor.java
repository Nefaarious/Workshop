package org.example;

public class Sensor extends Unit{
    private double value;

    public Sensor(String name, int id, double value) {
        super(name, id);
        this.value= value;
    }

    public double getValue() {
        return value;
    }

}
