/*

	File Name:
	ValidateInput1.java

	Author:
	David Whynot

	Date Created:
	2/15/18

	Description:
	Create a program that validates a user’s input of a number.
		Utilize a WHILE loop to enforce data validation.
		Ask the user for a number in a dialog box (GUI)
		Only numbers that are 50 through 101 should be accepted, force the user to keep trying until they get it right
		Congratulate the user on making a good entry when they have done so

	Type:
	GUI

*/

import javax.swing.*;

public class ValidateInput1 {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t ValidateInput1\n\t David Whynot\n\n\n");

		// MAIN
		// prompt user for input and pass that to our validate function
		while(!(validator(JOptionPane.showInputDialog(null, "Please input a number between 50 and 101."))))
			JOptionPane.showMessageDialog(null, "Invalid input! Input must be a NUMBER between 50 and 101. Please try again."); // the input was invalid
		JOptionPane.showMessageDialog(null, "Congratulations on inputting a valid number!"); // we have exited the while loop and therefore we have given a valid number
		System.exit(0);
	}
	public static boolean validator(String s) {
		try { // try to validate the input
			double n = Double.parseDouble(s); // try to convert the input to a double
			if((n >= 50) && (n <= 101)) // if input is succesfully converted, we know it is a number. Here, we check to make sure it is in the necessary range
				return true; // success! the number was in the proper range
			else
				return false; // even though the user did input a number, it was not in the proper range. return false
		} catch(Exception e) { // conversion to a double failed...
			return false; // we can conclude that the input was NOT a number and return false
		}
	}
}
