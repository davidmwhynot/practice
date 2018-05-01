/*

	File Name:
	Classification.java

	Author:
	David Whynot

	Date Created:
	3/9/18

	Description:
	Choose one of your earlier programs that accepts numeric keyboard input via the Scanner class. Add appropriate try and catch blocks to the program to respond appropriately if the user enters character data. Utilize validation loops that do not let your user continue until they have made a valid entry.

	Type:
	console

*/

import javax.swing.*;

public class Classification {
	enum CollegeYear {
		FRESHMAN, SOPHMORE, JUNIOR, SENIOR
	}
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t Classification\n\t David Whynot\n\n\n");

		// MAIN
		// enum declaration
		// declare vars
		CollegeYear year;
		String inp;
		int val = 0;
		Boolean flag = false;
		// get/validate input
		do {
			inp = JOptionPane.showInputDialog(null, "Enter Number of credits");
			if(validator(inp)) {
				flag = true;
				val = Integer.parseInt(inp);
			} else {
				JOptionPane.showMessageDialog(null, "Invalid input! Input must be a NUMBER greater than 0.");
			}
		} while(!flag);
		System.out.println("Credits: " + val);
		if(val < 31) {
			year = CollegeYear.FRESHMAN;
		} else if(val <= 60) {
			year = CollegeYear.SOPHMORE;
		} else if(val <= 90) {
			year = CollegeYear.JUNIOR;
		} else {
			year = CollegeYear.SENIOR;
		}
		System.out.println("Year is: " + year);

		System.exit(0);
	}
	public static boolean validator(String s) {
		try {
			int n = Integer.parseInt(s);
			if(n > 0) {
				return true;
			} else {
				return false;
			}
		} catch(Exception e) {
			return false;
		}
	}
}
