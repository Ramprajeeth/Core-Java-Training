package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class MyService {

	private final EmployeeRepository employeeRepository;

	public MyService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee Not Found " + id));
	}

	public String addEmployee(Employee emp) {
		employeeRepository.save(emp);
		return "Employee Added Successfully!";
	}

	public String updateEmployee(int id, Employee employeeUpdate) {
		Employee e = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee with ID " + id + " Not Found"));

		e.setName(employeeUpdate.getName());
		e.setSalary(employeeUpdate.getSalary());
		employeeRepository.save(e);
		return "Employee Updated Successfully!";
	}
	
	public String deletAllEmplpoyees() {
		employeeRepository.deleteAll();
		return "All records Deleted Successfully!";
	}

}
