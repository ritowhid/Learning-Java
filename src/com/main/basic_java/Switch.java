package com.main.basic_java;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*
            Syntax:
            switch(expression) {
            case x:
              // code block
            break;
            case y:
              // code block
            break;
            default:
              // code block
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int day = in.nextInt();
//        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("There is no day exist");
        }

        // 'switch' with 'if'
        if (day == 1) {
            System.out.println("Saturday");
        } else if (day == 2) {
            System.out.println("Sunday");
        } else if (day == 3) {
            System.out.println("Monday");
        } else if (day == 4) {
            System.out.println("Tuesday");
        } else if (day == 5) {
            System.out.println("Wednesday");
        } else if (day == 6) {
            System.out.println("Thursday");
        } else if (day == 7) {
            System.out.println("Friday");
        } else {
            System.out.println("There is no day exist");
        }


        // Enhanced 'switch' statement
        switch (day) {
            case 1 -> System.out.println("Saturday");
            case 2 -> System.out.println("Sunday");
            case 3 -> System.out.println("Monday");
            case 4 -> System.out.println("Tuesday");
            case 5 -> System.out.println("Wednesday");
            case 6 -> System.out.println("Thursday");
            case 7 -> System.out.println("Friday");
            case 8 -> System.out.println("Are you made...!!! Week consists of 7 days");
            default -> System.out.println("There is no day exist");
        }


        //=========================================================
        switch (day){
            case 1:
                System.out.println("Saturday you have class");
                break;
            case 2:
            case 3:
                System.out.println("Weekend");
                break;
            case 4, 5:
//            case 5: I can add a multiple case in one
            case 6:
                System.out.println("You have class, check your routine");
                break;
            case 7:
                System.out.println("it's Friday!!! Take rest");
        }
        // Enhanced way=========================================
        switch (day) {
            case 1 -> System.out.println("Saturday you have class");
            case 2, 3 -> System.out.println("Weekend");
            case 4, 5, 6 -> System.out.println("You have class, check your routine");
            case 7 -> System.out.println("it's Friday!!! Take rest");
        }

        //====================================================
        String days = "Sunday";
        String result = "";

        result = switch (days) {
            case "Saturday", "Sunday": yield "6 am"; // 'yield; instead of '->';
            case "Monday": yield "8 am";
            default: yield "7 am";
        };
        System.out.println(result);



        //===================================================
        int c = in.next().charAt(0);
        switch (c) {
            case 'a':
            case 'A':
                System.out.println("You entered 'a' or 'A'");
                break;
            case 'b':
            case 'B':
                System.out.println("You entered 'b' or 'B'");
                break;
            default:
                System.out.println("You entered a character other than 'a'/'A' or 'b'/'B'");
                break;
        }

    }
}
