/*

	File Name:
	ReadMyBinary.java

	Author:
	David Whynot

	Date Created:
	4/30/18

	Description:


	Type:


*/

// CONSOLE BASED

import java.io.*;
import java.util.*;

public class ReadMyBinary {
	public static void main(String[] args) throws IOException {
		// INTRO
		Date today = new Date();
		System.out.println("\n\n\nReadMyBinary\nBy David Whynot\n" + today + "\n\n\n");

		// MAIN
		// create objects
		InputStream stdin = new FileInputStream(new File("test.data"));
		Scanner s = new Scanner(stdin);
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		s.close();
		System.exit(0);
	}
}
