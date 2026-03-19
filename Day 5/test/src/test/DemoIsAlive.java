package test;

class MyThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Number "+ i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}



public class DemoIsAlive {
	
	public static void main(String[] args) {
		MyThread t = new MyThread();
		
		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());
		
		try {
			t.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(t.isAlive());
	}
}
