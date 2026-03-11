package test;

abstract class Abc
{
	void add()
	{
		System.out.println("additon");
	}
	abstract void div();
}

public class DemoAbstractClass extends Abc{
	void div()
	{
		System.out.println("division logic");
	}
	public static void main(String[] args) {
		DemoAbstractClass gg = new DemoAbstractClass();
		gg.add();
		gg.div();
		}
}
