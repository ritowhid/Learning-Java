package com.main.oops.exception_handling;

import java.lang.Exception;

public class Exception_Handling_MultiTryCatch {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String str = null;

        try {
            j = 18 / i; // This will throw ArithmeticException
            System.out.println(str.length()); // NullPointerException
            System.out.println(nums[1]);
            System.out.println(nums[5]); // This line won't execute if exception occurs earlier
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay within your array bounds");
        }
        catch (Exception e) {
            // Exception is parent of parent bcz
            // -> ArithmeticException extends RuntimeException
            // -> RuntimeException extends Exception
            // In fact, the Exception actually extends -> Exception extends Throwable ->||-> Throwable implements Serializable
            // if I put 'Exception' on top, it will create an issue, it's unreachable to ArithmeticException, bcz it can handle everything.
            // SO it's a practice or compulsion to have the parent class at the end.
            System.out.println("Something went wrong...!" + e);
        }

        System.out.println("j = " + j);
        System.out.println("Bye");
    }
}

/*
 - In Java, apart from the generic Exception class, we have specific exceptions like
   ArithmeticException and ArrayIndexOutOfBoundsException.

 - In this code, we print "Cannot divide by zero" because the exception occurs at the division line:
   `j = 18 / i;`, where `i = 0`. This throws an ArithmeticException.

 - Once an exception is thrown inside the try block, the rest of the try block is skipped, and control
   is transferred to the corresponding catch block.

 - That's why `System.out.println(nums[5]);` is never executed, since the ArithmeticException occurs first.

 - You can identify the type of exception using specific catch blocks. If you only catch the general
   `Exception`, then you'll need to manually check the type of `e` using `instanceof` to handle it appropriately.

 - A better approach is to use **multiple catch blocks**, each for a specific exception type. For example,
   one catch block for ArithmeticException and another for ArrayIndexOutOfBoundsException.

 - This makes the code more robust and readable, allowing Java to handle each exception type differently.
*/