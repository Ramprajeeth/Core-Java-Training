package test;

import java.time.LocalDate;

public class DemoLocalDate {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		LocalDate joiningDate = LocalDate.of(2024, 1, 31);
		System.out.println(today);
		System.out.println(joiningDate);
	}
}
