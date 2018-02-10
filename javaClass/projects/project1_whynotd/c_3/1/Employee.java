/*

	File Name:
	Employee.java

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



public class Employee {
	// declare vars
	private String name;
	private int idNumber;
	private String department;
	private String position;

	// getter and setter methods
	public String getName() {
		return name;
	}
	public void setName(String s) {
		name = s;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int i) {
		idNumber = i;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String s) {
		department = s;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String s) {
		position = s;
	}
}
