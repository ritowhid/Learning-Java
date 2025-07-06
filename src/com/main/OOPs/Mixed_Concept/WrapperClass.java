package com.main.OOPs.Mixed_Concept;

/* Java provides primitive data types;
 that's the reason java is 99.99 % object-oriented,
 not purely object-oriented.

 Primitive values don't extend Object class.

 Wrapper class:
 for every primitive type we are going to have
 a class, for example,
 int -> Integer; and this class basically extends the object class
 char -> Character
 double -> Double

 There are certain requirements where you have to use classes
  */
public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;

        // boxing
//        Integer num1 = new Integer(num);  is deprecated since version 9 and marked for removal

        // now Use Autoboxing (Preferred way):
        Integer num1 = num;

        // Auto-unboxing
        Integer num2 = 20; // Autoboxing: int-> Integer
        int result = num2; // Auto-unboxing: Integer-> int

        // Use Integer.valueOf() (More explicit, better performance)
        Integer num3 = Integer.valueOf(num1);
        System.out.println(num1 +" " + " "+ num3);

        String str = "12";
        int num4 = Integer.parseInt(str);
        System.out.println(num4*2);

    }
}
