package com.main.Recursion_Backtracking;

import java.util.Scanner;

public class ParameterisedSum {

    void sum(int i, int sum) {
        if (i<1) {
            System.out.println(sum);
            return;
        }
         sum(i-1, sum+i);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParameterisedSum obj = new ParameterisedSum();

        System.out.print("Enter a number: ");
        int n = in.nextInt();
        obj.sum(n,0);


    }
}
