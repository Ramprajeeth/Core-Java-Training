package com.project;

class Employee {
	private String name;
	private byte age;
	private String designation;
	private int salary;
	
	public byte getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setAge(byte age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
