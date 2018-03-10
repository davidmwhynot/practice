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
	gui

*/

import javax.swing.*;

public class Rainfall {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t Rainfall\n\t David Whynot\n\n\n");

		// MAIN
		// create/set flag
		boolean flag;
		int counter = 0;
		int max = 0;
		int min = 0;
		double total = 0;
		double average = 0;
		double maxVal = 0;
		double minVal = 0;
		double[] figures = new double[12];
		String inp;
		String[] months = {"January",
			"February",
			"March",
			"April",
			"May",
			"June",
			"July",
			"August",
			"September",
			"October",
			"November",
			"December"
		};
		// prompt user for input and pass that to our validate function
		do {
			flag = false;
			inp = JOptionPane.showInputDialog(null, "Please input rainfall for month of " + months[counter]); // get input
			if(validator(inp)) { // validate input
				flag = true;
				figures[counter] = Double.parseDouble(inp); // valid value, store in array
				++counter;
			}
			else {
				JOptionPane.showMessageDialog(null, "Please input a POSITIVE NUMBER!"); // the input was invalid
			}
		} while(!flag || (counter < 12));
		// computer total rain
		for(double i : figures) {
			total += i;
		}
		// compute average rain
		average = total / 12;
		// find max
		for(int i = 0; i < figures.length; ++i) {
			if(figures[i] > maxVal) {
				max = i;
				maxVal = figures[i];
			}
		}
		// find min
		minVal = figures[0];
		for(int i = 0; i < figures.length; ++i) {
			if(figures[i] < minVal) {
				min = i;
				minVal = figures[i];
			}
		}

		// display values
		System.out.println("Total for year: " + total);
		System.out.println("Average monthly: " + average);
		System.out.println("Max: " + months[max] + " with " + maxVal + " units of rainfall.");
		System.out.println("Min: " + months[min] + " with " + minVal + " units of rainfall.");
		System.exit(0);
	}
	public static boolean validator(String s) {
		try {
			double n = Double.parseDouble(s);
			if(n > 0)
				return true;
			else
				return false;
		} catch(Exception e) {
			return false;
		}
	}
}
