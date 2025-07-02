package com.main.BasicJava;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        //Integer Input:
        System.out.print("Enter a integer: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n);
        //Float Input:
        System.out.println("Enter a float num: ");
        float f = input.nextFloat();
        System.out.println(f);
        //Character Input:
        System.out.println("Enter a Character");
        char c = input.next().charAt(0);
        System.out.println(c);
        //String Input:
        System.out.println("Enter a String: ");
        String s = input.next();
        System.out.println(s);


    }
}
