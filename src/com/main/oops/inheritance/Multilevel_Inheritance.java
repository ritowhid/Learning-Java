package com.main.oops.inheritance;

    /*
        This is an example of Inheritance and Multilevel Inheritance
        (Multilevel Inheritance: GrandParent → Parent → Child)
    */

// GrandParent class
class GrandParent {
    String bloodGroup;

    // constructor
    GrandParent(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    void showGrandParentTraits() {
        System.out.println("Blood Group (Grandparent): " + bloodGroup);
    }
}

// Parent inherits from GrandParent
class Parent extends GrandParent {
    String skinColor;
    String eyeColor;

    // constructor
    Parent(String bloodGroup, String skinColor, String eyeColor) {
        super(bloodGroup);
        this.skinColor = skinColor;
        this.eyeColor = eyeColor;
    }

    void showParentTraits() {
        System.out.println("Skin color (Parent): " + skinColor);
        System.out.println("Eye color (Parent): " + eyeColor);
    }
}

// Child inherits from Parent
class Child extends Parent {
    float height;
    String hairType;

    // constructor
    Child(String bloodGroup, String skinColor, String eyeColor, float height, String hairType) {
        super(bloodGroup, skinColor, eyeColor);
        this.height = height;
        this.hairType = hairType;
    }

    void showChildTraits() {
        System.out.println("Height (Child): " + height + " ft");
        System.out.println("Hair Type (Child): " + hairType);
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Child obj = new Child("O+", "Fair", "Hazel", 5.8f, "Wavy");

        obj.showGrandParentTraits();
        obj.showParentTraits();
        obj.showChildTraits();
    }
}
