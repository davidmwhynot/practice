/*

	File Name:
	PasswordVerify.java

	Author:
	David Whynot

	Date Created:
	3/23/18

	Description:
	this is an adaptation of code I wrote years ago for an app called HData. It used JDBC. This was the registration page I used, modified to meet the requirements for the project.

	Type:


*/


// GUI BASED
// David Whynot 1.13.14 www.xdavesbanex.com
import javax.swing.JOptionPane.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
public class PasswordVerify extends JFrame implements MouseListener {
	JLabel user = new JLabel("---Username:");
	JTextField enterUser = new JTextField(10); // username fields
	JLabel pass = new JLabel("---Password:");
	JTextField enterPass = new JTextField(10); // password fields
	JLabel reTypePass = new JLabel("---Re-type Password:");
	JTextField rePass = new JTextField(10);	// retype password fields
	JLabel doneText = new JLabel("Done");
	JPanel done = new JPanel();
	JLabel requirements0 = new JLabel("----Password must be:");
	JLabel requirements1 = new JLabel("At least 6 chars.");
	JLabel requirements2 = new JLabel("At least one digit.");
	JLabel requirements3 = new JLabel("At least one lower and one upper alpha char.");
	JLabel requirements4 = new JLabel("At least one special char (@#%$^ etc).--------");
	BevelBorder borderUp = new BevelBorder(1, Color.darkGray, Color.lightGray);
	BevelBorder borderDown = new BevelBorder(0, Color.darkGray, Color.lightGray); // done fields
	public PasswordVerify() {
		super("New Profile");
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(user);
		con.add(enterUser);
		con.add(requirements0);
		con.add(requirements1);
		con.add(requirements2);
		con.add(requirements3);
		con.add(requirements4);
		con.add(pass);
		con.add(enterPass);
		con.add(reTypePass);
		con.add(rePass);
		con.add(done);
		done.add(doneText);
		done.setBorder(borderUp);
		done.addMouseListener(this);
	}
	public static void main(String[] args) {
		PasswordVerify newP = new PasswordVerify(); // create NewProfileFrame from class NewProfileFrame
		newP.setSize(315,220);
		newP.setVisible(true);
		newP.setLocationRelativeTo(null);
		newP.setResizable(false);
	}
	public void mouseEntered(MouseEvent e) {
		done.setBorder(borderDown);
	}
	public void mouseExited(MouseEvent e) {
		done.setBorder(borderUp);
	}
	public void mouseClicked(MouseEvent e) {
		Object source = e.getSource();
		if(source == done) {
			System.out.println("Done"); // here we will...
			// 1 - check that passwords match
			String passCheckOne = enterPass.getText();
			String passCheckTwo = rePass.getText();
			if(!(passCheckOne.equals(passCheckTwo)))
				JOptionPane.showMessageDialog(null,"Passwords do not match!");
			else {
				// 2 - check that username and password are less than 20 chars and that password is greater than 6 characters
				String ul = enterUser.getText();
				String pl = enterPass.getText();
				int x = ul.length();
				int y = pl.length();
				if(x > 20)
					JOptionPane.showMessageDialog(null,"Username is too long! Please select a username that is less than or equal to 20 characters.");
				else {
					if(y > 20)
						JOptionPane.showMessageDialog(null,"Password is too long! Please select a password that is less than or equal to 20 characters.");
					else {
						if(y < 6)
							JOptionPane.showMessageDialog(null,"Password is too short! Please select a password that is greater than or equal to 6 characters.");
						else {
							// create the test regex
							String regex = "^.*(?=.{6,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
							if(pl.matches(regex)) { // test the password against the regex
								JOptionPane.showMessageDialog(null,"Success! Password is valid!");
							} else {
								JOptionPane.showMessageDialog(null,"Invalid Password!");
							}

							// the below code is used in this app to check a database for an existing user with the same username
							// 3 - checks that username is not already in use
							// HSQL m = new HSQL();
							// if(m.CheckIfUserExists(ul))
							// 	JOptionPane.showMessageDialog(null,"Username already exists! Please choose a username that is not already in use.");
							// else {
							// 	// 4 - store username and password in the database
							// 	HSQL n = new HSQL();
							// 	n.StoreUsernamePassword(ul,pl);
							// 	// 5 - hide the frame if successful
							// 	this.setVisible(false);
							// }
						}
					}
				}
			}
		}
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
}
