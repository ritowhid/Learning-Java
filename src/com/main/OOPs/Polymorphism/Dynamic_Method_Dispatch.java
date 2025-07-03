package com.main.OOPs.Polymorphism;

class Computer {

}
class Laptop extends Computer {

}



class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C show");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        A obj = new A(); // yes, it is possible to create a reference of a super class object of the subclass.
        obj.show();


        obj = new B(); // we are changing the value here, obj.show() of new A() will be replaced by new B()
        // The Previous link is broken, we got a new link
        obj.show(); // now it will call show method of B
        // It's not about the ty of the object or reference, type is same, but now object is B

        obj = new C();
        obj.show();

        // so here obj.show() behaving differently with a different object. Here is polymorphism.
        // It will decide at runtime which method has to call when
        // Here method overriding

        // And all the concept is called Dynamic Method Dispatch

        /* Point to remember: irrespective of what type of object you have,
        or what type of variable you create is, it all depends upon what
        object you have.

        It is only possible when you have inheritance.
        So only you can have a child object for the parent variable
            */
        Computer obj1 = new Laptop(); // Types of parent but Object is Child
    }
}
