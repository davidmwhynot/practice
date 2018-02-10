/*

	File Name:
	DemoEmployee.java

	Author:
	David Whynot

	Date Created:
	2/9/18

	Description:
	#1 on pages 187-188
		DemoEmployee will not ask the user to key in any data, rather it will use the literal data shown at the bottom of page 187. Instantiate three objects. Use the set (mutator) methods to populate the objects with the literal data. Use the get (accessor) methods to retrieve the data from each object and then display each employee.

	Type:
	console

*/

import java.util.*;

public class DemoEmployee {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t DemoEmployee\n\t David Whynot");

		// MAIN
		// declare objects and set values
		Employee e1 = new Employee();
		e1.setName("Susan Meyers");
		e1.setIdNumber(47899);
		e1.setDepartment("Accounting");
		e1.setPosition("Vice President");

		Employee e2 = new Employee();
		e2.setName("Mark Jones");
		e2.setIdNumber(39119);
		e2.setDepartment("IT");
		e2.setPosition("Programmer");

		Employee e3 = new Employee();
		e3.setName("Joy Rogers");
		e3.setIdNumber(81774);
		e3.setDepartment("Manufacturing");
		e3.setPosition("Engineer");

		// store employees in ArrayList
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(e1);
		eList.add(e2);
		eList.add(e3);

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
