package com.main.OOPs.Mixed_Concept;

abstract class Class_A {
    public void show() {

    }
}

class Class_B extends Class_A {
    public void show() {
        System.out.println("in Class_B show");
    }
}

public class Abstract_Anonymous_innerClass {
    public static void main(String[] args) {

        // creating the object of anonymous inner class
        Class_A obj = new Class_A(){
            public void show() {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}

/*
When you create an anonymous class using an abstract class,
you're required to override all abstract methods of that abstract class.

Here- new Class_A() creates an anonymous subclass of the abstract class 'Class_A'
we override the abstract method show()
the object 'obj' is created and used immediately
 */