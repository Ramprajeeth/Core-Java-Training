package test;

public class DemoRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("run method" + i);
		}
	}
	
	public static void main(String[] args) {
		DemoRunnable xx = new DemoRunnable();
		Thread tt = new Thread(xx);
		tt.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("main method" + i);
		}
	}
}
