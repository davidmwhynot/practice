/*

	File Name:
	DemoEssay.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Description:
	Page 683 #4

	Type:
	console

*/

// CONSOLE BASED

import java.util.*;

public class DemoEssay {

	public static void main(String[] args) {
		// INTRO
		Date today = new Date();
		System.out.println("\n\n\nDemoEssay\nBy David Whynot\n" + today + "\n\n\n");

		// MAIN
		// declare vars
		String loop = "";
		int count = 0;

		ArrayList<Essay> essays = new ArrayList<Essay>();

		System.out.println("Welcome to DemoEssay.\nYou can input scores for as many essays as you would like. After inputing all scores, you will be prompted to add another Essay.\nWhen you are finished, simply respond \"n\" to the prompt to see the scores and grades for each essay.\nScores in each category should be given as a percentage of the same value. To clarify, this means that even though Grammar is worth 30 points and Spelling is worth 20, you should give the score for each cateogry out of 100 and the program will weight the results automatically."); // instructions

		// get user input
		do {
			Scanner s = new Scanner(System.in);
			Essay essay = new Essay();
			System.out.println("\n\nPlease input category scores for Essay" + ++count + ":");

			System.out.println("Grammar: ");
			essay.setGrammar(s.nextDouble());
			System.out.println("Spelling: ");
			essay.setSpelling(s.nextDouble());
			System.out.println("Length: ");
			essay.setLength(s.nextDouble());
			System.out.println("Content: ");
			essay.setContent(s.nextDouble());

			essays.add(essay);

			System.out.println("\nAdd another Essay? (y/n): ");
			loop = s.next();
		} while(loop.equals("y"));

		// display scores
		count = 0;
		System.out.println("\n\n\nScores:");
		for(Essay i : essays) {
			System.out.println("\n\n\tEssay" + ++count);
			System.out.println("\t\tScore: " + i.getScore());
			System.out.println("\t\tGrade: " + i.getGrade());
		}
	}

}
