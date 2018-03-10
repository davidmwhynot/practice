/*

	File Name:
	Employee.java

	Author:
	David Whynot

	Date Created:
	3/9/18

	Description:
	#6 on pg 440

	Type:
	console

*/



public class Employee {
	// declare vars
	private String name;
	private int idNumber;
	private String department;
	private String position;
	// default constructor
	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	// overloaded constructor
	public Employee(String nam, int id) {
		name = nam;
		idNumber = id;
		department = "";
		position = "";
	}
	// overloaded constructor
	public Employee(String nam, int id, String dep, String pos) {
		name = nam;
		idNumber = id;
		department = dep;
		position = pos;
	}
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
