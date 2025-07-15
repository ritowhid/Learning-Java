package com.main.oops.exception_handling;
/* Most of the name which end with able are interfaces, but the Throwable is class.
   Throwable:
            1. Exception - it's something which you can, and you should handle
                    -> Runtime > Arithmetic, ArrayIndex, Null pointer, etc.
                       all the runtime exception is called unchecked exceptions

                    -> SQL exception > These are called checked exception
                       Unchecked & Checked means-most of the time when you write the line
                       your compiler will not force you to handle the exception, it will say
                       hey it's your choice to handle the exception.
                       But when your compiler sees that there is a line which can raise exception
                       which is not runtime exception, e.g., it can raise SQL, IO exception, in that
                       case it will ask you compulsory to handle the exception.
                       When we were trying to load the class with the help of class dot for name on the
                       right side of the method, we have mentioned, it throws i/o exception. It was forcing
                       you to handle it.

                    -> IO exception

            2. Error - error you can't, bcz when error hits it's simply stop the execution
               normally it doesn't happen, but if it happens, you can't do anything with that.
               E.g., it can be the ThreadDeath, IO error, Virtual Machine error, OutOfMemory.


 */

public class Exception_Hierarchy {
    public static void main(String[] args) {
        
    }
}
