package com.main.arrays_arrayList;

public class Main {
    public static void main(String[] args) {
        /*
           Syntax:
           datatype[] variable_name = new datatype[size];
        */

        // array is like collection of datatypes
        int[] roll; // declaration of array. roll is getting defined in the stack
        roll = new int[5]; // initialization: actually here objects is being created in the memory(heap)

        // store 5 roll numbers;
        int[] rn = new int[5];
        // or directly
        int[] rn2 = {1, 2, 3, 4, 5};
//        System.out.println(rn2[1]);

        String[] arr = new String[5];
        System.out.println(arr[0]);

        for (String element : arr){
            System.out.println(element);
        }
    }
}
