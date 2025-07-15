package com.main.oops.interfaces;


//abstract class Computer {
//    public abstract void code();
//}

//interfaces let you achieve multiple inheritance of type.

//Any class that implements Computer must implement the code() method.
interface Computer {
    void code(); // method without body (abstract by default)
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code, Compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code, Compile, run : Faster");
    }
}
// Developer class depends on Computer (not directly on Laptop or Desktop)
class Developer {
    public void devApp(Computer lap) {
        lap.code();
    }
}

public class Interface_need {
    public static void main(String[] args) {
        // Create objects using the interface type
        Computer lap = new Laptop(); //upcasting
        Computer desk = new Desktop(); //upcasting
        //You create Laptop and Desktop objects but store
        // them in Computer type references (polymorphism).

        Developer towhid = new Developer();
        // Passing a Desktop object to Developer
        towhid.devApp(desk);
    }
}
