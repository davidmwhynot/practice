/*

	File Name:
	SplitZip.java

	Author:
	David Whynot

	Date Created:
	3/23/18
	
	Type:
	gui

*/


// GUI BASED

import javax.swing.JOptionPane;
import java.util.*;

public class SplitZip {
	public static void main(String[] args) {
		// INTRO
		Date today = new Date();
		JOptionPane.showMessageDialog(null, "SplitZip\nBy David Whynot\n" + today, "SplitZip | David Whynot", JOptionPane.PLAIN_MESSAGE);

		// MAIN
		String[] results = JOptionPane.showInputDialog(null, "Please enter a 10 character zipcode with two parts and we will return the split version:").split("-"); // get input and generate results. store results in an array
		String output = "";
		for(String i : results) // extract results into an output string
			output += i + "\n";
		JOptionPane.showMessageDialog(null, output); // display output string
		System.exit(0);
	}
}
