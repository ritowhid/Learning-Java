package com.main.method;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
//        greetings();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

     static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static void greetings(){
        System.out.println("Hello world...!");
    }
}
