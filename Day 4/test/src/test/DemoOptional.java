package test;

import java.util.Optional;

class Student {
	String email;
	public Student(String email) {
		this.email = email;
	}
	Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
}
public class DemoOptional {
	public static void main(String[] args) {
		Student s = new Student(null);
	   Optional<String>  email=  s.getEmail(); //This returns an Optional so we can't use it directly
	   if (email.isPresent()) {
		System.out.println(email.get().length());
	} else {
		System.out.println("email is not available");

	}
	}
}
