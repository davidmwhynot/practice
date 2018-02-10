/*

	File Name:
	DemoPayroll.java

	Author:
	David Whynot

	Date Created:
	2/9/18

	Description:
	Optional extra credit: Page 189

	Type:
	console

*/

import java.util.Scanner;

public class DemoPayroll {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t DemoPayroll\n\t David Whynot\n\n\n");

		// MAIN
		// create scanner
		Scanner s = new Scanner(System.in);
		// get user input from scanner
		System.out.println("Input employee info:");
		System.out.print("Name: ");
		String name = s.next();
		System.out.print("ID: ");
		int id = s.nextInt();
		// create payroll object
		Payroll p = new Payroll(name, id);
		System.out.print("Hourly Pay: ");
		p.setRate(s.nextDouble());
		System.out.print("Hours Worked: ");
		p.setHours(s.nextInt());
		System.out.println("Gross pay earned: $" + String.format("%,.2f", p.gross()));
	}
}
