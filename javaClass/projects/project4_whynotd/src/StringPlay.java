/*

	File Name:
	StringPlay.java

	Author:
	David Whynot

	Date Created:
	3/23/18

	Type:
	console

*/

import java.util.*;

public class StringPlay {
	public static void main(String[] args) {
		// INTRO
		Date today = new Date();
		System.out.println("\n\n\nStringPlay\nBy David Whynot\n" + today + "\n\n\n");

		// MAIN
		// declare vars
		String play = "Java was created by Sun Microsystems";

		// statements
		int demoIndex = play.indexOf('M');
		boolean demoStarts = play.startsWith("Java");
		String demoReplace = play.replace('s','S');
		String demoSubstring = play.substring(9,19);
		System.out.println("demoIndex: " + demoIndex);
		System.out.println("demoStarts: " + demoStarts);
		System.out.println("demoReplace: " + demoReplace);
		System.out.println("demoSubstring: " + demoSubstring);
	}
}
