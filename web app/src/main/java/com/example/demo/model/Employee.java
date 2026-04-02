package com.example.demo.model;

import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "Must be filled")
	@Pattern(regexp = "^[a-zA-Z]+( [a-zA-Z]+){0,2}$", message = "Name can only contain letters and a maximum of 2 single spaces (e.g., First Middle Last)")
	private String name;
	@NotNull(message = "Must be a number")
	@Range(min = 18, max = 65, message = "Age must be between 18 and 65")
	private Integer age;
	@NotNull(message = "Must be either MANAGER|TESTER|PROGRAMMER")
	private Designation designation;
	@NotNull
	@Positive
	private int salary;

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Designation getDesignation() {
		return designation;
	}

	public int getSalary() {
		return salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
