/*

	File Name:
	SoftwareSales.java

	Author:
	David Whynot

	Date Created:
	2/15/18

	Description:
	Page 267  -- #4
		(Helpful examples:  Payroll.java and Grosspay.java, SalesCommission.java and HalsCommission.java)
		a. SoftwareSales.java – read the specs on page 274
		b. DemoSoftwareSales.java
			i. You may choose console or GUI input to ask the user for the number of units sold
			ii. Pass this to a constructor that accepts it in your SoftwareSales.java class
			iii. Utilize the methods in your SoftwareSales.java class to get and display the total cost of the purchase.

	Type:
	console

*/



public class SoftwareSales {
	public static final int RETAIL = 99;
	private int quantity;
	private double discount;
	private double total;
	SoftwareSales() {
		quantity = 0;
		discount = 0;
		total = 0;
	}
	SoftwareSales(int q) {
		quantity = q;
		this.computeDiscount();
		this.computeTotal();
	}
	// getters
	public int getQuantity() {
		return quantity;
	}
	public double getDiscount() {
		return discount;
	}
	public double getTotal() {
		return total;
	}
	public void setQuantity(int q) {
		quantity = q;
		this.computeDiscount();
		this.computeTotal();
	}
	private void computeDiscount() {
		if(quantity < 10) {
			discount = 0;
		} else if(quantity < 20) {
			discount = .2;
		} else if(quantity < 50) {
			discount = .3;
		} else if(quantity < 100) {
			discount = .4;
		} else {
			discount = .5;
		}
	}
	private void computeTotal() {
		total = quantity * discount * RETAIL;
	}
}
