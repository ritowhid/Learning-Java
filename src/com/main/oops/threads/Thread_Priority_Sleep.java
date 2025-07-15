package com.main.oops.threads;

class D extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10); // Slows down thread D
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class E extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10); // Slows down thread E (less than D)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread_Priority_Sleep {
    public static void main(String[] args) {
        D obj1 = new D();
        E obj2 = new E();

        // Set thread priorities (optional, JVM may or may not honor this)
        obj1.setPriority(Thread.MIN_PRIORITY);   // Lower priority
        obj2.setPriority(Thread.NORM_PRIORITY);   // Higher priority
        obj1.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    }
}
/*
    Thread.setPriority(int):
    Thread.MIN_PRIORITY    = 1
    Thread.NORM_PRIORITY   = 5 (default)
    Thread.MAX_PRIORITY    = 10

    ✅ Thread priority is just a **hint** to the JVM scheduler.
    ❗ It does NOT guarantee which thread will run first or more often.

    Thread.sleep(milliseconds):
    - Temporarily pauses the current thread.
    - Allows other threads to execute.
    - Helps observe interleaving and timing between threads.
 */