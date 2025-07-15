package com.main.oops.mixed_concept;

//class Alien {
//    private final int id;
//    private final String name;
//
//    Alien(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" + "id=" + id + ", name='" + name + '\'' + '}';
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true; // same reference
//        if (obj == null || getClass() != obj.getClass()) return false; // null or different class
//        Alien alien = (Alien) obj; // cast
//        return id == alien.id && Objects.equals(name, alien.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//}

// do this stuff in one line.
record Alien(int id, String name) {
    /* - all the variable here is by default private and final because its immutable data.
       - 'record' is actually a class, and this class can't extend any other class. this record class extends record class
       - you can implement interface e.g., implements Cloneable
 */

//    public Alien() {
//        this(0, " ");
//    }

    public Alien {
        if (id==0)
            throw new IllegalArgumentException("id cannot be zero");

    }
// you can define the methods as well. you can actually create multiple methods here,
// you can create normal method, static method and static variable as well,
// but not instance variable-if you want to do declare instance variable do it on parameter

}

public class Record_Class {
    public static void main(String[] args) {
        Alien a1 = new Alien(0, "Towhid");
        Alien a2 = new Alien(1, "Towhid");

//        System.out.println(a1.equals(a2));
        System.out.println(a1);
    }
}
