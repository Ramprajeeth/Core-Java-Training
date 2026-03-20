package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;

@RestController
public class MyController {
	ArrayList<Employee> emp = new ArrayList<Employee>();
	
	public MyController() {
		emp.add(new Employee(1,"John",30, 5000,"Developer"));
		emp.add(new Employee(2,"Jane",30, 6000,"Tester"));
		emp.add(new Employee(3,"Modi",40, 9000,"PM"));
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getEmployees(){
		return emp;
	}
	
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		for(Employee e: emp) {
			if(e.getId() == id) {
				return e;
			}
		}
		
		return null;
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee e) {
		emp.add(e);
		return "Added Successfully";
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		for(Employee e: emp) {
			if(e.getId()==id) {
				emp.remove(e);
				return "Employee with ID "+ id+" deleted Successfully";
			}
			
			
		}
		
		return "Employee with ID "+id+ "Not found";
	}
	
	@PutMapping("/updateEmployee/{id}")
	public String updateEmployeeById(@PathVariable int id, @RequestBody Employee reqemp) {
		for(Employee e: emp) {
			if(e.getId()==id) {
				e.setAge(reqemp.getAge());
				e.setDesignation(reqemp.getDesignation());
				e.setName(reqemp.getName());
				e.setSalary(reqemp.getSalary());
				e.setId(reqemp.getId());
				return "Employee with ID "+ id+" updated Successfully";
			}
			
			
		}
		
		return "Employee with ID "+id+ "Not found";
	}
}
