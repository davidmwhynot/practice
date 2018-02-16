/*

	File Name:
	Grades.java

	Author:
	David Whynot

	Date Created:
	2/15/18

	Description:
	Operation
		The user enters a numerical grade from 0 to 100 in console-based mode.
		The application displays the corresponding letter grade.
		The application prompts the user to continue.
	Specifications
		The grading criteria is as follows:
			A    90-100
			B    80-89
			C    70-79
			D    60-69
			E    <60
		The application should continue only if the user enters "y" or "Y" to continue.
		When the user chooses not to continue, display the number of passing grades and failing grades.  A passing grade is anything over 59.
		Validate the data and do not allow entries lower than 0 or higher than 100.

	Type:
	console

*/

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t Grades\n\t David Whynot\n\n\n");

		// MAIN
		// declare vars
		double input;
		char res;
		char grade;
		boolean flag;
		boolean keepGoing;
		int count = 0;
		int failCount = 0;

		// create Scanner
		Scanner s = new Scanner(System.in);

		// greet the user
		System.out.println("Welcome to the Letter Grade Converter\nBy David Whynot");

		// begin main loop
		do {
			// begin validation loop
			flag = false;
			do {
				if(flag)
					System.out.println("Invalid input! Please enter a number between 0 and 100.");
				System.out.print("\nEnter numerical grade: "); // prompt user for input data
				input = s.nextDouble(); // store data
				flag = true;
			} while((input < 0) || (input > 100));
			// we have received valid data from the user
			// increment grade count
			++count;
			// compute letter grade
			if(input >= 90) {
				grade = 'A';
			} else if(input >= 80) {
				grade = 'B';
			} else if(input >= 70) {
				grade = 'C';
			} else if(input >= 60) {
				grade = 'D';
			} else {
				grade = 'E';
				// failing grade so increment failCount
				++failCount;
			}
			// display data
			System.out.println("Letter grade: " + grade);
			// prompt to continue
			System.out.print("\nContinue? (y/n): ");
			res = Character.toUpperCase(s.next().charAt(0)); // get the next character
			if(res == 'Y') {
				keepGoing = true;
			} else {
				keepGoing = false;
			}
		} while(keepGoing);
		// done with input
		// display totals
		System.out.println("\nThe number of passing grades: " + (count - failCount) + "\nThe number of failing grades: " + failCount);
	}
}
