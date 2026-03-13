package test;

@FunctionalInterface
interface MyInterface {
	void m1();
}

public class DemoFI {
	public static void main(String[] args) {

		MyInterface obj = () -> {
			System.out.println("Hello  ia m functional interface");
		};
		obj.m1();
	}
}
