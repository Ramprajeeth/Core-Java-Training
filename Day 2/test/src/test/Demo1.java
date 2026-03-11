package test;

public class Demo1 {
	int a ;
	int b;
	void m1(int a, int b) {
	      this.a=a;
	      this.b=b;
	}
	void m2() {
     System.out.println(a+b);
	}

	public static void main(String[] args) {
		Demo1 gg = new Demo1();
		gg.m1(2, 3);
		gg.m2();
	}
}
