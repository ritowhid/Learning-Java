package com.main.basic_java;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Celsius to Fahrenheit
        System.out.println("Please enter temp in Celsius: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temp in Fahrenheit: " + tempF);

        //Fahrenheit to Celsius
        System.out.println("Enter temperature in fahrenheit: ");
        float fTemp = in.nextFloat();
        float cTemp = (fTemp - 32) * 5/9;
        System.out.println("Temp in Celsius: " + cTemp);
    }
}
