/*

	File Name:
	DemoYourChoice.java

	Author:
	David Whynot

	Date Created:
	2/9/18

	Description:
		a. Create a class named YourChoice, which represents an object of your choice.  Data fields should include variables that are appropriate for your object.  Include set (mutator) and get (accessor) methods for each data field. Include a no-arg constructor that initializes an object to whatever values you decide upon.  Save this as YourChoice.java.

		b. Create an application called DemoYourChoice that demonstrates the use of the constructor, and also instantiates two more different objects, demonstrating the use of the set and get methods.  There should be three instantiated objects – one created using the constructor, and two more using the gets and sets.  Each object’s data should be displayed.

		c. Extra credit for prompting the user for the data rather than just using literals/constants.

	Type:
	console

*/

import java.util.Scanner;

public class DemoYourChoice {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t DemoYourChoice\n\t David Whynot\n\n\n");

		// MAIN
		// declare vars

		// create default object
		YourChoice def = new YourChoice();

		// objects that will be updated
		YourChoice set1 = new YourChoice();
		YourChoice set2 = new YourChoice();

		// create scanner
		Scanner s = new Scanner(System.in);

		// prompt for and get user input
		System.out.println("You are going to pick R, G, B for 2 different objects. Both objects will also recieve random x and y positions. I have created a default color for reference:");
		System.out.println("\n\tDefault:");
		System.out.println("\tR: " + def.getRed());
		System.out.println("\tG: " + def.getGreen());
		System.out.println("\tB: " + def.getBlue());
		System.out.println("\tX: " + def.getX() + " Y: " + def.getY());

		System.out.println("Now you try!\nObject 1:");
		System.out.print("R: ");
		set1.setRed(s.nextInt());
		System.out.print("G: ");
		set1.setGreen(s.nextInt());
		System.out.print("B: ");
		set1.setBlue(s.nextInt());

		System.out.println("\nObject 2:");
		System.out.print("R: ");
		set2.setRed(s.nextInt());
		System.out.print("G: ");
		set2.setGreen(s.nextInt());
		System.out.print("B: ");
		set2.setBlue(s.nextInt());

		System.out.println("\n\n\tObject 1:");
		System.out.println("\tR: " + set1.getRed());
		System.out.println("\tG: " + set1.getGreen());
		System.out.println("\tB: " + set1.getBlue());
		System.out.println("\tX: " + set1.getX() + " Y: " + set1.getY());

		System.out.println("\n\n\tObject 2:");
		System.out.println("\tR: " + set2.getRed());
		System.out.println("\tG: " + set2.getGreen());
		System.out.println("\tB: " + set2.getBlue());
		System.out.println("\tX: " + set2.getX() + " Y: " + set2.getY());

	}
}
