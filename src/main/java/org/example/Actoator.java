package org.example;



public class Actoator extends Unit {
    private double value;

    public Actoator(String name, int id) {
        super(name, id);
    }

    public void setValue(double value){
        this.value = value;

    }

    public double getValue() {
        return value;
    }
}
