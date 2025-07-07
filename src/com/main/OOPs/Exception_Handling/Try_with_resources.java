package com.main.OOPs.Exception_Handling;

import java.util.Scanner;

public class Try_with_resources {
    public static void main(String[] args) {
        // It is not necessary to always use 'try' with 'catch'.
        // If you have a 'try' block and don’t want to use 'catch',
        // you can use a 'finally' block instead.

        int num = 0;
        Scanner in = new Scanner(System.in);
        try {

            int n = in.nextInt();
            System.out.println(num);
        }
        finally {
            in.close();  // *** Now we don't need to close it because it will close automatically:
                        // Scanner(InputStream ----) -> InputStream implements Closeable -> Closeable extends AutoCloseable.
                       // AutoCloseable is an interface
        }
    }
}
/*  finally block always runs, whether an exception is thrown or not.
    It runs:
            After 'try' block, if no error happens.
            After 'catch' block, if an error is caught.
            Even if there is a return or throw inside the try or catch.

    *** Use finally to write code that must always run — like closing files or cleaning up.***
 */