/*

	File Name:
	StandardShip.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Type:
	gui

*/

public class StandardShip implements ShipCost {

	public double calculateShipCost(int pounds) {
		if(pounds <= 5) {
			return 3;
		} else {
			return 3 + (pounds - 5) * 1.5;
		}
	}

}
