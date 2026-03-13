package com.project;

import com.project.exceptions.InvalidInputException;
import com.project.common.Checks;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

class Create {

	public void createMainFunction(Scanner sc, ArrayList<Employee> employees) {
		Employee emp = new Employee();
		while (true) {
			System.out.println("Enter your name: ");
			System.out.println("Maximum of Two spaces will be taken");
			String name = sc.nextLine();
			int spaceCount = name.length() - name.replace(" ", "").length();
			if (spaceCount <= 2) {
				emp.setName(name);
				break;
			}

			else {
				System.out.println("Invalid name! Please enter a name with only two spaces");
			}
		}

		while (true) {
			System.out.println("Enter your Age: ");
			System.out.println("Between 19 and 60");
			byte age = 0;
			try {
				age = sc.nextByte();
			} catch (InputMismatchException e) {
				System.out.println("You must enter a number for age!");
				System.out.println("Your age will be set to 0");
			}

			if (age >= 19 && age <= 60) {
				emp.setAge(age);
				break;
			} else {
				System.out.println("PLease enter a number between 19 and 60!");
			}
		}

		sc.nextLine();
// TODO - add a while loop to match the rest
		System.out.println("Enter your Designation: ");
		String des = sc.next();
		try {
			Checks.validDesignationCheck(des);
			emp.setDesignation(des);
		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
			System.out.println("You will be assigned Tester");
			emp.setDesignation("Tester"); // Default Designation
		}

		if (emp.getDesignation().equals("Manager")) {
			emp.setSalary(25000);
		}

		else if (emp.getDesignation().equals("Programmer")) {
			emp.setSalary(20000);
		}

		else {
			emp.setSalary(15000);
		}
		sc.nextLine();

		employees.add(emp);

	}

	public boolean choiceFunction(Scanner sc) {
		System.out.println("Do you want to continue? (y/n) ");
		char choice = sc.next().charAt(0);
		sc.nextLine();
		try {
			Checks.validYOrN(choice);
			if (choice == 'n') {
				return false;
			}

			return true;

		} catch (InvalidInputException e) {
			System.out.println(e.getMessage());
			choiceFunction(sc);
		}

		return true;

	}

}

class Display {
	public void displayMainFunction(ArrayList<Employee> employees) {
		if (employees.isEmpty()) {
			System.out.println("No employees to display.");
			return;
		}
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee e = iterator.next();
			System.out.println("--------------------");
			System.out.println("Employees Name: " + e.getName());
			System.out.println("Employees Age: " + e.getAge());
			System.out.println("Employees Designation: " + e.getDesignation());
			System.out.println("Employees Salary: " + e.getSalary());
			System.out.println("--------------------");
		}
	}
}

class RaiseSalary {
	public void raiseSalaryMainFunction(Scanner sc, ArrayList<Employee> employees) {
		if (employees.isEmpty()) {
			System.out.println("No employees to modify salary for.");
			return;
		}
		System.out.println("Enter the name of the employee whose salary you want to raise:");
		String employeeName = sc.next();
		sc.nextLine();

		boolean found = false;

		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee e = iterator.next();

			if (e.getName().equalsIgnoreCase(employeeName)) {
				System.out.println("Enter the percentage of raise (allowed-max: 10%):");
				int raisePercentage = sc.nextInt();
				sc.nextLine();

				if (raisePercentage >= 1 && raisePercentage <= 10) {
					e.setSalary(e.getSalary() + (int) (e.getSalary() * 0.01 * raisePercentage));
					System.out.println(e.getName() + "'s new salary: " + e.getSalary());
					found = true;
					break;
				} else {
					System.out.println("Max Allowed Raise is 10 %. Please enter a value between 1 and 10.");
				}
			}
		}

		if (!found) {
			System.out.println("Employee with name '" + employeeName + "' not found or raise not applied.");
		}

	}

}

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		boolean isLoop = true;
		while (isLoop) {
			System.out.println("Enter your Choice: ");
			System.out.println("1. Create\n" + "2. Display\n" + "3. Raise salary\n" + "4. Exit\n");
			byte selection = Byte.MIN_VALUE;
			try {
				selection = sc.nextByte();

			} catch (InputMismatchException e) {
				System.out.println("Enter only a number!");

			}

			sc.nextLine();
			try {
				Checks.validChoiceCheck(selection);
			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
			}

			switch (selection) {
			case 1:
				Create create = new Create();
				boolean isContinue = true;
				while (isContinue) {
					create.createMainFunction(sc, employees);
					isContinue = create.choiceFunction(sc);
				}
				break;
			case 2:
				Display display = new Display();
				display.displayMainFunction(employees);
				break;
			case 3:
				RaiseSalary rs = new RaiseSalary();
				rs.raiseSalaryMainFunction(sc, employees);
				break;
			case 4:
				isLoop = false;
				break;

			}

		}
		sc.close();
	}
}