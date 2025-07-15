package com.main.oops.interfaces;

/*
An Interface in Java is defined as an abstract
type used to specify the behavior of a class.
An interface in Java is a blueprint of behavior.
A Java interface contains static constants and abstract methods.
 */
interface A {
// By default, every method in interfaces is public abstract
// So we don't need to define like this -> public abstract void show();

    //interfaces will tell what method you need but will not implement them
    void show();

    void config();

    int age = 22; // every variable in the interfaces is by default final and static, that's why need to initialize.
    String area = "Feni"; // since they are static, we can directly use the name
}

class B implements A {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
    // compulsory to define both method show(),config() here
    // if you fail to define both the method, by default, your class also becomes abstract,
    // but we don't want to get abstract class, we want to create 'concrete' class, Object of B
    // in that case my job is to define both the methods show(),config().

}

public class Interfaces_example {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.config();

//        A.area = "Dhaka"; -> I can't change it because the area is 'final'
        System.out.println(A.area); // directly used here
        /*
            Why it is static final ?!
            -> at first I don't instantiate the interface, I instantiate the class.
               And I'm doing 'implements', not extends.
            -> In implements I get only method, I don't get variables there.
            -> That's why it is static because we want to use the interface name
            -> And 'final' - interface object or interface don't have their own memory in the heap
               there create the object of B, not A. So if you don't have your own memory, how can
               you have a non-final variable.


         */

    }
}
