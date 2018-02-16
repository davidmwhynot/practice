/*

	File Name:
	ReadMyFile.java

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

public class ReadMyFile {
	public static void main(String[] args) throws IOException {
		// INTRO
		System.out.println("\n\t ReadMyFile\n\t David Whynot\n\n\n");

		// MAIN
		// create file Object
		File file = new File("inventory.txt");
		// create Scanner
		Scanner s = new Scanner(file);
		// great user
		System.out.println("Your inventory:");
		// dump contents
		while(s.hasNext()) {
			System.out.println(s.nextLine());
		}
		s.close();
	}
}
