
/*

	File Name:
	MCClogin.java

	Author:
	David Whynot

	Date Created:
	3/23/18

	Type:
	gui

*/


// GUI BASED

import javax.swing.JOptionPane;
import java.util.*;

public class MCClogin {
	public static void main(String[] args) {
		// INTRO
		Date today = new Date();
		JOptionPane.showMessageDialog(null, "MCClogin\nBy David Whynot\n" + today, "MCClogin | David Whynot", JOptionPane.PLAIN_MESSAGE);

		// MAIN
		// get data
		String fName = JOptionPane.showInputDialog(null, "First Name:").toLowerCase();
		String lName = JOptionPane.showInputDialog(null, "Last Name:").toLowerCase();
		String id = JOptionPane.showInputDialog(null, "Student ID Number:");

		// manipulate strings
		// create uName
		StringBuilder userName = new StringBuilder((fName.length() + lName.length() + 1)); // create a stringbuilder of the appropriate size
		userName.append(fName); // add the first name
		userName.append(lName); // add the last name
		userName.insert(fName.length(), '.'); // add a period after the first name

		// create pwd
		StringBuilder password = new StringBuilder((id.length() + 3)); // create a stringbuilder of the appropriate size
		password.append(fName.charAt(0)); // add the first initial
		password.append(lName.charAt(0)); // add the last initial
		password.append(id);
		password.append('!');

		// create message
		StringBuilder message = new StringBuilder("Your user name is  and your password is "); // create a stringbuilder with the template message
		message.insert(18, userName); // insert the username at the appropriate position inside the template message (it will always be the same spot)
		message.append(password); // append the password to the end of the message

		// show message
		JOptionPane.showMessageDialog(null, message);

		System.exit(0);
	}
}
