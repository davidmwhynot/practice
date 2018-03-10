/*

	File Name:
	Languages.java

	Author:
	David Whynot

	Date Created:
	2/15/18

	Description:


	Type:


*/

// add appropriate commenting here
import java.util.ArrayList; // Needed for ArrayList class

/**
 *  This program demonstrates an ArrayList.
 */

// Compile and run this program in its current state to study its behavior
// then, make the modifications explained below in the "Add Code" comments


public class Languages {
	public static void main(String[] args) {
		// INTRO
		System.out.println("\n\t Languages\n\t David Whynot\n\n\n");

		// MAIN
		// Create an ArrayList to hold some names.
		ArrayList<String> nameList = new ArrayList<String>();

		// Leave this section as is....
		nameList.add("C");
		nameList.add("Nonsense");
		nameList.add("C++");
		nameList.add("Ridiculous");

		// Add code to this program that uses the appropriate methods to:
		// 1.  Replace "Ridiculous" with "RPG"
		// 2.  Remove "Nonsense" from the list
		// 3.  Add "Java" to the end of the list
		// 4.  Insert "C#" into the list, right after "C++"
		nameList.set(3, "RPG");
		nameList.remove(1);
		nameList.add("Java");
		nameList.add(2, "C#");

		// Display the size of the ArrayList.
		System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");

		// Now display the items in nameList.
		for (int index = 0; index < nameList.size(); index++)
			System.out.println(nameList.get(index));
	}
}
