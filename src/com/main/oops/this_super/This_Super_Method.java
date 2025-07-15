package com.main.oops.this_super;
/*
        When you call a parameterized constructor(DerivedClass), the first thing it sees is super(); not the print method.
        super means - call the constructor of the superclass.
        What super class?! It is called the constructor of the super class,
        but not the parameterized one, the default one.
        We can see the super() method; we are not passing any parameter here.
        So it is called the (BaseClass) particular constructor.
        That's why it's printing 'in X'. And then once it executes the constructor,
        it will execute the remaining part of constructor Y, that's why it's printing 'in Y int'.
        If I want to call the parameterized constructor in X,
        we have to do only one change, which is passing a value in the super() method to make it parameterized.
        So, if you want to call a parameterized constructor,
        then explicitly you have to mention super();
 */
class X { // every class in java extends object class
    public X() {
        super(); // so when you use super() here, you are basically calling a constructor of the object class; object class also have a constructor
        System.out.println("in X");
    }
    public X(int n) {
        super();
        System.out.println("in X int");
    }
}

class Y extends X { // DerivedClass class only extends X, X extends Object. so this is multilevel inheritance.
    public Y() {
        super(); // if I pass a number, it will create an object of B with a default constructor it will execute the default constructor; now we are calling super class constructor by passing a value.
        System.out.println("in Y");
    }
    public Y(int n) {
        this(); // can I execute both Y the constructor with one object. this() will execute the constructor of the same class.
        System.out.println("in Y int");
    }
}

public class This_Super_Method {
    public static void main(String[] args) {
        Y obj = new Y(5); // whenever you crate an object, it will call constructor of a class
    }                    // if you don't pass a value here, it will not call the parameterized constructor
}                        // Every constructor in java has a method (that method is super()) in there if you even don't mention it.