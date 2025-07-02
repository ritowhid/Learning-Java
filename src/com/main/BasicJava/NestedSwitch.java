package com.main.BasicJava;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter department (CSE, EEE, Mechanical): ");
        String dept = in.nextLine();

        switch (dept){
            case "CSE":
                System.out.println("Enter course number (1, 2, 3):");
                int cseCourse = in.nextInt();
                switch (cseCourse){
                    case 1:
                        System.out.println("Course: OOP");
                        break;
                    case 2:
                        System.out.println("Course: Data Structure & Algorithm");
                        break;
                    case 3:
                        System.out.println("Course: Operating System");
                        break;
                    default:
                        System.out.println("Invalid course number for CSE");
                }
                break;
            case "EEE":
                System.out.println("Enter course number (1, 2, 3): ");
                int eeeCourse = in.nextInt();
                switch (eeeCourse) {
                    case 1:
                        System.out.println("Course: Circuit Theory");
                        break;
                    case 2:
                        System.out.println("Course: Electromagnetics");
                        break;
                    case 3:
                        System.out.println("Course: Power Systems");
                        break;
                    default:
                        System.out.println("Invalid course number for EEE");
                }
                break;

            case "Mechanical":
                System.out.println("Enter course number (1, 2, 3): ");
                int mechCourse = in.nextInt();
                switch (mechCourse) {
                    case 1:
                        System.out.println("Course: Thermodynamics");
                        break;
                    case 2:
                        System.out.println("Course: Fluid Mechanics");
                        break;
                    case 3:
                        System.out.println("Course: Solid Mechanics");
                        break;
                    default:
                        System.out.println("Invalid course number for Mechanical");
                }
                break;

            default:
                System.out.println("Invalid department");

        }
    }
}
