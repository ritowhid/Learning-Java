package com.main.OOPs.Inheritance;

// Parent class: Car
class Car {
    String color;
    String brand;

    // constructor
    Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    void showCarTraits() {
        System.out.println("Color (Car): " + color);
        System.out.println("Brand (Car): " + brand);
    }
}

// Child class: Vehicle inherits from Car
class Vehicle extends Car {
    float engineCapacity;
    String vehicleType;

    // constructor
    Vehicle(String color, String brand, float engineCapacity, String vehicleType) {
        super(color, brand);
        this.engineCapacity = engineCapacity;
        this.vehicleType = vehicleType;
    }

    void showVehicleTraits() {
        System.out.println("Engine Capacity (Vehicle): " + engineCapacity + " liters");
        System.out.println("Vehicle Type (Vehicle): " + vehicleType);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("Red", "Toyota", 2.5f, "SUV");
        myVehicle.showCarTraits();
        myVehicle.showVehicleTraits();
    }
}
