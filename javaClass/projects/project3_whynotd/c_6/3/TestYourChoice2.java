/*

	File Name:
	TestYourChoice2.java

	Author:
	David Whynot

	Date Created:
	3/9/18

	Description:
	Copy DemoYourChoice.java from Project 1 into DemoYourChoice2.java
		Add code to instantiate an object using the constructor that receives parameters
		Add code to display data from the newly added object by employing the get methods
		Demonstrate use of the static variable

	Type:
	console

*/

import java.util.Scanner;

public class TestYourChoice2 {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t DemoYourChoice\n\t David Whynot\n\n\n");

		// MAIN
		// declare vars
		int r1, g1, b1, s1;
		// create default object
		YourChoice2 def = new YourChoice2();

		// objects that will be updated
		YourChoice2 set2 = new YourChoice2();

		// create scanner
		Scanner s = new Scanner(System.in);

		// prompt for and get user input
		System.out.println("You are going to pick R, G, B for 2 different objects. Both objects will also recieve random x and y positions. I have created a default color for reference:");
		System.out.println("\n\tDefault:");
		System.out.println("\tR: " + def.getRed());
		System.out.println("\tG: " + def.getGreen());
		System.out.println("\tB: " + def.getBlue());
		System.out.println("\tX: " + def.getX() + " Y: " + def.getY());

		System.out.println("Now you try!\nObject 1 (here, you will provide your own value to generate X and Y values):");
		System.out.print("R: ");
		r1 = s.nextInt();
		System.out.print("G: ");
		b1 = s.nextInt();
		System.out.print("B: ");
		g1 = s.nextInt();
		System.out.print("seed: ");
		s1 = s.nextInt();
		YourChoice2 set1 = new YourChoice2(r1, b1, g1, s1);

		System.out.println("\nObject 2 (this will use our static variable SEED to generate X and Y values):");
		System.out.print("R: ");
		set2.setRed(s.nextInt());
		System.out.print("G: ");
		set2.setGreen(s.nextInt());
		System.out.print("B: ");
		set2.setBlue(s.nextInt());


		System.out.println("\n\n\tObject 1:");
		System.out.println("R: " + set1.getRed());
		System.out.println("G: " + set1.getGreen());
		System.out.println("B: " + set1.getBlue());
		System.out.println("X: " + set1.getX() + " Y: " + set1.getY());

		System.out.println("\n\n\tObject 2:");
		System.out.println(set2.toString());

	}
}
