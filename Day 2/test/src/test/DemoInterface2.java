package test;

interface it3 {
	void m1();
}
interface it4 {
	void m2();
}

public class DemoInterface2 implements it3, it4{
	public void m2() {
		System.out.println("I m  mehtod m2 ");
	}
	public void m1() {
		System.out.println("I m  mehtod m1 ");
	}
	public static void main(String[] args) {

		DemoInterface2 ff = new DemoInterface2();
		ff.m1();
		ff.m2();
	}
}
