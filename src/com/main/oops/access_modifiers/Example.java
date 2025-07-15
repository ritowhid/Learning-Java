package com.main.oops.access_modifiers;
/* In Java, access modifiers are used to set the accessibility (visibility) of classes,
interfaces, variables, methods, constructors, data members, and the setter methods.

Note the keyword public and private. These are access modifiers in Java.
They are also known as visibility modifiers.

Note: You cannot set the access modifier of getters methods.
*/

class C extends A { // you can't make the class public, bcz you can't have 2 public class in same the file
    public void abc() {
        System.out.println(marksPrt); // you can't access the marks Protected outside the package
                                      // you can access outside the package, but it should be a subclass
    }
}

public class Example {
    public static void main( String[] args ) {
        // accessing the public class
        A obj = new A();

        // accessing the public variable
        obj.marksPu = 80;
//        obj.marksPvt; cannot be accessed bcz it's private
        obj.marksDf = 55;
        obj.marksPrt = 45;
    }
}

/*
    - In one file you should have only one class.
    - Try to make your class public
    - Try to make your instance variables private
    - The method most of the time will be public
    - But if you think there is a method or a variable
      which should be accessed only in the subclass of other packages,
      use protected.
    - Try to avoid default. It should not be using.
    - Try to use protected or public
 */