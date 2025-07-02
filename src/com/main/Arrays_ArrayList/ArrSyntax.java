package com.main.Arrays_ArrayList;

import java.util.Scanner;

public class ArrSyntax {
    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner in = new Scanner(System.in);

        // 1D Array
        System.out.print("Enter the array size: ");
        int size = in.nextInt();

        // Initialize the array
        int[] arr = new int[size];

        // Take input from the user for 1D array
        System.out.println("Enter " + arr.length + " elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }

        // Display the 1D array
        System.out.print("\nThe elements of the 1D array are: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
//===============================================================
        // 2D Array Initialization and Input, it also called jagged array.
//        int[][] myArr = new  int[3][];
        int[][] myArr = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9}
        };

        System.out.println("\nThe elements of the 2D array are:");
        int i = 0;
        while (i < myArr.length) {
            int j = 0;
            while (j < myArr[i].length) {
                System.out.print(myArr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
//==============================================================
        // 3D Array Initialization
        // Declare a 3D array of size 2 x 3 x 4
//        int[][][] arr = new int[2][3][4];
        int[][][] threeD = {{{10}, {20, 30}, {40}}};

        // Dynamic Array Input (user-defined size)
        System.out.print("\nEnter the size of the dynamic array: ");
        int sc = in.nextInt();
        int[] dArr = new int[sc];

        System.out.println("Enter " + sc + " elements for the dynamic array:");
        for (int j = 0; j < dArr.length; j++) {
            System.out.print("Element " + (j + 1) + ": ");
            dArr[j] = in.nextInt();
        }

        System.out.print("\nThe elements of the dynamic array are: ");
        for (int element : dArr) {
            System.out.print(element + " ");
        }
        System.out.println();
//========================================================================
        // 2D Array (dynamic size input)
        System.out.println("\nEnter the number of rows for the 2D array:");
        int rows = in.nextInt();
        System.out.println("Enter the number of columns for the 2D array:");
        int cols = in.nextInt();

        // Initialize 2D array based on user input
        int[][] array = new int[rows][cols];

        // Take input for the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print("Enter element at [" + r + "][" + c + "]: ");
                array[r][c] = in.nextInt();
            }
        }

        // Printing the 2D array
        System.out.println("\nThe 2D array is:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }

        //========================================================
        // Declare a jagged 3D array with 2 blocks
        int[][][] jagged3D = new int[2][][];

        // Initialize first block with 2 rows
        jagged3D[0] = new int[2][];
        jagged3D[0][0] = new int[] {1, 2};       // First row with 2 columns
        jagged3D[0][1] = new int[] {3, 4, 5};    // Second row with 3 columns (jagged)

        // Initialize second block with 1 row
        jagged3D[1] = new int[1][];
        jagged3D[1][0] = new int[] {6, 7, 8, 9}; // One row with 4 columns

        // Loop over blocks
        for (int a = 0; a < jagged3D.length; a++) {
            System.out.println("Block " + a + ":");

            // Loop over rows in each block
            for (int j = 0; j < jagged3D[a].length; j++) {

                // Loop over columns in each row
                for (int k = 0; k < jagged3D[a][j].length; k++) {
                    System.out.print(jagged3D[a][j][k] + " ");  // Print each element
                }
                System.out.println();  // New line after each row
            }
            System.out.println();      // Blank line after each block
        }

        //  Drawbacks: Array is an object, Array is Fixed, Traverse between elements, Array of different types, Collection

        // Close the scanner
        in.close();
    }
}