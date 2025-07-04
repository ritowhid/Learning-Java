package com.main.OOPs.Keywords;

abstract class Car {
    public abstract void drive(); // Abstract method: Child classes must complete this method unless they are also abstract

    public abstract void fly();

    // Concrete method: already implemented, can be inherited as is
    public void playGps() {
        System.out.println("Play GPS");
    }
}

abstract class Premio extends Car { // if you have a class which is not
    // able to implement all the method,
    // in this case this class becomes abstract class

    //    public void fly() { // it's compulsory to define bcz i have
    //  abstract fly() method in abstract class
    // Car & that class extends here.
//        System.out.println("Flying...");
//    }


    // This class provides implementation for 'drive()' only
    // So, it remains abstract because 'fly()' is still not implemented
    public void drive() {
        System.out.println("Driving...");
    }
}

class updatedPremio extends Premio { // concrete class: must implement all abstract methods
    // Implements the remaining abstract method from Car
    public void fly() {
        System.out.println("Flying...");
    }
}

public class Abstract_keyword {
    public static void main(String[] args) {
//        Car obj = new Premio(); // you can't create an object of abstract class

        // You can use abstract class reference but must assign a concrete subclass
        Car obj = new updatedPremio();

        // Calls the implemented method from Premio
        obj.drive();
        // Calls the concrete method from Car (inherited)
        obj.playGps();
        // Calls the implemented method from updatedPremio
        obj.fly();
    }
}
