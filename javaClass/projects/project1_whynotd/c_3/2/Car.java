/*

	File Name:
	Car.java

	Author:
	David Whynot

	Date Created:
	2/9/18

	Description:
	#2 on page 188
		In the DemoCar application, use either the Scanner class (for console-based)or the JOptionPane class (for GUI) to ask the user for the yearModel and make of the car, and use those variables in the Constructor.

	Type:
	console

*/



public class Car {
	// fields
	private int yearModel;
	private String make;
	private int speed;

	// constructor
	public Car(int y, String m) {
		yearModel = y;
		make = m;
		speed = 0;
	}

	// accessors and mutators
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int i) {
		yearModel = i;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String s) {
		make = s;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int i) {
		speed = i;
	}

	// methods
	public void accelerate() {
		speed += 5;
	}
	public void brake() {
		speed -= 5;
	}
}
