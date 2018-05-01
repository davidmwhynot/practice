/*

	File Name:
	ShipCalculator.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Type:
	gui

*/

// This is the driver program for the Shipping Application
// Uses FlatRateShip, StandardShip, and OverNightShip classes (all of which use the ShipCost interface)
// Compile and run as is to test
// Then, convert it to a program that uses GUI dialog boxes for input and output, and does not let user enter
// anything other than 1, 2, or 3
import java.util.*;
import javax.swing.JOptionPane;

public class ShipCalculator {
	public static void main(String[] args) {
		// INTRO
		Date today = new Date();
		System.out.println("\n\n\nShipCalculator\nBy David Whynot\n" + today + "\n\n\n");


		// MAIN
		// declare vars
		int choice;
		int pounds;
		String choiceMessage = "Enter 1 for FlatRate, 2 for Standard, 3 for OverNight";
		choice = validateChoice(JOptionPane.showInputDialog(null, choiceMessage), choiceMessage); // the recursive nature of validateChoice() allows us to know for sure that the return value will be valid
		pounds = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of pounds you are shipping as a whole number"));
		ShipCost order = null; //creating a reference variable to the interface
		// Create the appropriate object and assign it to the Shipcost reference--polymorphism
		if(choice == 1) {
			order = new FlatRateShip();
		} else if(choice == 2) {
			order = new StandardShip();
		} else if(choice == 3) {
			order = new OvernightShip();
		}
		JOptionPane.showMessageDialog(null, String.format("Shipping Cost is $%.2f", order.calculateShipCost(pounds)));
		System.exit(0);
	}
	public static int validateChoice(String s, String message) {
		try {
			int n = Integer.parseInt(s);
			if((n == 1) || (n == 2) || (n == 3)) { // recursive termination condition
				// valid input!
				return n;
			} else {
				// invalid input!
				return validateChoice(JOptionPane.showInputDialog(null, "Error: input must be 1, 2, or 3!\n" + message), message); // termination condition not met, call function again
			}
		} catch(NumberFormatException e) {
			// invalid input (NAN)!
			return validateChoice(JOptionPane.showInputDialog(null, "Error: input must be a number (1, 2, or 3)!\n" + message), message); // termination condition not met, call function again
		}
	}
}
