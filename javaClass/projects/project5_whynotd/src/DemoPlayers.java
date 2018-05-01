/*

	File Name:
	DemoPlayers.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Description:
	Instantiate all three types of players
	Set the player's name (prompt user for keyboard input)
	Utilizes methods appropriately to display a message for each player, such as "Hi, my name is XXXXX and my game is XXXXXXXX!" (where XXXX represent name and appropriate output for type of player)

	Type:
	console

*/

// CONSOLE BASED

import java.util.*;

public class DemoPlayers {
	public static void main(String[] args) {
		// INTRO
		Date today = new Date();
		System.out.println("\n\n\nDemoPlayers\nBy David Whynot\n" + today + "\n\n\n");

		// MAIN
		// create objects
		Scanner s = new Scanner(System.in);
		ArrayList<Player> players = new ArrayList<Player>();

		// get names from user
		System.out.println("Please provide names for the following players:");
		System.out.println("Baseball Player: ");
		players.add(new BaseballPlayer(s.nextLine()));
		System.out.println("Soccer Player: ");
		players.add(new SoccerPlayer(s.nextLine()));
		System.out.println("Monopoly Player: ");
		players.add(new MonopolyPlayer(s.nextLine()));

		// display data
		for(Player i : players) {
			System.out.println("\nHi, my name is " + i.getName() + " and my game is...");
			i.play();
		}
	}
}
