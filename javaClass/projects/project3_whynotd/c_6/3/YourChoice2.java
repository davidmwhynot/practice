/*

	File Name:
	YourChoice2.java

	Author:
	David Whynot

	Date Created:
	3/9/18

	Description:
	Copy YourChoice.java from Project 1 into YourChoice2.java
		Add a static variable to your class
		Add a constructor that receives parameters to your class
		Add a toString method to your class that displays the data in your object in a nice format

	Type:
	console

*/

import java.awt.Color;
import java.util.*;

public class YourChoice2 {
	// fields
	private static final int SEED = 12;
	private Random ran;
	private Color c;
	private int x, y, red, green, blue;

	// constructor
	public YourChoice2() {
		ran = new Random();
		x = ran.nextInt(SEED * 16);
		y = ran.nextInt(SEED * 9);
		red = 10;
		green = 50;
		blue = 200;
		this.updateColor();
	}
	public YourChoice2(int r, int g, int b) {
		ran = new Random();
		x = ran.nextInt(SEED * 16);
		y = ran.nextInt(SEED * 9);
		if(r > 255) {
			r = 255;
		} else if(r < 0) {
			r = 0;
		}
		if(g > 255) {
			g = 255;
		} else if(g < 0) {
			g = 0;
		}
		if(b > 255) {
			b = 255;
		} else if(b < 0) {
			b = 0;
		}
		red = r;
		green = g;
		blue = b;
		this.updateColor();
	}
	public YourChoice2(int r, int g, int b, int s) {
		ran = new Random();
		x = ran.nextInt(s * 16);
		y = ran.nextInt(s * 9);
		if(r > 255) {
			r = 255;
		} else if(r < 0) {
			r = 0;
		}
		if(g > 255) {
			g = 255;
		} else if(g < 0) {
			g = 0;
		}
		if(b > 255) {
			b = 255;
		} else if(b < 0) {
			b = 0;
		}
		red = r;
		green = g;
		blue = b;
		this.updateColor();
	}
	// getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getRed() {
		return red;
	}
	public int getGreen() {
		return green;
	}
	public int getBlue() {
		return blue;
	}

	// setters
	public void setRed(int i) {
		if(i > 255) {
			i = 255;
		} else if(i < 0) {
			i = 0;
		}
		red = i;
		this.updateColor();
	}
	public void setGreen(int i) {
		if(i > 255) {
			i = 255;
		} else if(i < 0) {
			i = 0;
		}
		green = i;
		this.updateColor();
	}
	public void setBlue(int i) {
		if(i > 255) {
			i = 255;
		} else if(i < 0) {
			i = 0;
		}
		blue = i;
		this.updateColor();
	}

	// methods
	public void updateColor() {
		c = new Color(red, green, blue);
	}
	public String toString() {
		return "SEED: " + SEED
		+ "\nRandom: " + ran.toString()
		+ "\nColor: " + c.toString()
		+ "\nRed: " + red
		+ "\nGreen: " + green
		+ "\nBlue: " + blue
		+ "\nX: " + x + " Y: " + y;
	}
}
