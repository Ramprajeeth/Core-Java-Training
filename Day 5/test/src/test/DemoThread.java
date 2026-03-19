package test;

public class DemoThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run method " + i);
		}
	}

	public static void main(String[] args) {
		DemoThread tt = new DemoThread();
		tt.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main mathod " + i);

		}

	}

}
