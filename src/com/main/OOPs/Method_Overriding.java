package com.main.OOPs;

class G {
    public void show() {
        System.out.println("in G show");
    }
    public void config() {
        System.out.println("in G Config");
    }
}
class H extends G {
    public void show() { // This will print because it overrides the superclass method;
                        // the object's own method is prioritized since the object is created from class H
        System.out.println("in H show");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        H obj = new H();
        obj.show(); // Here, H's show method will print. It overrides the show method of class G
        obj.config();
    }
}
