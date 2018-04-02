/*

	File Name:
	WordCount.java

	Author:
	David Whynot

	Date Created:
	3/23/18

	Description:
	Page 595 #2

	Type:
	gui

*/


// GUI BASED

import javax.swing.JOptionPane;
import java.util.*;

public class WordCount {
	public static void main(String[] args) {
		// INTRO
		Date today = new Date();
		JOptionPane.showMessageDialog(null, "WordCount\nBy David Whynot\n" + today, "WordCount | David Whynot", JOptionPane.PLAIN_MESSAGE);

		// MAIN
		// code golf
		JOptionPane.showMessageDialog(null, "Number of words: " + counter(JOptionPane.showInputDialog(null,"Please input a string and we will count the number of words in it for you:"))); // get user input, pass it to method, and display what the method returns

		System.exit(0);
	}
	public static int counter(String s) {
		StringTokenizer st = new StringTokenizer(s); // create tokenizer object from the String we have received
		int count; // create counter
		for(count = 0; st.hasMoreTokens(); ++count)
			st.nextToken();
		return count;
	}
}
