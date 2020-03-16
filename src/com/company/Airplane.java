package com.company;

public class Airplane extends  Transport implements Printable{
private String pilotName;
private String model;

    public Airplane(double volume, int year, String color, String pilotName, String model) {
        super(volume, year, color);
        this.pilotName = pilotName;
        this.model = model;
    }
    public Airplane(String pilotName, String model, int year, double volume, String color) {
        super(volume, year, color);
        this.pilotName = pilotName;
        this.model = model;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Name "+ getPilotName()+" model "+ this.getModel()+" volume "+ getVolume()+" god vypuska "+getYear()+" color "+ "black "+getColor());

    }
}
