/*

	File Name:
	ValidateInput2.java

	Author:
	David Whynot

	Date Created:
	2/15/18

	Description:
	Modify your ValidateInput1.java to utilize a DO WHILE loop to exhibit the same behavior.

	Type:
	GUI

*/

import javax.swing.*;

public class ValidateInput2 {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t ValidateInput2\n\t David Whynot\n\n\n");

		// MAIN
		// create/set flag
		boolean flag = false;
		// prompt user for input and pass that to our validate function
		do {
			if(validator(JOptionPane.showInputDialog(null, "Please input a number between 50 and 101.")))
				flag = true;
			else
				JOptionPane.showMessageDialog(null, "Invalid input! Input must be a NUMBER between 50 and 101. Please try again."); // the input was invalid
		} while(!flag);
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
