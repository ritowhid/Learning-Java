package com.main.OOPs.Exception_Handling;
import java.lang.Exception;
public class Exception_Throw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i; // This will result in j = 0 since i = 20
            if (j == 0)
                // Manually throw an exception when j is zero
                throw new ArithmeticException("I don't want '0'");
        }

        // This catch will handle the thrown ArithmeticException
        catch (ArithmeticException e) {
            j = 18 / 1;
            System.out.println("That's the default output: " + e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Something went wrong...! " + e.getMessage());
        }

        System.out.println("j = " + j);
        System.out.println("Bye");
    }
}
