package test;

class BoilWater extends Thread {
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("water is boiling... step " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("water boilging finished");
	}
}

public class DemoJoin {
	public static void main(String[] args) {
		BoilWater t1 = new BoilWater();
		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Now add tea powder");
	}
}
