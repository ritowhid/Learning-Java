package com.main.Arrays_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 44;
        arr[2] = 434;
        arr[3] = 34;
        System.out.println(arr[3]);

        // input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//=================================================
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//=================================================
        for (int j : arr) { // for every element in array, print the element
            System.out.print(j + " "); // here num represent element of the array
        }


        // array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Towhid";
        System.out.println(Arrays.toString(str));

        // Strings are immutable in java and arrays are mutable, mutable means you can change the object
    }
}