package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	private final Engine engine;
	
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.start();
		System.out.println("The car is now driving!");
	}

}
