package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.MyService;

@RestController
public class MyController {

	private final MyService myService;

	public MyController(MyService myService) {
		this.myService = myService;
	}

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return myService.getAllEmployees();
	}
	
	@GetMapping("/getAllEmployees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return myService.getEmployeeById(id);
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		return myService.addEmployee(employee);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public String updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		return myService.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllEmployees() {
		return myService.deletAllEmplpoyees();
	}

}
