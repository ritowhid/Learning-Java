package com.main.basic_java;

public class TypeCasting {
    public static void main(String[] args) {
        /*
        - Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        - Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte
         */

        //Widening Casting(implicit)
        int n = 234;
        double d = n;
        System.out.println(d);

        //Narrowing Casting
        double myDouble = 34.4543d;
        int myInt = (int) myDouble;
        System.out.println(myInt);

        // Type Promotion
        byte a = 10;
        byte b = 30;

        int result = a*b;
        System.out.println(result);

    }
}
