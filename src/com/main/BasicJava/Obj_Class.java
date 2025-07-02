package com.main.BasicJava;

// Calculator class
class Calculator {
    int num; // this is instance variable
    public int add(int num1, int num2) {
        int r = num1 + num2;
        System.out.println("in add: " + r);
        return r;
    }
}
public class Obj_Class {
    public static void main(String[] args) {
        Calculator calc = new Calculator();// Creates Calculator object
        int result = calc.add(5, 6); // Calls add with 5 and 6 → result = 11

        /* short version:
        class Calculator {
            int add(int a, int b) {
                return a + b;
            }
        }
        public class Obj_Class {
            public static void main(String[] args) {
                System.out.println("in add: " + new Calculator().add(5, 6));
            }
        }
         */
    }
}