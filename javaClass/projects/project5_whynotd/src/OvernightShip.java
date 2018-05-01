/*

	File Name:
	OvernightShip.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Type:
	gui

*/

public class OvernightShip implements ShipCost {
	public double calculateShipCost(int pounds) {
		if(pounds <= 7) {
			return 15;
		} else {
			return 15 + (pounds - 7) * 3;
		}
	}
}
