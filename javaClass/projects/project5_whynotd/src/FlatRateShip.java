/*

	File Name:
	FlatRateShip.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Type:
	gui

*/

import javax.swing.JOptionPane;

public class FlatRateShip implements ShipCost {

	private int size; // 1 - small; 2 - medium; 3 - large
	private static final double[] RATES = {8.5, 12, 20}; // per pound; index corresponds to size of package (less 1)

	public FlatRateShip() {
		String message = "Please select a package size (1, 2, or 3):\n1 - Small - $" + RATES[0] + " per pound\n2 - Medium - $" + RATES[1] + " per pound\n3 - Large - $" + RATES[2] + " per pound";
		size = ShipCalculator.validateChoice(JOptionPane.showInputDialog(null, message), message);
	}

	public double calculateShipCost(int pounds) {
		return pounds * RATES[size - 1];
	}

}
