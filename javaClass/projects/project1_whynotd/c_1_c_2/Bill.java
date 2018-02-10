/*

	File Name:
	Bill.java

	Author:
	David Whynot

	Date Created:
	2/9/18

	Description:
	#13
		a. Use Named Constants to hold the tax rate and tip rate
		b. Display the meal charge, tax amount, tip amount,and total bill using appropriate formatting by using System.out.printf
			i.		For the purposes of proving this, input a meal charge of 1125.57
			ii.		Displayed amounts should include commas where appropriate
			iii.	Meal charge and total bill should be rounded to two decimal positions
			iv.		total bill should include a dollar sign
			v.		Total bill should be in a column that is 15 positions wide


	Type:
	console

*/

import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t Bill\n\t David Whynot\n\n\n");

		// MAIN
		// declare vars
		final double TAX_RATE = 0.075;
		final double TIP_RATE = 0.18;

		double charge, tax, tip, total;
		String totalString;

		// promt user for input and get the data from it
		System.out.print("Please enter the charge for the meal: ");
		// create scanner
		Scanner s = new Scanner(System.in);
		charge = s.nextDouble();

		// compute values
		tax = charge * TAX_RATE;
		tip = charge * TIP_RATE;

		total = charge + tax + tip;
		totalString = String.format("$%,.2f", total);

		// display
		System.out.printf("\nCharge: %,15.2f\n", charge);
		System.out.printf("   Tax: %,15.2f\n", tax);
		System.out.printf("   Tip: %,15.2f\n", tip);
		System.out.printf(" Total: %15s\n", totalString);
	}
}
