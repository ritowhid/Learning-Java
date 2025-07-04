package com.main.OOPs.Interfaces;

// can class implement multiple interfaces

// so basically we can have one class have multiple interfaces
// That's not the case on abstract class, in abstract class we can only extend one class

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
interface F {
    int age = 55; // final and static
    String area = "Feni";

    void show();

    void config();
}

interface X {
    void run();
}
interface Y extends X { // Class can extend on another class, what about interface !?
                        // Interface to interface, we use extends. Inheritance is valid here as well

    // in this Y interfaces we will be having a method run(), that's the inheritance.
}

class G implements F,Y { // in interface, we can have implementing multiple interfaces
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
    public void run() { // must have this method
        System.out.println("in running");
    }
}

public class MoreOn_interfaces {
    public static void main(String[] args) {
        F obj = new G();
        obj.show();
        obj.config();

        X obj1 = new G();
        obj1.run(); // to access run method, we need to create reference X; X obj1
    }
}
