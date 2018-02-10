/*

	File Name:
	Cookies.java

	Author:
	David Whynot

	Date Created:
	2/9/18

	Description:
	#5 on page 124
		a. Use the Scanner class to input the data
			i. Modification:  After asking the user for the number of cookies eaten, ask for the type of cookie eaten, which is to be a String.  Display this along with the number of calories consumed on one line of output.
		b. Use System.out.println to display results

	Type:
	console

*/

import java.util.Scanner;

public class Cookies {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t Cookies\n\t David Whynot\n\n\n");

		// MAIN
		// declare vars
		boolean flag = false;

		int bag = 40;
		int servings = 10;
		int servingCals = 300;
		double servingSize = bag / servings;
		double cals = servingCals / servingSize;

		int num = 0;
		String type = "";

		// prompt for and get data from user
		do {
			// create Scanner
			Scanner s = new Scanner(System.in);

			if(flag) {
				System.out.println("\nNumber must be greater than 0 and you must provide a type of cookie. Please try again.");
			}
			System.out.println("Please enter the type and number of cookies consumed.");

			System.out.print("Type: ");
			type = s.nextLine();

			System.out.print("Number: ");
			num = s.nextInt();

			flag = true;
			s.reset();
		} while((num <= 0) || (type.equals("")));

		// display
		System.out.println("\nYou ate " + num * cals + " calories of " + type + " cookies.");
	}
}
