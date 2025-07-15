package com.main.basic_java;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of the numbers
        System.out.println("first way:");
        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max);

        // Another way:
        System.out.println("second way:");
        int maximum = 0;
        if (a > b) {
            maximum = a;
        } else {
            maximum = b;
        }
        if (c > b){
            maximum = c;
        }
        System.out.println(maximum);

        // Another way:
        System.out.println("third way:");
        int m = Math.max(c, Math.max(a,b));
        System.out.println(m);
    }
}
