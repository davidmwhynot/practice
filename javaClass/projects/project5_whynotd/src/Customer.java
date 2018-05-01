/*

	File Name:
	Customer.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Description:
	Page 684 #7

	Type:
	console

*/

public class Customer extends Person {
	private int num;
	private boolean list;
	public Customer() {
		super();
		num = 0;
		list = false;
	}
	public Customer(int n, boolean l) {
		super();
		num = n;
		list = l;
	}
	public Customer(String name, String a, String p, int n, boolean l) {
		super(name, a, p);
		num = n;
		list = l;
	}
	public int getNum() {
		return num;
	}
	public boolean getList() {
		return list;
	}
	public void setNum(int n) {
		num = n;
	}
	public void setList(boolean l) {
		list = l;
	}
}
