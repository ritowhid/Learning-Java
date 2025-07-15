package com.main.oops.access_modifiers;

public class A {
    // public variable
     int marksPu; /* if I don't use the public here,
                   it's not a problem to access it
                   because both class are in the same packages */

    /* if you want something access outside the package
     always make it public */

    private int  marksPvt;

    int marksDf; /* If we don't mention anything here, what is it.
                    So by default, there is something called 'Default' access modifier.
                    Default means it can be accessed in same packages
                    */

    protected int marksPrt;

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.marksPvt = 5); // Private variable can be accessed only in the same class
    }
}