package com.main.basic_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) throws IOException {
        //Integer Input:
        System.out.print("Enter a integer: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n);
        //Float Input:
        System.out.println("Enter a float num: ");
        float f = input.nextFloat();
        System.out.println(f);
        //Character Input:
        System.out.println("Enter a Character");
        char c = input.next().charAt(0);
        System.out.println(c);
        //String Input:
        System.out.println("Enter a String: ");
        String s = input.next();
        System.out.println(s);

        // old type input taking
        System.out.println("Enter a number: ");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        /*
           println belongs to -> PrintStream.
           PrintStream is a class, and println is a method of PrintStream.
           This means, to call println, you first need an object of PrintStream (which is already created).
           That object is 'out'. 'out' is an object of PrintStream.
           This object is created as a static variable inside the 'System' class.
           Since it's static, we can access 'out' using System.out.
           Once you have access to the 'out' object, you can call println.

           -> BufferedReader is a class that belongs to IO
              it can take input from the system keyboard, from the file,
              from the network, wherever you want to take the input from
              you can mention it here.

              whenever you are using it, it's actually a resource, bcz when you are
              trying to read from a file, of course a file is a resource, and when you
              open the file, it's your responsibility to close it. when you open the
              network, it's your responsibility to close it. when you open the database
              connection, it's your responsibility to close it. and you have to close it
              like -> bf.close(); its not compulsory and will not give you error. but a good
              practice is close the resources. otherwise you are licking the resources, data, file,
              you are keeping the resources busy.
              The thing is if you are using a resources, no one else can use it.

        */


    }
}
