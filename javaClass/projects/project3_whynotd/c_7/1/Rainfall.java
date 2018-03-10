/*

	File Name:
	Rainfall.java

	Author:
	David Whynot

	Date Created:
	3/9/18

	Description:
		#1 on pages 535-536  You may choose Console or GUI for the input of the 12 figures.

	Type:
	console

*/



public class Rainfall {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t Rainfall\n\t David Whynot\n\n\n");

		// MAIN
		// create/set flag
		boolean flag = false;
		String inp;
		int val;
		// prompt user for input and pass that to our validate function
		// double figures = new double[12];
		double[12] figures;
		do {
			inp = JOptionPane.showInputDialog(null, "Please input a positive number.");
			if(validator(inp)) {
				flag = true;
				val = inp;
			}
			else {
				JOptionPane.showMessageDialog(null, "Please input a postive NUMBER!"); // the input was invalid
			}
		} while(!flag);
		JOptionPane.showMessageDialog(null, "Congratulations on inputting a valid number!"); // we have exited the while loop and therefore we have given a valid number
		System.exit(0);
	}
	public static boolean validator(String s) {
		try { // try to validate the input
			double n = Double.parseDouble(s); // try to convert the input to a double
			if(n > 0) // if input is succesfully converted, we know it is a number. Here, we check to make sure it is in the necessary range
				return true; // success! the number was in the proper range
			else
				return false; // even though the user did input a number, it was not in the proper range. return false
		} catch(Exception e) { // conversion to a double failed...
			return false; // we can conclude that the input was NOT a number and return false
		}
	}
}
