package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.MyRepo;
import com.example.demo.utility.Employee;

@RestController
public class MyController {

	private MyRepo repository;

	public MyController(MyRepo repository) {
		this.repository = repository;
	}

	@GetMapping("/getAllEmployee")
	public List<Employee> getAllemployees() {
		return repository.findAll();
	}

	@GetMapping("getEmployee/{id}")
	public Employee getEmployeebyId(@PathVariable int id) {
		Optional<Employee> emp = repository.findById(id);
		return emp.orElse(null);
	}

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		repository.save(employee);
		return "Employee added Successfully!";
	}

	@DeleteMapping("/deleteEmployee")
	public String deleteEmployee(@PathVariable int id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
			return "Employee deleted Successfully!";
		}

		return "Employee not found!";
	}

	@PutMapping("/updateEmployee")
	public String updateEmployeeById(@RequestBody Employee employee) {
		if (repository.existsById(employee.getId())) {
			Optional<Employee> empOptional = repository.findById(employee.getId());

			Employee emp = empOptional.get();
			emp.setName(employee.getName());
			emp.setSalary(employee.getSalary());
			repository.save(emp);

			return "Record Updated Succesfully";

		}
		
		return "Record Not found!";
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteEmployeeById() {
		repository.deleteAll();
		return "All records deleted Successfully!";
	}
}
