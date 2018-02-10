/*

	File Name:
	DemoCar.java

	Author:
	David Whynot

	Date Created:
	2/9/18

	Description:
	#2 on page 188
		In the DemoCar application, use either the Scanner class (for console-based)or the JOptionPane class (for GUI) to ask the user for the yearModel and make of the car, and use those variables in the Constructor.

	Type:
	console

*/

import java.util.Scanner;

public class DemoCar {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t DemoCar\n\t David Whynot\n\n\n");

		// MAIN
		// prompt user for input and create car object
		Scanner s = new Scanner(System.in);
		System.out.println("Create a new car!\nWhat is the year model?");
		System.out.print("Year model: ");
		int model = s.nextInt();
		System.out.println("\nGreat! What is the make?");
		System.out.print("Make: ");
		String make = s.next();

		Car c = new Car(model, make);

		// accelerate
		System.out.println("\n\nSpeeding up!");
		for(int i = 0; i < 5; ++i) {
			System.out.print("\naccelerating... ");
			c.accelerate();
			System.out.print("new speed: " + c.getSpeed());
		}

		// brake
		System.out.println("\n\n\nSlowing down!");
		for(int i = 0; i < 5; ++i) {
			System.out.print("\nbraking... ");
			c.brake();
			System.out.print("new speed: " + c.getSpeed());
		}
	}
}
