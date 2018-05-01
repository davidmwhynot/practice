/*

	File Name:
	WriteMyBinary.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Description:
	1. Ask your user for some character input
	2. Ask your user for some numeric input
	3. Write the data to the binary file until the user wants to quit

	Type:
	console

*/

// CONSOLE BASED

import java.io.*;
import java.util.*;

public class WriteMyBinary {
	public static void main(String[] args) {
		// INTRO
		Date today = new Date();
		System.out.println("\n\n\nWriteMyBinary\nBy David Whynot\n" + today + "\n\n\n");

		// MAIN
		// create objects and declare vars
		String loop = "";
		ArrayList<Character> allChars = new ArrayList<Character>();
		ArrayList<Character> allNums = new ArrayList<Character>();

		// get user input
		do {
			Scanner s = new Scanner(System.in);
			// get new chars and nums before adding to the master list (which will be written to the file at the end)
			System.out.println("Input some characters (then press enter): ");
			char[] chars = s.nextLine().toCharArray();
			System.out.println("Input some numbers (then press enter): ");
			char[] nums = s.nextLine().toCharArray();
			// ask the user if they would like to continue
			System.out.println("Keep going? (y/n): ");
			loop = s.nextLine();
			// s.close(); // close the scanner (to avoid unwanted conflicts with the printed messages)
			// add the new chars and nums to the array of all chars
			for(Character i : chars) {
				allChars.add(i);
			}
			for(Character i : nums) {
				allNums.add(i);
			}
		} while(loop.equals("y"));

		// write to file (there is almost certainly a more elegant way to do this...)
		try (
			OutputStream stdout = new FileOutputStream(new File("test.data"));
		) {
			String charsHead = "Characters:\n";
			stdout.write(charsHead.getBytes());

			for(Character i : allChars) {
				stdout.write((byte)i.charValue());
			}

			String numsHead = "\nNumbers:\n";
			stdout.write(numsHead.getBytes());

			for(Character i : allNums) {
				stdout.write((byte)i.charValue());
			}

		} catch(IOException e) {
			// "handle" exceptions :)
			e.printStackTrace();
			System.exit(1);
		}
	}
}
