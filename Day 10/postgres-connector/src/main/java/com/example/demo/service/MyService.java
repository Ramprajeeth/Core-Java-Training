package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class MyService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}
	
	public Optional<Employee> getEmployeeById(int id) {
		Optional<Employee> emp = repository.findById(id);
		return emp;
	}
	
	public String addEmployee(Employee employee) {
		repository.save(employee);
		return "Employee added Successfully!";
	}
	
	public String updateEmployee(int id, Employee updatedEmployee) {
		Optional<Employee> opt = repository.findById(id);
		if(opt.isPresent()) {
			Employee e = opt.get();
			e.setName(updatedEmployee.getName());
			e.setSalary(updatedEmployee.getSalary());
			repository.save(e);
			return "Record Updated Successfully!";
		}
		
		return "Record Not Found!";
	}
	
	public void deleteAllEmployees() {
		repository.deleteAll();
		return;
	}
}
