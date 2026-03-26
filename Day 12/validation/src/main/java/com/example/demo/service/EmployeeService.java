package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

		@Autowired
		private EmployeeRepository repository;
		
		public List<Employee> getAllEmployees() {
			return repository.findAll();
		}
		
		public Employee addEmployee(Employee employee) {
			return repository.save(employee);
		}
		
		public String deleteEmployees() {
			repository.deleteAll();
			return "Deleted!";
		}
		
		public Employee updateEmployee(int id, Employee employee) {
			Optional<Employee> emp = repository.findById(id);
			if(emp.isPresent()) {
				Employee e = emp.get();
				e.setName(employee.getName());
				e.setPhoneNumber(employee.getPhoneNumber());
				e.setSalary(employee.getSalary());
				repository.save(e);
				return e;
			}
			
			return null;
		}
}
