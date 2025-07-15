package com.main.oops.annotation;
//Annotations provide supplemental information about a
// program that is not part of the program itself and
// do not directly affect the operation of the code they annotate

class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in A show");
    }
}

class B extends A {

    @Override
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("in B show");
    }
}

public class Annotation {
    public static void main(String[] args) {

        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();

    }
}