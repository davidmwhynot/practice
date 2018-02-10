/*

	File Name:
	Payroll.java

	Author:
	David Whynot

	Date Created:
	2/9/18

	Description:
	Optional extra credit: Page 189

	Type:
	console

*/



public class Payroll {
	private String name;
	private int id;
	private double rate;
	private int hours;
	public Payroll(String n, int i) {
		name = n;
		id = i;
	}

	// getters
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getRate() {
		return rate;
	}
	public int getHours() {
		return hours;
	}

	// setters
	public void setName(String s) {
		name = s;
	}
	public void setId(int i) {
		id = i;
	}
	public void setRate(double d) {
		rate = d;
	}
	public void setHours(int i) {
		hours = i;
	}

	// methods
	public double gross() {
		return hours * rate;
	}
}
