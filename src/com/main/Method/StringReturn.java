package com.main.Method;

public class StringReturn {
    public static void main(String[] args) {
        String messsage = greet();
        System.out.println(messsage);
    }
    static String greet(){
        String greeting = "Hello...how are you...!!!";
        return greeting;
    }
}
