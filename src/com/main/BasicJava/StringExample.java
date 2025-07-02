package com.main.BasicJava;

public class StringExample {
    public static void main(String[] args) {

        String naam = "towhid"; //String in Java is immutable → once created, it cannot be changed.
        System.out.println(naam);

        String name = "Towhid";
        System.out.println("Hello " + name);
        System.out.println(name.concat(" Rakibul"));

        String sn = "Rakib";
        sn = sn + " Towhid";
        System.out.println("Hello " + sn);

        String s1 = "rakib";
        String s2 = "towhid";
        System.out.println(s1 == s2); // if both same, the value for the addresses is same in total we get one object

        // StringBuffer: StringBuffer is mutable → you can change its content without creating a new object each time.
        StringBuffer sb = new StringBuffer("Towhid");
        System.out.println(sb.capacity()); //default 16
        sb.append(" Islam");
        sb.ensureCapacity(100);
        System.out.println(sb);

        /*
            String_Buffer gives me 16 extra spaces.
            It does this because every time you change the data,
            it may require a contiguous memory location in the heap.
            If no such continuous space is available, it would need to relocate.
            To reduce the need for frequent relocation,
            it provides a buffer in advance.(e.g, by appending or inserting text)
         */

        /* StringBuilder: StringBuilder is faster than StringBuffer in non-threaded situations.
            - StringBuilder is similar to StringBuffer but faster because it is not synchronized — meaning it is not thread-safe.
            - Use StringBuilder when your code runs in a single thread (non-threaded), where only one task runs at a time.
            - Since no two parts of your program access the same object at the same time, there's no risk of data conflict, so synchronization isn’t needed — making StringBuilder faster.
            - ✅Summary:
                 - Mutable → You can change the content.
                 - Not thread-safe → Don’t use it in multithreaded code.
                 - Faster than StringBuffer in single-threaded programs.
         */
    }
}