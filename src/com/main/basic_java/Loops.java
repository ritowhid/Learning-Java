package com.main.basic_java;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for loops:
            /*
                    Syntax:
                    for (statement 1; statement 2; statement 3) {
                    // code block to be executed
                    }
             */

//=================================================================

        // for each loop
        /*
                Syntax:
                for(DataTypes Variable : VariableOfElements) {
                     // printing
                }
         */

//=================================================================
        // Q: Print numbers from 1 to 5
        for (int count=1; count <= 5; count++){
            System.out.println(count);
        }
//=================================================================
        // Q: Print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 1; num <= n; num++){
            System.out.println(num + " ");
        }
//=================================================================
        //While Loops:
                /*
                    Syntax:
                    while (condition) {
                    // code block to be executed
                    }
                 */

        int count = 1;
        while (count <= 5){
            System.out.println(count);
            count++;
//=================================================================
            //do while loops:
                /*
                    Syntax:
                    do{

                    } while (Condition)

                 */

            int i = 1;
            do {
                System.out.println(n);
                n++;
            } while (i<5);
        }
//=================================================================
        // Enhanced for loop
        /*
            for (dataType item : arrayOrCollection) {

            }
         */
        int[] numbers = {10, 20, 30, 40, 50};

        // Enhanced for loop to iterate through the array
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
