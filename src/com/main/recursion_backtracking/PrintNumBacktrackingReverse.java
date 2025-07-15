package com.main.recursion_backtracking;

import java.util.Scanner;

public class PrintNumBacktrackingReverse {

    void reverseBacktracking(int i, int n) {
        if (i<1)
            return;
        System.out.println(i);
        reverseBacktracking(i-1, n);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintNumBacktrackingReverse obj = new PrintNumBacktrackingReverse();
        System.out.print("Enter how many numbers you want to print: ");
        int n = in.nextInt();
        obj.reverseBacktracking(n, n);



    }
}
