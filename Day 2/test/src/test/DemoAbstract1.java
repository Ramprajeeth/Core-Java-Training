package test;

abstract class q
{
	abstract void add();
	abstract void div();
}
abstract class qw extends q
{
	void add()
	{
		System.out.println("addtion logic");
	}
}

public class DemoAbstract1 extends qw {
	void div()
	{
		System.out.println("Division logic");
	}
	public static void main(String[] args) {
		DemoAbstract1 gg = new DemoAbstract1();
		gg.add();
		gg.div();
		}
}
