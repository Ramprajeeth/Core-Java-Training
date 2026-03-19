package test;

class MyThread2 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName() +
				" --Is running with --" + Thread.currentThread().getPriority());
	}
}

public class DemoPriority {
	public static void main(String[] args) {
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();

		t1.setName("Low Priority");
		t2.setName("Normal Priority");
		t3.setName("High Priority");

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
	}
}
