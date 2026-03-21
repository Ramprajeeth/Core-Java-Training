package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	        // Get the bean
	        Car myCar = (Car) context.getBean("myCar");

	        myCar.drive();

	}

}
