package com.main.Recursion_Backtracking;

import java.util.Scanner;

public class ReverseArray {
    // Method to reverse the array
    void revArr(int[] a, int l, int r) {
        if (l >= r) return;
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
        revArr(a, l + 1, r - 1);
    }


    //=======================================
    int[] j; // Array
    int m;   // Size of the array

    // Another way to reverse the array
    void revArr2(int k) { // k represents the current index
        if (k >= m / 2) return; // Base case: Stop recursion
        // Swap elements at index k and m-k-1
        int temp = j[k];
        j[k] = j[m - k - 1];
        j[m - k - 1] = temp;
        // Recursive call
        revArr2(k + 1);
    }
    //=======================================

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ReverseArray obj= new ReverseArray();

        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }

        // call the reverse method
        obj.revArr(a, 0, n-1);

        // printing the reversed array
        System.out.print("Reversed array: ");
        for (int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }



        System.out.println(); // Separator


        //=======================================
        // Another way:
        System.out.print("Enter the size of the array (m): ");
        obj.m = in.nextInt();
        obj.j = new int[obj.m];

            System.out.println("Enter the elements of the array (j): ");
            for (int k = 0; k < obj.m; k++) {
            obj.j[k] = in.nextInt();
        }

        // Call the recursive method to reverse the array
            obj.revArr2(0);

        // Print the reversed array
            System.out.println("Reversed array: ");
            for (int k = 0; k < obj.m; k++) {
            System.out.print(obj.j[k] + " ");
        }


        //=======================================
    }
}
