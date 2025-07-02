package com.main.Arrays_ArrayList;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {


//        int arr[][] = new int[3][]; // Jagged array
//        arr[0] = new int[5];
//        arr[1] = new int[4];
//        arr[2] = new int[7];
//
//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr[i].length; j++) {
//                arr[i][j] = (int)(Math.random()*10);
//            }
//        }
//        for(int row[]: arr) {
//            for(int col : row) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }


        // Taking input from user:
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take the number of rows for the jagged array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int[][] array = new int[rows][]; // Declare a jagged array

        // Step 2: Take the number of columns for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            array[i] = new int[cols]; // Initialize each row with user-specified size
        }

        // Step 3: Take input values for each element of the jagged array
        System.out.println("Enter the elements of the jagged array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Step 4: Print the jagged array
        System.out.println("The jagged array is:");
        for (int[] row : array) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
