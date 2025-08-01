package com.main.method;

import java.util.Scanner;

public class MiddleCharDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();
        System.out.print("The middle character in the string: " + middle(str) + "\n");
    }
    static String middle(String str){
        int position;
        int length;
        if (str.length() % 2 == 0){
            position = str.length() / 2 - 1;
            length = 2;
        }
        else{
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}
