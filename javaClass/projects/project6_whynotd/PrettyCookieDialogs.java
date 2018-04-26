/*

	File Name:
	PrettyCookieDialogs.java

	Author:
	David Whynot

	Date Created:
	4/20/18

	Description:
	This is NOT a JavaFX program. Rewrite CookiesDialog from Project #1, using overloaded methods to:
		Make the input dialog box and message dialog boxes have appropriate titles.
		Use the question mark symbol on the input dialog boxes
		Display the warning message symbol on the message dialog box that tells the user how many calories they consumed.
		See your Requirements for Date-Time and Personalization handout for information on how to overload the methods.

	Type:
	gui

*/


// GUI BASED

import javax.swing.JOptionPane;
import java.util.*;

public class PrettyCookieDialogs {
	public static void main(String[] args) {
		// INTRO
		Date today = new Date();
		JOptionPane.showMessageDialog(null, "PrettyCookieDialogs\nBy David Whynot\n" + today, "PrettyCookieDialogs | David Whynot", JOptionPane.PLAIN_MESSAGE);

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
				JOptionPane.showMessageDialog(null, "Number must be greater than 0 and you must provide a type of cookie. Please try again.", "Cookie Conundrum!", JOptionPane.ERROR_MESSAGE);
			}

			type = JOptionPane.showInputDialog(null, "Please enter the type of cookie you ate", "Cookie Classification", JOptionPane.QUESTION_MESSAGE);

			getNum = JOptionPane.showInputDialog(null, "Please enter the number of cookies you ate", "Cookie Count", JOptionPane.QUESTION_MESSAGE);
			if (!(getNum.equals(""))) {
				num = Integer.parseInt(getNum);
			} else {
				num = 0;
			}

			flag = true;
		} while((num <= 0) || (type.equals("")));

		// display
		JOptionPane.showMessageDialog(null, "You ate " + num * cals + " calories of " + type + " cookies.", "Cookie Calories", JOptionPane.WARNING_MESSAGE);

		System.exit(0);
	}
}
