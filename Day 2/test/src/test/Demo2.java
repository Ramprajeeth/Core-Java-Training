package test;

public class Demo2 {
	void m1() {
		this.m2();
		System.out.println("I am methos 1");
	}

	void m2() {
		System.out.println("I am method 2");
	}

	public static void main(String[] args) {
		Demo2 gg = new Demo2();
		gg.m1();

	}
}
