package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
	private Printer printer1;
	private Printer printer2;

	public MyRunner(Printer printer1, Printer printer2) {
		this.printer1 = printer1;
		this.printer2 = printer2;
	}

	@Override
	public void run(String... args) throws Exception {
		printer1.printMessage();
		printer2.printMessage();

		if (printer1 == printer2) {
			System.out.println("Both are the same object");
		} else {
			System.out.println("Both are different");
		}

	}

}
