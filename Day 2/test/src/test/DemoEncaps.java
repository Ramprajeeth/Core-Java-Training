package test;

class Abcd {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
}

public class DemoEncaps extends Abcd {

	public static void main(String[] args) {
		DemoEncaps gg = new DemoEncaps();
		gg.setA(22);
		int ab = gg.getA();
		System.out.println(ab);
	}
}
