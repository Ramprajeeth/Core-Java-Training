package test;

interface Left {
	 default void m1() {
		System.out.println("Left defualt method");
	}
}
interface Right {
	default void m1() {
		System.out.println("Righ defualt method");
	}
}

public class DemoDefault1 implements Left, Right{
	public void m1() {
//		Left.super.m1();
		System.out.println("Overriden");
	}
	public static void main(String[] args) {
		DemoDefault1 t = new DemoDefault1();
		t.m1();
	}
}
