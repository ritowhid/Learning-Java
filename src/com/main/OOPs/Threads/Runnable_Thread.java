package com.main.OOPs.Threads;

class F implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread F: hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Z implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Z: hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Runnable_Thread {
    public static void main(String[] args) {
        Runnable obj1 = new F();
        Runnable obj2 = new Z();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
/*
    So basically when you want to create a thread, you have 2 choices,
            -extend thread class
            -implement runnable interface

    the only thing is this Runnable interface will not have the threads method, in that case
    you need to create a separate object, and then you can use these features.
 */