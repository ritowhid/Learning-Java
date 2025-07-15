package com.main.basic_java;

public class StaticExample {

    String brand;
    int price;
    static String name; // Static variable

    // Constructor
    public StaticExample(String brand, int price) {
        this.brand = brand;
        this.price = price;
        System.out.println("Constructor called: " + brand + ", " + price);
    }

    // Default constructor (if you still want to support no-args constructor)
    public StaticExample() {
        System.out.println("Default constructor called");
    }

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }

    static {
        System.out.println("This is a static block. Runs only once when the class is loaded.");
    }

    public static void show2() {
        System.out.println("Static method can only access static variables directly. Name: " + name);
    }

    public static void main(String[] args) {
        // Using the constructor to initialize objects
        StaticExample obj1 = new StaticExample("Apple", 1500);
        StaticExample.name = "Smartphone";

        StaticExample obj2 = new StaticExample("Samsung", 1800);
        StaticExample.name = "Phone only"; // Since name is static, there is only one copy shared by all instances.  its overwrites the earlier "Smartphone" & print "Phone only"

        // Display values
        obj1.show(); // Apple:1500:Phone only
        obj2.show(); // Samsung:1800:Phone only

        // Call static method
        StaticExample.show2(); // Name: Phone only
    }
}
