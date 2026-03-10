package org.example;

class Grandparent1 {
    void property() {
        System.out.println("property from Grandparent");
    }
}

class Parent1 extends Grandparent1 {
    void property() {
        System.out.println("property from Parent");
    }
}

public class DemoHierarchy extends Grandparent1 {
    void property() {
        System.out.println("property from Child");
    }
    public static void main(String[] args) {
        DemoHierarchy p = new DemoHierarchy();
        p.property();
    }
}
