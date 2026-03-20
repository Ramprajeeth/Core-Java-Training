package com.example.demo.Entity;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private int salary;
	private String designation;
	
	public Employee(int id, String name, int age, int salary, String designation) {
		this.id = id;
		this.age = age;
		this.designation = designation;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		
	} //Apparently we need this for jackson to create an object for converting to object
	
	public int getAge() {
		return age;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
