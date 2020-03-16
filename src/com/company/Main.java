package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Bus");
        createObject("Car");
        createObject("Airplane");

    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Car":
                printable = new Car(3.0, 2003, "Red", "Mercedes");
                printable.print();
                break;
            case "Bus":
                printable = new Bus("Passjir", "Alex", 2000, 3.0, "Blue");
                printable.print();
                break;
            case "Airplane":
                printable = new Airplane("Andrew", "T-154", 2000, 8.0, "White");
                printable.print();
                break;
        }
        return printable;
    }
}
