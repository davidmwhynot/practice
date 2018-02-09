// Admission.java

// Application for a college�s admissions office.

// Print the message �Accepted� if the student meets either of the following criteria
// A grade point average of 3.0 or above and an admission test score of at least 60
// A grade point average below 3.0 and an admission test score of at least 80

// Print the message "Rejected" if the student does not meet the criteria for acceptance

import javax.swing.*;
public class Admission
{
  public static void main (String[] args)
  {
    double gpa;
    int score;
    final double MINGPA = 3.0;
    final int MINSCORE1 = 60;
    final int MINSCORE2 = 80;
    String entry, message = "To be determined";
		boolean flagGPA = false;

    // ADD DATA VALIDATION LOOP - USER MUST KEEP TRYING UNTIL 0 through 4.00 is entered for gpa!
		do {
			if(flagGPA) {
				JOptionPane.showMessageDialog(null, "Incorrect GPA!");
			}
    	entry = JOptionPane.showInputDialog(null, "Enter your grade point average");
    	gpa = Double.parseDouble(entry);
			flagGPA = true;
		} while(gpa < 0 || gpa > 4);

    // ADD DATA VALIDATION LOOP - USER MUST KEEP TRYING UNTIL 0 through 100 is entered for score!
    do {
			entry = JOptionPane.showInputDialog(null, "Enter your admission test score");
    	score = Integer.parseInt(entry);
		} while(score < 0 || score > 100);

    // CODE THE LOGIC HERE TO ASSIGN THE APPROPRIATE VALUE TO message
		if(gpa >= 3) {
			if(score >= 60) {
				message = "Accepted";
			} else {
				message = "Rejected";
			}
		} else {
			if(score >= 80) {
				message = "Accepted";
			} else {
				message = "Rejected";
			}
		}
    JOptionPane.showMessageDialog(null, message);
  }
}
