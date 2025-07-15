package com.main.oops.exception_handling;

import java.lang.Exception;

public class Exception_Handling_TryCatch {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        try {
            j = 18 / i;
        } catch (Exception e) { // The catch block will be executed only in case of exception, otherwise it will be skipped.
            System.out.println("Something went wrong..!");
        }
        System.out.println(j);

        System.out.println("Bye"); // it will not print (until uses try catch )bcz the execution is stopped in the previous line
        //even if you know nothing may go wrong, if you think that's critical - handle it.
    }
}
/*
    Try {
    } catch (Exception e) {
    }
    - you saying, hey JAVA just try to execute this statement.
    If it works, that's fine, otherwise execute the other part. Don't stop the execution.
    - No JAVA saying, I know that you are just trying to execute if it's not working, then I will
    continue the normal execution here.

    But then what if JAVA tries to execute this and there's an error? In that case, it will throw
    the error.
    And you as a Developer, you have to catch the error.
    So in this case, you will catch the exception.
    The moment it throws the exception, it is showing you an object, and you have to accept it as an object.

    - Whatever handling stuff you want to do, you can do that i the catch block

 */