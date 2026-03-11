package test;

public class Demo {
	int a = 10;
	int b = 20;

	void m1(int a, int b) {
		System.out.println(a + b);
		System.out.println(this.a + this.b);
	}

	public static void main(String[] args) {
		Demo gg = new Demo();
		gg.m1(2, 3);
	}
}
