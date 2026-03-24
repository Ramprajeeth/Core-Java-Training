package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Employee;

import jakarta.transaction.Transactional;

public interface MyRepo extends JpaRepository<Employee, Integer> {
	
	// GET ALL (Native)
    @Query(value = "SELECT * FROM employee", nativeQuery = true)
    List<Employee> getAllEmployees();
    
    // GET BY ID
    @Query(value = "SELECT * FROM employee WHERE id = ?1", nativeQuery = true)
    Employee getEmployeeById(int id);
    
    //  UPDATE
    @Modifying
    @Transactional
    @Query(value = "UPDATE employee SET name = ?1, salary = ?2 WHERE id = ?3", nativeQuery = true)
    int updateEmployee(String name, double salary, int id);
    
    // DELETE
    @Modifying
    @Transactional
    @Query(value = "DELETE FROM employee WHERE id = ?1", nativeQuery = true)
    int deleteEmployee(int id);
}

