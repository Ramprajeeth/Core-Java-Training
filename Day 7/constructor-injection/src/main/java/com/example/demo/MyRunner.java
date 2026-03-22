package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
	private Car car;

	public MyRunner(Car car) {
		this.car = car;
	}

	@Override
	public void run(String... args) throws Exception {
		car.drive();

	}

}
