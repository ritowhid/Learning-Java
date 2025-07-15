package com.main.basic_java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int revNum = 0;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=in.nextInt();
        int duplicate = n;
        while (n>0) {
            int lastDigit = n%10;
            n = n/10;
            revNum = (revNum*10)+lastDigit;
        }
        if (revNum==duplicate) {
            System.out.println(true);
        } else System.out.println(false);
    }
}
