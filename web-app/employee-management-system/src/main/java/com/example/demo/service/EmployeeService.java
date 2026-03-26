package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public Employee createEmployee(Employee emp) {
		
		if (emp.getDesignation().equalsIgnoreCase("Manager")) {
			emp.setSalary(25000);
		} else if (emp.getDesignation().equalsIgnoreCase("Programmer")) {
			emp.setSalary(20000);
		} else {
			emp.setSalary(15000);
		}
		return employeeRepository.save(emp);
	}

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> getEmployeeById(int id) {
		return employeeRepository.findById(id);
	}

	
	public Employee raiseSalary(int id, int raisePercentage) throws Exception {
		Optional<Employee> optionalEmp = employeeRepository.findById(id);
		
		if (optionalEmp.isPresent()) {
			Employee emp = optionalEmp.get();
			if (raisePercentage >= 1 && raisePercentage <= 10) {
				int currentSalary = emp.getSalary();
				int newSalary = currentSalary + (int) (currentSalary * 0.01 * raisePercentage);
				emp.setSalary(newSalary);
				return employeeRepository.save(emp);
			} else {
				throw new Exception("Max Allowed Raise is 10%.");
			}
		} else {
			throw new Exception("Employee not found.");
		}
	}
	
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
}
