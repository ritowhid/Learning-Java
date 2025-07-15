package com.main.oops.obj;

class A{
    public A(){
        System.out.println("Object created");
    }
    public void show() {
        System.out.println("in a show");
    }
}
public class Anonymous_Object {
    public static void main(String[] args) {
        new A().show();

        /*
         - anonymous object bcz this type of object doesn't have a name
         - you can't reuse them
         - you should use them when only required
        */
    }
}