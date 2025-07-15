package com.main.method;

public class Shadowing {
    static int x = 30; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //30
        int x; // the class variable at line 4 is shadowed by this
//        System.out.println(x); // scope will begin when value is initialised
        x = 80;
        System.out.println(x); // 80
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}