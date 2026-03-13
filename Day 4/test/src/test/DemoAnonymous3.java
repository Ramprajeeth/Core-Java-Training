package test;

interface Tests3 {
	void m1(int a, int b);
}

public class DemoAnonymous3 {
	public static void main(String[] args) {
	Tests3 i = (a,b)->System.out.println("the valus of a and b "+(a+b));
	i.m1(2, 3);
	}
}
