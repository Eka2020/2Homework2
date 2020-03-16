package com.company;

public class Bus extends Transport implements Printable{
    private String type;
    private String driverName;

    public Bus(double volume, int year, String color, String type, String busDriver) {
        super(volume, year, color);
        this.type = type;
        this.driverName = busDriver;
    }

    public Bus(String type, String driverName, int year, double volume, String color) {
        super(volume, year,  color);
        this.type = type;
        this.driverName = driverName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void print() {
        System.out.println(" Name "+ getDriverName()+" model "+ this.getType()+" volume "+ getVolume()+" god vypuska "+getYear()+" color "+ "black "+getColor());
    }
}
