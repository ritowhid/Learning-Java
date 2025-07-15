package com.main.oops.extends_object_explain;

// Object class equals toString hashcode in java
class Laptop {
    String model;
    int price;
//
//    public String toString() {
//        return "hey";
//    }

    public String toString() {
        return model + " : " + price;
    }
}

public class extends_object {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Yoga";
        obj.price = 1000;
        System.out.println(obj);

//        System.out.println(obj); // it will print some weird things
//        System.out.println(obj.toString()); // everytime you print he objects, it will call toString method even if you don't mention it

//        System.out.println(obj.toString()); // it will print the toString class -> hey
//        System.out.println(obj); // i can print it without toString method here.
    }
}

/*
   toString() -> public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    Here what toString is doing:-
    First of all, toString is not my method.
    But in the object class that is, we can see
    we got a toString method which returns a String,
    that's what we are printing. It returns something,
    what it returns?! It returns the class name
    by getClass()- it will give you the class name
    Then it calls getName() - class name; that is Laptop,
    and then we got '@' symbol in between that we got in output.
    Then it prints something hexa string - toHexString() that's why
    we got hexadecimal value in output, but what exactly it represents it?!
    It converts the number into hex decimal string and
    that number is actually hash code, hashcode basically generates the hash
    based on the values you have.

    Hash is a simple concept in terms of cryptography and anywhere.
    It tries to create a single string of all the data which you have,
    so lets if you have an object which has five variables, it will
    apply a hash algorithm, and it will generate a number string, which
    will be of fixed size.

    The thing is here returning a hash code.

 */