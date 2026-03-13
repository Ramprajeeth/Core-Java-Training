package test;

interface Test3 {
	int m1(int x);
}

public class DemoAnonymous2 {
	public static void main(String[] args) {
		Test3 i = x -> x * x;
		System.out.println("the square " + i.m1(5));
	}

}
