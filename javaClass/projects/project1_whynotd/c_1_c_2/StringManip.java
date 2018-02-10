/*

	File Name:
	StringManip.java

	Author:
	David Whynot

	Date Created:
	2/9/18

	Description:
	#12 on page 125
		Write as a GUI.

	Type:
	GUI

*/

import javax.swing.*;

public class StringManip {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t StringManip\n\t David Whynot\n\n\n");

		// MAIN
		// declare vars
		String input, bigName, smallName;
		int chars;
		char first;

		// prompt the user for and get data
		input = JOptionPane.showInputDialog(null, "Please enter the name of your favorite city");

		// compute values
		chars = input.length();
		bigName = input.toUpperCase();
		smallName = input.toLowerCase();
		first = input.charAt(0);

		// display
		JOptionPane.showMessageDialog(null, "Number of characters:\n" + chars +
		"\n\nAll uppercase:\n" + bigName +
		"\n\nAll lowercase:\n" + smallName +
		"\n\nFirst letter:\n" + first);

		System.exit(0);
	}
}
