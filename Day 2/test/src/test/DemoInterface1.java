package test;

interface it2 {
	abstract void add();
	abstract void div();
}

abstract class asd implements it2 {
	public void add() {
		System.out.println("addition logic");
	}
}

public class DemoInterface1 extends asd {
	public void div() {
		System.out.println("divison logic");
	}

	public static void main(String[] args) {
		DemoInterface1 gg = new DemoInterface1();
		gg.add();
		gg.div();
	}
}
