package test;

interface Tests2 {
	void m1();
}

public class DemoAnonymous1 {
	void m2() {
		System.out.println("Normal Method");
	}
	
	public static void main(String[] args) {
		Tests2 t = () -> {
			System.out.println("Lambda Expression");
		};
		DemoAnonymous1 dd = new DemoAnonymous1();
		t.m1();
		dd.m2();
	}
}
