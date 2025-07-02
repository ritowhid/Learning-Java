package com.main.BasicJava;

public class DataTypes {
    public static void main(String[] args) {
        byte b = 127; //Size:1byte stores:whole numbers
        short s = -32768; //Size:2byte Stores:whole numbers
        int myNum = 5; //Size:4bytes stores:whole numbers
        long l = -922337203; //Size:8bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float myF = 4.54f; //Size:4bytes
        double d = 35.242434d; //Size:8bytes
        char myLetter = 'R'; //Size:2bytes
        boolean myB = true; //Size:1bit
        String myText = "Hello"; // String

        //A floating point number can also be a scientific number with an "e" to indicate the power of 10:
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        //String Concatenation: 1st way
        String name1 = "Rakibul";
        String name2 = "Towhid";
        System.out.println(name1 + " " + name2);

        // 2nd way
        String firstName = "Rakibul";
        String lastName = "Towhid";

        int len = lastName.length();
        System.out.println(len);
        System.out.println(firstName.concat(lastName));
    }
}
