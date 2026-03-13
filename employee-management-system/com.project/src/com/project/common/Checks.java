package com.project.common;

import com.project.exceptions.InvalidInputException;

public class Checks {

	public static void validChoiceCheck(byte choice) throws InvalidInputException {
		if ((choice < 1 || choice > 4) && choice!=Byte.MIN_VALUE) {
			throw new InvalidInputException("Invalid Choice!");
		}
	}

	public static void validDesignationCheck(String designation) throws InvalidInputException {
		if (!designation.equalsIgnoreCase("Manager") && !designation.equalsIgnoreCase("Programmer")
				&& !designation.equalsIgnoreCase("Tester")) {
			throw new InvalidInputException("Invalid Designation!");
		}
	}
	
	public static void validYOrN(char c) throws InvalidInputException {
		if(c!='n' && c!='y') {
			throw new InvalidInputException("Press either Yes or No!");
		}
	}
	
	public static void numChoice(String input) {
		
	}
	
}
