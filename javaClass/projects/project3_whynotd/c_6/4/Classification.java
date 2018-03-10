/*

	File Name:
	Classification.java

	Author:
	David Whynot

	Date Created:
	3/9/18

	Description:
	Write an application that will tell a student what year in college he/she is in
		Use an enumerated data type to set up a data type called collegeYear that contains the predefined values FRESHMAN, SOPHOMORE, JUNIOR, or SENIOR
		Ask the user for the number of credits he/she has completed.
		Determine and display collegeYear based on:
		0 – 30  credits is a freshman
		31 – 60 credits is a sophomore
		61 – 90 credits is a junior
		91+ credits is a senior

	Type:
	console

*/

import javax.swing.*;

public class Classification {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t Classification\n\t David Whynot\n\n\n");

		// MAIN
		// declare vars
		String inp;
		int val;
		Boolean flag = false;
		// enum declaration
		enum CollegeYear {
			FRESHMAN, SOPHMORE, JUNIOR, SENIOR
		}
		// get/validate input
		do {
			inp JOptionPane.showInputDialog(null, "Enter Number of credits")
			if(validator(inp)) {
				flag = true;
				val = Integer.parseInt(inp);
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid input! Input must be a NUMBER greater than 0.");
			}
		} while(!flag);
		switch()


		System.exit(0);
	}
	public static boolean validator(String s) {
		try {
			int n = Integer.parseInt(s);
			if(n < 0)
				return true;
			else
				return false;
			return false
		} catch(Exception e) {
			return false;
		}
	}
}
