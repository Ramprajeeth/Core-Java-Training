package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employees") 
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
		Optional<Employee> e = employeeService.getEmployeeById(id);
		if (e.isPresent()) {
			return ResponseEntity.ok(e.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping("/add")
	public Employee createEmployee(@RequestBody Employee emp) {
		return employeeService.createEmployee(emp);
	}

	
	@PutMapping("/{id}/raise/{percentage}")
	public ResponseEntity<?> raiseSalary(@PathVariable int id, @PathVariable int percentage) {
		try {
			Employee updatedEmployee = employeeService.raiseSalary(id, percentage);
			return ResponseEntity.ok(updatedEmployee);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return ResponseEntity.ok("Employee deleted successfully");
	}
}
