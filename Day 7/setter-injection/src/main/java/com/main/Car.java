package com.main;

public class Car {
	
	Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.sound();
		System.out.println("Car is moving!");
	}

}
