package com.main.Method;

public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        // swap numbers code 
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);
        System.out.println("a:" + a + " " + "b:" + b);
        String name = "kunal kushwaha";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naame) {
        naame = "Rahul Rana"; // creating a new object
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;


        // this change will only be in this function scope only
    }
}
