package com.main.OOPs.Threads;

public class Thread_States {
    public static void main(String[] args) {

    }
}
/*
    - Every time you create a new thread that goes into a 'New State',
      apart from that, we also have something called 'Runnable State',
      after that we also have 'Running State', 'Waiting State/Block State'
      and then the last State we have is 'Dead'.

    - When you say thread = new thread it becomes 'New State'
    - When you say start - it goes to runnable state.
    - When your thread actually running on the cpu that is Running State.
    - When your thread is executing and waiting for scheduler it is Runnable State.
    - You can hold with the help of sleep method, that goes to Waiting state (apart from this, you also have wait() method.)
    - You can come back from Waiting State to Runnable State using notify directly.
    - When scheduler assigning with the task, whenever it says your turn, at that point it will go running state.
    - In fact, your thread is running, and you want to keep it dead, you can say stop method (but it is deprecated, don't stop thread),
      it will create instability in your software. But once the thread is over, it will go automatically stop.
    - You can also send a thread from Runnable to Dead state with the help of stop
 */
