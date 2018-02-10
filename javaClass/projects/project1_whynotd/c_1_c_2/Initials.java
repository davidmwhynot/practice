/*

	File Name:
	Initials.java

	Author:
	David Whynot

	Date Created:
	2/9/18

	Description:
	#2 on page 123

	Type:
	console

*/



public class Initials {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t Initials\n\t David Whynot\n\n\n");

		// MAIN
		// declare vars
		String firstName = "David";
		String middleName = "Michael";
		String lastName = "Whynot";

		// get the first character of each name
		char firstInitial = firstName.charAt(0);
		char middleInitial = middleName.charAt(0);
		char lastInitial = lastName.charAt(0);

		// display
		System.out.println("Name: " + firstName + " " + middleName + " " + lastName);
		System.out.println("Initials: " + firstInitial + middleInitial + lastInitial);
	}
}
