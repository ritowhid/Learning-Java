package com.main.oops.mixed_concept;

class A {
 public void show1() {
     System.out.println("in A show");
 }
}
class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}
public class Upcasting_Downcasting {
    public static void main(String[] args) {
//    A obj = (A) new B(); // upcasting; we're going from B to A mean up-class
//                        // object B but refers to A
//    obj.show1();       // it normally works, don't need to mention

        A obj = new B();
        obj.show1();


        B obj1 = (B) obj; // downcast; obj is a parent object. you are downcasting it to child reference.
        obj1.show2();
    }
}
