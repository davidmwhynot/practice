/*

	File Name:
	TotalFees.java

	Author:
	David Whynot

	Date Created:
	3/9/18

	Description:
	This application will demonstrate overloading methods.   Write an application that includes the following variables:  tuitionFee, bookFee, techFee, and parkingFee, all of which are double variables.  You may simply initialize these variables with values that you make up rather than gather keyboard input. You may choose either GUI or console-based.
	Create four overloaded computeTotal() methods:
		When computeTotal() receives tuitionFee only, display console-based output that says "Tuition only" along with the tuitionFee.

		When computeTotal() receives both tuitionFee and bookFee, display "Tuition and Books" along with the total of the two variables.

		When computeTotal() receives tuitionFee, bookFee, and techFee display "Tuition, Books and Technology" along with the total of all three variables.

		When computeTotal() receives all of the variables, display "The Whole Package" along with the total of all the variables


	Type:
	console

*/



public class TotalFees {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t TotalFees\n\t David Whynot\n\n\n");

		// MAIN
		// declar vars
		double tuitionFee = 999.99;
		double bookFee = 399.99;
		double techFee = 99.99;
		double parkingFee = 3999.99;
		// call methods
		computeTotal(tuitionFee);
		computeTotal(tuitionFee, bookFee);
		computeTotal(tuitionFee, bookFee, techFee);
		computeTotal(tuitionFee, bookFee, techFee, parkingFee);
	}
	public static void computeTotal(double tuition) {
		System.out.println("Tuition only: $" + (tuition));
	}
	public static void computeTotal(double tuition, double book) {
		System.out.println("Tuition and books: $" + (tuition + book));
	}
	public static void computeTotal(double tuition, double book, double tech) {
		System.out.println("Tuition, books, and technology: $" + (tuition + book + tech));
	}
	public static void computeTotal(double tuition, double book, double tech, double parking) {
		System.out.println("The whole package: $" + (tuition + book + tech + parking));
	}
}
