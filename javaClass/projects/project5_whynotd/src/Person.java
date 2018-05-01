/*

	File Name:
	Person.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Description:
	Page 684 #7

	Type:
	console

*/

public class Person {
	private String name;
	private String address;
	private String phone;
	public Person() {
		name = "Default Name";
		address = "Default Address";
		phone = "(000)000-0000";
	}
	public Person(String n, String a, String p) {
		name = n;
		address = a;
		phone = p;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public void setName(String s) {
		name = s;
	}
	public void setAddress(String s) {
		address = s;
	}
	public void setPhone(String s) {
		phone = s;
	}
}
