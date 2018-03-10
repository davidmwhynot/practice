/*

	File Name:
	DemoEmployee.java

	Author:
	David Whynot

	Date Created:
	3/9/18

	Description:
	#6 on pg 440

	Type:
	console

*/

import java.util.*;

public class DemoEmployee {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t DemoEmployee\n\t David Whynot");

		// MAIN
		// declare ArrayList and store employee objects in it
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee());
		eList.add(new Employee());
		eList.add(new Employee());

		eList.get(0).setName("Susan Meyers");
		eList.get(0).setIdNumber(47899);
		eList.get(0).setDepartment("Accounting");
		eList.get(0).setPosition("Vice President");

		eList.get(1).setName("Mark Jones");
		eList.get(1).setIdNumber(39119);
		eList.get(1).setDepartment("IT");
		eList.get(1).setPosition("Programmer");

		eList.get(2).setName("Joy Rogers");
		eList.get(2).setIdNumber(81774);
		eList.get(2).setDepartment("Manufacturing");
		eList.get(2).setPosition("Engineer");

		eList.add(new Employee("Some Body", 1337, "IT", "Sysadmin"));

		eList.add(new Employee("Hugh Mungus", 42069));

		eList.add(new Employee());

		// iterate through eList and display data
		int count = 0;
		for(Employee e : eList) {
			System.out.println("\n\n\n\t\tEmployee" + ++count + "\n" +
			"\n\t      Name: " + e.getName() +
			"\n\t ID Number: " + e.getIdNumber() +
			"\n\tDepartment: " + e.getDepartment() +
			"\n\t  Position: " + e.getPosition());
		}
	}
}
