/*

	File Name:
	Rent.java

	Author:
	David Whynot

	Date Created:
	3/9/18

	Description:


	Type:
	gui

*/

import javax.swing.*;

public class Rent {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t Rent\n\t David Whynot\n\n\n");

		// MAIN
		// create/set flag
		String inp1;
		String inp2;
		boolean flag1 = false;
		boolean flag2 = false;
		int val1 = 0;
		int val2 = 0;
		int[][] prices = {
			{750, 850, 950, 1050},
			{900, 1000, 1100, 1200},
			{1075, 1175, 1275, 1375}
		};
		// prompt user for input and pass that to our validate function
		do {
			inp1 = JOptionPane.showInputDialog(null, "Please select a level: 0 - garden; 1 - basic; 2 - deluxe");
			if(validateLevel(inp1)) {
				flag1 = true;
				val1 = Integer.parseInt(inp1);
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid input! Input must be 0, 1, or 2. Please try again.");
			}
		} while(!flag1);
		do {
			inp2 = JOptionPane.showInputDialog(null, "Please select number of bedrooms: 0 - studio; 1 - bedroom; 2 - bedrooms; 3 - bedrooms");
			if(validateBedrooms(inp2)) {
				flag2 = true;
				val2 = Integer.parseInt(inp2);
			}
			else
				JOptionPane.showMessageDialog(null, "Invalid input! Input must be 0, 1, 2, or 3. Please try again.");
		} while(!flag2);

		JOptionPane.showMessageDialog(null, "Rent for a level " + val1 + " apartment with " + val2 + " bedrooms is: $" + prices[val1][val2]);
		System.exit(0);
	}
	public static boolean validateLevel(String s) {
		try {
			double n = Integer.parseInt(s);
			if((n >= 0) && (n <= 2))
				return true;
			else
				return false;
		} catch(Exception e) {
			return false;
		}
	}
	public static boolean validateBedrooms(String s) {
		try {
			double n = Integer.parseInt(s);
			if((n >= 0) && (n <= 3))
				return true;
			else
				return false;
		} catch(Exception e) {
			return false;
		}
	}
}
