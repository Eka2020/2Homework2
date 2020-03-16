package com.company;

public  class Transport {
    public double volume;
    public int year;
    public  String color;

    public Transport(double volume, int year, String color) {
        this.volume = volume;
        this.year = year;
        this.color = color;
    }


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
