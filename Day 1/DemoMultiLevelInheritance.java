package org.example;
class Grandparent {
    void property() {
        System.out.println("property from Grandparent");
    }
}

class Parent extends Grandparent {
    void property() {
        System.out.println("property from Parent");
    }
}

public class DemoMultiLevelInheritance extends Parent {
    void property() {
        System.out.println("property from Child");
    }
    public static void main(String[] args) {
        DemoMultiLevelInheritance p = new DemoMultiLevelInheritance();
        p.property();
    }
}
