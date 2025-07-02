package com.main.Recursion_Backtracking;

import java.util.Scanner;

public class PrintName {
    // First method: Printing "Rakibul" N times
    static int num = 0; // Static variable to track recursion depth
    static int userNum; // User-defined limit

    static void printName() {
        if (num == userNum) { // Base case: Stop when num reaches userNum
            return;
        }
        System.out.println("Rakibul"); // Print the name
        num++; // Increment the counter
        printName(); // Recursive call
    }

    // Second method: Printing "Towhid" N times using Parameters
    void printing(int i, int n) {
        if (i > n) { // Base case: Stop when i > n
            return;
        }
        System.out.println("Towhid"); // Print the name
        printing(i + 1, n); // Recursive call with incremented i
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of times to print 'Rakibul': ");
        userNum = in.nextInt(); // Get the limit from the user
        System.out.println("Running the first method:");
        printName(); // Call the first method


        PrintName obj = new PrintName();
        System.out.print("Enter the number of times to print 'Towhid': ");
        int n = in.nextInt(); // Get the limit from the user
        System.out.println("Running the second method:");
        obj.printing(1, n); // Call the second method
    }
}
