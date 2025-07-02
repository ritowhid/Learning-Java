package com.main.Method;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // variable length arguments
//        fun(2,3,4,5,6,7,8,5,456,644,34,4);
//        fun();
//
//        multiple(3, 5, "Towhid");
    }

    // normal arguments | keywords arguments
    static  void multiple(int a, int b, String ...v){  // vararg parameters must be the last in the list.
        System.out.println(Arrays.toString(v));

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
