package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		Car car = (Car) ac.getBean("myCar");
		
		car.drive();

	}

}
