package com.main.oops.threads;

class A extends Thread{ // just by mentioning that this class is thread, it will not get new thread for you.
    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run() {
        for (int i = 1; i <=10; i++) {
            System.out.println("hello");
        }
    }
}
public class Multiple_Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); // use start() instead of show method.
        obj2.start(); // but it will call not the start method, even if you call it, it calls run method.
                      // so this things you have to remember, in every 'thread' you need to have a run method.

        // start method is like a race, in a race when shoot in the air to run, then the participated run.
        // here, after calling start method, run method executes.
    }
}
/* of course, you can't run all threads at the same time, so they go for time-sharing.
   so 'scheduler': is responsible, basically allows a thread to execute.
   we have multiple threads to execute. let's say we have 8 threads here, and we only have 2 cores available
   in my cpu. So 'scheduler' knows you can actually run only 2 threads at the same time. Basically it's allow this
   thread and this thread to execute. after this, next thread and next thread to execute.
   So basically we are running multiple threads at the same time.
 */