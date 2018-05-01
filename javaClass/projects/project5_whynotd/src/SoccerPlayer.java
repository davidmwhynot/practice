/*

	File Name:
	SoccerPlayer.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Description:
	Inherits from Player
	Overrides play method, displaying "Soccer, where the object of the game is to score the most goals" to screen

	Type:
	console

*/

public class SoccerPlayer extends Player {

	public SoccerPlayer(String s) {
		super(s);
	}

	public void play() {
		System.out.println("Soccer, where the object of the game is to score the most goals");
	}

}
