package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;

@DataJpaTest
public class StudentRepositoryTest {
	@Autowired
	private StudentRepository repository;
	
	@Test
	void testFindByCourse() {
		repository.save(new Student("Amit", "Java"));
		repository.save(new Student("Neha", "Python"));
		repository.save(new Student("Ravi", "Java"));
		List<Student> students = repository.findByCourse("Java");
		assertEquals(2,students.size());
		
	}
}
