package org.example;

public class TemperatureSensor extends Sensor{
    public TemperatureSensor(String name, int id, double value) {
        super(name, id, value);
    }

    @Override
    public String toString(){
        return getValue()+getName()+getId();
    }


    public static void main(String[] args) {
        TemperatureSensor temper = new TemperatureSensor("tsensor",1, 0.1);
        System.out.println(temper);
    }
}
