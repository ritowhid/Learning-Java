package com.main.Method;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
//        fun(65);
//        fun("Rakibul Towhid");
//        int ans = sum(3,5);
//        System.out.println(ans);
//        demo(4,5,5,3);
//        demo("Towhid");
//        demo(); // It is ambiguity
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){ // In method overloading, we can have the same method name but different parameters
        return a + b + c;
    }

    static void fun(int a){
        System.out.println("First one: " + a);
//        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second one: " + name);
//        System.out.println(name);
    }
}
