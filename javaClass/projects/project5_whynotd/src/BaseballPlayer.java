/*

	File Name:
	BaseballPlayer.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Description:
	Inherits from Player
	Overrides play method, displaying "Baseball, where the object of the game is to score the most home runs" to screen

	Type:
	console

*/

public class BaseballPlayer extends Player {

	public BaseballPlayer(String s) {
		super(s);
	}

	public void play() {
		System.out.println("Baseball, where the object of the game is to score the most home runs");
	}

}
