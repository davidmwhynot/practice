/*

	File Name:
	DemoCustomer.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Description:
	Page 684 #7

	Type:
	console

*/

// CONSOLE BASED

import java.util.*;

public class DemoCustomer {

	public static void main(String[] args) {
		// INTRO
		Date today = new Date();
		System.out.println("\n\n\nDemoCustomer\nBy David Whynot\n" + today + "\n\n\n");

		// MAIN
		// create objects
		Customer cust = new Customer();
		Scanner s = new Scanner(System.in);

		// get user input
		System.out.println("Welcome to DemoCustomer. Please provide values for the following information about the customer: ");
		System.out.println("Name: ");
		cust.setName(s.nextLine());
		System.out.println("Address: ");
		cust.setAddress(s.nextLine());
		System.out.println("Phone Number [(000)000-0000]: ");
		cust.setPhone(s.nextLine());
		System.out.println("Customer ID Number: ");
		cust.setNum(s.nextInt());
		System.out.println("Add to mailing list? (y/n): ");
		if(s.next().equals("y")) {
			cust.setList(true);
		} else {
			cust.setList(false);
		}

		// display object fields
		System.out.println("\n\nCustomer Data");
		System.out.println("ID Number: " + cust.getNum());
		if(cust.getList()) {
			System.out.println("Subscribed to mailing list");
		}
		System.out.println("\t" + cust.getName() + " ; " + cust.getAddress() + " ; " + cust.getPhone());
	}
}
