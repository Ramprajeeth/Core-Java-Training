package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.MyService;

@RestController
public class myController {
	
	@Autowired
	private MyService service;
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@GetMapping("/getAllEmployees/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable int id) {
		Optional<Employee> val = service.getEmployeeById(id);
		if(val.isPresent()) {
			return ResponseEntity.ok(val.get());
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body("Employee with ID: "+ id + " Not Found");
		
		
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public String updateEmployee(@PathVariable int id, @RequestBody Employee employee) {
		return service.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/deleteEmployees")
	public String deleteEmployees() {
		service.deleteAllEmployees();
		return "All records deleted successfully!";
	}
}
