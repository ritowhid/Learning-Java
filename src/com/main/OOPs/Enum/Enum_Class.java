package com.main.OOPs.Enum;

// This class is all about 'enum' with customized constructor, instance variable, and method.

// you can create class, method, constructor but can't extend class;
// By default enum in java extend enum class
enum Colors {
    Blue, Red, Green;
}

enum Laptops { // This laptop is class and the below element is objects
    Macbook(4000), XPS(2200), Surface(1500), Thinkpad(); // this is a constructor of Laptop and we are passing value.

    private int price;

    // suppose you don't declare the price of any laptop; it will give error
    // bcz we mention parameterized constructor, and it's constant, now I have to set the price
    // Here we fix it using default constructor
    private Laptops() {
        // and here we can set price
        price = 500;
    }
// I create 4 object and it wll call constructor 4 times, parameterized 3 times, default 1 times.


    Laptops(int price) { // this constructor takes the price
        this.price = price;
    }

    // Getter and setter to print the price, bcz price is 'instance' variable, and it's 'private'
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enum_Class {
    public static void main(String[] args) {

//        Laptops lap = Laptops.Macbook;
//        System.out.println(lap + " : " + lap.getPrice());
//
//        for(Laptops lap : Laptops.values()) {
//            System.out.println(lap + " : " + lap.getPrice());
//        }

        // set a new price
        Laptops dell = Laptops.XPS;
        dell.setPrice(3000);
//        System.out.println(dell + " : " + dell.getPrice()); // XPS : 3000

        for (Laptops l : Laptops.values()) {
            System.out.println(l + " :" + l.getPrice());
        }


//        Colors c = Colors.Blue;

        // get class name & super class of it. output-> class java.lang.Enum
        // all the extra methods you get from enum class
//        System.out.println(c.getClass().getSuperclass());
    }
}
