package com.main.OOPs.Mixed_Concept;

class MyClass {
    public void show() {
        System.out.println("in MyClass Show");
    }
}

class YourClass extends MyClass {
    public void show() {
        System.out.println("in YourClass show");
    }
}

public class Anonymouse_InnerClass {
    public static void main(String[] args) {

        MyClass obj = new MyClass() {
            // This is an inner-class, Since
            // it doesn't have a name - it is called Anonymous class
            // Anonymous inner class

            public void show() {
                System.out.println("in new Show");
            }
        };

        obj.show();
    }
}
    /*
    In inner classes, we usually create them inside MyClass.
    But here, it the inner class is outside of MyClass. Why?
    --Because this is not a regular inner class, it's an
    anonymouse inner class, and it's being created at the
    point of object creation, not inside MyClass.
     */