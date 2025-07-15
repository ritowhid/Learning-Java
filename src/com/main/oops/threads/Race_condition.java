package com.main.oops.threads;

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class Race_condition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
/*

(think where a bank card used by person 2 at the same time, the same second)


    - Threads and Mutations together is not a good idea.
    That's why if you are working with threads, always try to make sure
    that you work with data make sure the data is immutable.
    Or, if you think that there is a method which can do some mutation, make it thread safe.

    Thread safe mean - only one thread can work with that at one point.

    t1 jobs - call increment thousands time.
    t2 jobs - call increment thousands time.
    ultimately, we want count variable to be around 2000

    main is doing print the value of count.

    we were expecting t1,t2 will complete the work, and main will print count. but that's not the case.

    t1, t2 are running anyway, they are running any case, main is doing nothing here. main says - I have started
    these 2 threads, and now I will simply print the value of count. In between the iteration - maybe t1 done some
    iteration, t2 done some iteration; main is printing count anyway.
    we have to ask main hey don't print count here. let them comeback, as main continues, let them comeback(t1, t2)
    let t1 t2 comeback by complete their work by doing 1000 iterations.  when t1 and t2 comeback after this try to
    print the value of count. ask them by using join method. join is a special method which allows your main thread to wait
    for the other threads to come back and join.
    Threads are sometime unpredictable, they have a different behavior and unfortunately, they cannot control directly.

    when we have 2 threads t1 and t2 - they both are executing the same method and in this method what happening ->
    so when you say increment it is actually getting the value of count, it's actually 2 steps:

    first it will get the value of count, the current value of count; count = count+1;
    whatever new value you get this just add it with 1. and then assign it to count back.
    but what if both the threads reach to this count at the same time. let's say t1 t2 they reach to the count same time -
    they both got the value which is 3, both say 3+1=4. we called 2 increments - 2 times, but the incremented happens only once.

    so that's what happens when you have two threads working with the same variable or shared variable.
    mutations and threads are not good, and every time you run this will get different output.

    Now how do you make this consistent?
    you might be thinking why we got 2000 bcz maybe your threads are not going to increment at the same time; that's not the case.
    when you give a bigger number, chances are very low to get the full number. the point is this is not a good way.
    how do you make sure only 1 thread works with that at one time? In that case, you can use a keyword called 'synchronized'.
    use this one keyword, your java will make sure that this increment will be called only by one method at a time. so
    t1 is working with increment, t2 has to wait.


 */