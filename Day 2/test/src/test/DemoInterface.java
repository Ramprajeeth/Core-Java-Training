package test;

interface it1 {
	abstract void add();

	abstract void div();

}

public class DemoInterface implements it1{
	public void add() {
		System.out.println("addition logic");
	}

	public void div() {
		System.out.println("Division logic");
	}

	public static void main(String[] args) {
		DemoInterface gg = new DemoInterface();
		gg.add();
		gg.div();
	}
}
