/*

	File Name:
	WriteMyFile.java

	Author:
	David Whynot

	Date Created:
	2/15/18

	Description:
	Write an application that creates a text file that consists of an inventory of items you would want with you if you were ever stranded on a desert island.  Then write the application that reads and displays that data.

	Type:
	console

*/

import java.util.Scanner;
import java.io.*;

public class WriteMyFile {
	public static void main(String[] args) throws IOException {
		// INTRO
		System.out.println("\n\t WriteMyFile\n\t David Whynot\n\n\n");

		// MAIN
		// declare vars
		String input = "";
		char res;
		boolean flag;
		boolean keepGoing;

		// create file stream
		PrintWriter file = new PrintWriter("inventory.txt");

		// greet the user
		System.out.println("Welcome to Inventory Builder");

		// begin main loop
		do {
			// begin validation loop
			flag = false;
			do {
				// create scanner
				Scanner s = new Scanner(System.in);

				if(flag)
					System.out.println("Invalid input!");
				System.out.print("\nAdd an item to your inventory: "); // prompt user for input data
				input = s.nextLine(); // store data
				flag = true;
				s.reset();
			} while(input.equals(""));
			// we have received valid data from the user
			// write data to file
			file.println(input);
			// prompt to continue
			// create new Scanner
			Scanner ss = new Scanner(System.in);
			System.out.print("\nAdd more items? (y/n): ");
			res = Character.toUpperCase(ss.next().charAt(0)); // get the next character
			if(res == 'Y') {
				keepGoing = true;
			} else {
				keepGoing = false;
			}
			ss.reset();
		} while(keepGoing);
		file.close();
	}
}
