/*

	File Name:
	DemoSoftwareSales.java

	Author:
	David Whynot

	Date Created:
	2/15/18

	Description:
	Page 267  -- #4
		(Helpful examples:  Payroll.java and Grosspay.java, SalesCommission.java and HalsCommission.java)
		a. SoftwareSales.java – read the specs on page 274
		b. DemoSoftwareSales.java
			i. You may choose console or GUI input to ask the user for the number of units sold
			ii. Pass this to a constructor that accepts it in your SoftwareSales.java class
			iii. Utilize the methods in your SoftwareSales.java class to get and display the total cost of the purchase.

	Type:
	console

*/

import java.util.Scanner;

public class DemoSoftwareSales {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t DemoSoftwareSales\n\t David Whynot\n\n\n");

		// MAIN
		// create scanner
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Acme Software Sales\nHow many software packages would you like to purchase?");
		System.out.print("Quantity: ");
		SoftwareSales sale = new SoftwareSales(s.nextInt());

		System.out.println("\nThank you for purchasing!\nYou will recieve " + sale.getQuantity() + " units.");
		System.out.println("Your overall discount is " + (sale.getDiscount() * 100) + "% off.");
		System.out.printf("Your total comes to: $%,.2f", sale.getTotal());
	}
}
