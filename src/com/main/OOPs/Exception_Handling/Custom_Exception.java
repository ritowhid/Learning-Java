package com.main.OOPs.Exception_Handling;
/* You can't create a class and call it an exception.
   It's need special features.
   If you want something, you have 2 choices:
     -you can actually build something,
     -or you can get from parent
 */

class TowhidException extends Exception { // you can extend Exception or RuntimeException
    public TowhidException(String msg) {
        super(msg);
    }
}

public class Custom_Exception {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {
            j = 18 / i; // This will result in j = 0 since i = 20
            if (j == 0)
                // Manually throw an exception when j is zero
                throw new TowhidException("I don't want Zero");
        }

        // This catch will handle the thrown ArithmeticException
        catch (TowhidException e) {
            j = 18 / 1;
            System.out.println("That's the default output: " + e.getMessage()); // here the message e handling by the TowhidException class
        } catch (Exception e) {
            System.out.println("Something went wrong...! " + e.getMessage());
        }

    }
}
