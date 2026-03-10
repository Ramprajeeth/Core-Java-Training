package org.example;

class Super {

    void property() {
        System.out.println("property from Super");
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Super{

        void property() {
            System.out.println("property from Main");
        }
        void m1() {
            System.out.println("no param");
        }

        void m2(int a) {
            System.out.println("1 param " + a);
        }

        public static void main(String[] args) {
            Main m = new Main();
            m.m1();
            m.m2(4);
            m.property();
        }
    }


