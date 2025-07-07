package com.main.OOPs.Exception_Handling;

// The method that is calling (another method), it will handle the exception
// Instead, it declares it using 'throws', passing the responsibility to the caller.

import static java.lang.Class.forName;

class A {
    public void show() throws ClassNotFoundException // If you 'throw' the exception here, it means you're saying, "I won't handle it; let the caller (main method) handle it."
    {
        Class.forName("Calc");
    }
}

public class Ducking_Exception_usingThrows {
    static {
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {
         /* public static void main(String[] args) throws ClassNotFoundException { -> Not a good idea.
           Basically, you're asking the JVM to handle the exception because the JVM runs the main method.
           But the JVM will say, "If you throw it to me, I’ll just stop the execution."
         */
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
