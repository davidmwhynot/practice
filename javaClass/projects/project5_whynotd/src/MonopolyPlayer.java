/*

	File Name:
	MonopolyPlayer.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Description:
	Inherits from Player
	Overrides play method, displaying "Monopoly, where the object of the game is to become the wealthiest player" to screen

	Type:
	console

*/

public class MonopolyPlayer extends Player {

	public MonopolyPlayer(String s) {
		super(s);
	}

	public void play() {
		System.out.println("Monopoly, where the object of the game is to become the wealthiest player");
	}

}
