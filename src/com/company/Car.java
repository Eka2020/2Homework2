package com.company;

import java.awt.*;

public class Car extends Transport implements Printable {
    private String model;

    public Car(double volume, int year, String color, String model) {
        super(volume, year, color);
        this.model = model;
    }

     public Car(String model, int year, double volume, String color) {
        super(volume, year,  color);
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println(" model "+ this.getModel()+" volume "+ getVolume()+" god vypuska "+getYear()+" color "+getColor());

    }
}
