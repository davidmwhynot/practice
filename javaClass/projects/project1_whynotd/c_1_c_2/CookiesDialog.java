/*

	File Name:
	CookiesDialog.java

	Author:
	David Whynot

	Date Created:
	2/9/18

	Description:
	modify Cookies.java into CookiesDialog.java which is a GUI application
		a. Use an input dialog box to gather the inputs (number of cookies eaten and type of cookie eaten)
		b. Use a message dialog box to display the results


	Type:
	GUI

*/

import javax.swing.*;

public class CookiesDialog {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t CookiesDialog\n\t David Whynot\n\n\n");

		// MAIN
		// declare vars
		boolean flag = false;

		int bag = 40;
		int servings = 10;
		int servingCals = 300;
		double servingSize = bag / servings;
		double cals = servingCals / servingSize;

		int num = 0;
		String getNum = "";
		String type = "";

		// prompt for and get data from user
		do {
			if(flag) {
				JOptionPane.showMessageDialog(null, "Number must be greater than 0 and you must provide a type of cookie. Please try again.");
			}

			type = JOptionPane.showInputDialog(null, "Please enter the type of cookie you ate");

			getNum = JOptionPane.showInputDialog(null, "Please enter the number of cookies you ate");
			if (!(getNum.equals(""))) {
				num = Integer.parseInt(getNum);
			} else {
				num = 0;
			}

			flag = true;
		} while((num <= 0) || (type.equals("")));

		// display
		JOptionPane.showMessageDialog(null, "You ate " + num * cals + " calories of " + type + " cookies.");
		System.exit(0);
	}
}
