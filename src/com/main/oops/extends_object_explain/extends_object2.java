package com.main.oops.extends_object_explain;

import java.util.Objects;

class Lptp {
    String model;
    int price;

   /* public String toString() {
        return model + " : " + price;
    }

   we don't need to mention toString here. we can create using IDE
    */

    @Override
    public String toString() {
        return "Lptp{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
    //    public boolean equals(Lptp that) {
//        return this.model.equals(that.model) && this.price == that.price;
//    }
    /*
    But there are some in java if you're trying to do equals,
    when you say two objects are equal, of course they should have
    the same value and hash code.

    So don't define equals method by yourself. You Can use IDE
    and generate hashcode and equals. It will generate equals method for you.
 */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Lptp lptp = (Lptp) o;
        return price == lptp.price && Objects.equals(model, lptp.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}

public class extends_object2 {
    public static void main(String[] args) {
        Lptp obj1 = new Lptp();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;


        Lptp obj2 = new Lptp();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;


//        boolean result = obj1 == obj2;
        boolean result = obj1.equals(obj2);
        System.out.println(result);
    }
}