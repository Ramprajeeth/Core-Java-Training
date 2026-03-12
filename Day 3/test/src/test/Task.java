package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;


public class Task {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		LocalDate join = LocalDate.of(2024, 1, 31);
		
		Period between = Period.between(today, join);
		System.out.println("Years" + between.getYears() + " " + "Months" + between.getMonths());
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
	}
}
