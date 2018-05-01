/*

	File Name:
	Player.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Description:
	Abstract class
	Private data: player's name
	Abstract method called "play"
	Gets and sets for player's name

	Type:
	console

*/

abstract public class Player {
	private String name;

	public Player() {
		name = "Default Name";
	}
	public Player(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}

	abstract public void play();

}
