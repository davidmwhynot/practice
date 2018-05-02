/*

	File Name:
	Main.java

	Author:
	David Whynot

	Date Created:
	5/1/18

	Description:
	Project 8 application

	Type:
	javaFX

*/


// GUI BASED

import java.sql.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.collections.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Main extends Application {
	Stage stage;

	public static void main(String[] args) {
		// MAIN
		launch(args);

		System.exit(0);
	}

  @Override
  public void start(Stage stage) throws Exception {
		// run inital db routines
		dbSetup();


		// create objects
		HBox pain = new HBox(15);
		Scene scene = new Scene(pain, 550, 250);
		java.util.Date today = new java.util.Date();


		// declare vars
		String title = "Project 8 | By David Whynot | " + today;


		// create ui component objects
		// HBox sub1 = new HBox(15);
		VBox lCol = new VBox(15);
		VBox rCol = new VBox(15);

		Label searchLbl = new Label("Search by student ID:");
		HBox searchInpBox = new HBox(15);
		TextField searchInp = new TextField();
		Button searchBtn = new Button("Search");

		HBox searchOutBox = new HBox(15);
		Label searchOutName = new Label("");
		Label searchOutMajor = new Label("");

		Label newLbl = new Label("Create a new student record");

		HBox idBox = new HBox(15);
		Label idLbl = new Label("Student ID:");
		TextField idInp = new TextField();

		HBox fnameBox = new HBox(15);
		Label fnameLbl = new Label("First name:");
		TextField fnameInp = new TextField();

		HBox lnameBox = new HBox(15);
		Label lnameLbl = new Label("Last name:");
		TextField lnameInp = new TextField();


		HBox majorBox = new HBox(15);
		Label majorLbl = new Label("Major code:");
		ComboBox majorInp = new ComboBox(FXCollections.observableArrayList(getMajorCodes()));

		Button addBtn = new Button("Add Student");


		// sets
		stage.setTitle(title);
		pain.setPadding(new Insets(15));
		lCol.setMaxWidth(300);
		rCol.setMaxWidth(300);


		// add ui componenets to pain
		pain.getChildren().add(lCol);
			lCol.getChildren().add(newLbl);
			lCol.getChildren().add(idBox);
				idBox.getChildren().add(idLbl);
				idBox.getChildren().add(idInp);
			lCol.getChildren().add(fnameBox);
				fnameBox.getChildren().add(fnameLbl);
				fnameBox.getChildren().add(fnameInp);
			lCol.getChildren().add(lnameBox);
				lnameBox.getChildren().add(lnameLbl);
				lnameBox.getChildren().add(lnameInp);
			lCol.getChildren().add(majorBox);
				majorBox.getChildren().add(majorLbl);
				majorBox.getChildren().add(majorInp);
			lCol.getChildren().add(addBtn);
		pain.getChildren().add(rCol);
			rCol.getChildren().add(searchLbl);
			rCol.getChildren().add(searchInpBox);
				searchInpBox.getChildren().add(searchInp);
				searchInpBox.getChildren().add(searchBtn);
			rCol.getChildren().add(searchOutBox);
				searchOutBox.getChildren().add(searchOutName);
				searchOutBox.getChildren().add(searchOutMajor);


		// add event listeners
		addBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
      public void handle(ActionEvent ae) {
				// add event handler
				try {
					// Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?useSSL=false","root","");
					Connection db = DriverManager.getConnection("jdbc:derby:college;create=true");
					Statement stmt = db.createStatement();
					String query = "INSERT INTO student (student_number, student_fname, student_lname, student_major) VALUES (" + idInp.getText() + ", '" + fnameInp.getText() + "', '" + lnameInp.getText() + "', '" + majorInp.getValue() + "')"; // i just LOVE sql injection vulnerabilities
					System.out.println(query);
					stmt.executeUpdate(query);
					db.close();
				} catch(Exception e) {
					System.out.println("ERROR: " + e.getMessage());
					System.out.println("\n\n--------------------------\n\t\tSTACKTRACE\n--------------------------\n\n");
					e.printStackTrace();
					System.out.println("\n\n--------------------------\n\t\tEND\n--------------------------\n\n");

				}
      }
		});
		searchBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
      public void handle(ActionEvent ae) {
				// search event handler
				try {
					// Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?useSSL=false","root","");
					Connection db = DriverManager.getConnection("jdbc:derby:college;create=true");
					Statement stmt1 = db.createStatement();
					String query1 = "SELECT student_fname, student_lname, student_major FROM student WHERE student_number = " + searchInp.getText();
					ResultSet res1 = stmt1.executeQuery(query1);
					while(res1.next()) {
						searchOutName.setText(res1.getString("student_fname") + " " + res1.getString("student_lname"));
						Statement stmt2 = db.createStatement();
						String query2 = "SELECT major_description FROM major WHERE major_code = '" + res1.getString("student_major") + "'";
						ResultSet res2 = stmt2.executeQuery(query2);
						while(res2.next()) {
							searchOutMajor.setText(res2.getString("major_description"));
						}
					}
					db.close();
				} catch(Exception e) {
					System.out.println("ERROR: " + e.getMessage());
					System.out.println("\n\n--------------------------\n\t\tSTACKTRACE\n--------------------------\n\n");
					e.printStackTrace();
					System.out.println("\n\n--------------------------\n\t\tEND\n--------------------------\n\n");

				}
      }
		});

		stage.setScene(scene);
		stage.show();
	}
	private static String[] getMajorCodes() {
		try {
			// Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?useSSL=false","root","");
			Connection db = DriverManager.getConnection("jdbc:derby:college;create=true");
			Statement stmt = db.createStatement();
			String query = "SELECT major_code FROM major";
			ResultSet res = stmt.executeQuery(query);
			ArrayList<String> buffer = new ArrayList<String>();
			while(res.next()) {
				buffer.add(res.getString("major_code"));
			}
			db.close();
			return buffer.toArray(new String[buffer.size()]);
		} catch(Exception e) {
			System.out.println("ERROR: " + e.getMessage());
			System.out.println("\n\n--------------------------\n\t\tSTACKTRACE\n--------------------------\n\n");
			e.printStackTrace();
			System.out.println("\n\n--------------------------\n\t\tEND\n--------------------------\n\n");
			String[] returnArray = {"ERROR"};
			return returnArray;
		}
	}
	private static void dbSetup() {
		try {
			// Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?useSSL=false","root","");
			Connection db = DriverManager.getConnection("jdbc:derby:college;create=true");
			DatabaseMetaData metadata = db.getMetaData();
			String[] names = {"TABLE"};
			ResultSet tableNames = metadata.getTables(null, null, null, names);
			boolean studentFlag = false;
			boolean majorFlag = false;
			while(tableNames.next()) {
				String t = tableNames.getString("TABLE_NAME");
				if(t.equals("STUDENT")) {
					studentFlag = true;
				} else if(t.equals("MAJOR")) {
					majorFlag = true;
				}
			}
			if(!studentFlag) {
				// create the student table
				Statement stmt1 = db.createStatement();
				Statement stmt2 = db.createStatement();
				Statement stmt3 = db.createStatement();
				String query1 = "CREATE TABLE student( student_number integer not null primary key, student_fname varchar(50) not null, student_lname varchar(50) not null, student_major varchar(3) not null)";
				String query2 = "INSERT INTO student (student_number, student_fname, student_lname, student_major) values (1, 'David', 'Whynot', 'CIS'), (2, 'Hugh', 'Mungus', 'CIS'), (3, 'Kappa', 'Keepo', 'XDQ'), (4, 'Alexander', 'Doyon', 'ENG'), (5, 'Guv', 'Exdee', 'PHY')";
				String query3 = "SELECT * FROM student";
				stmt1.executeUpdate(query1);
				stmt2.executeUpdate(query2);
				ResultSet res = stmt3.executeQuery(query3);
				while(res.next()) {
					System.out.println(res.getString("student_number") + " " + res.getString("student_fname"));
				}

			}
			if(!majorFlag) {
				// create the major table
				Statement stmt1 = db.createStatement();
				Statement stmt2 = db.createStatement();
				Statement stmt3 = db.createStatement();
				String query1 = "CREATE TABLE major( major_code varchar(3) not null primary key, major_description varchar(50) not null)";
				String query2 = "INSERT INTO major (major_code, major_description) VALUES ('CIS', 'Computer Information Systems'), ('XDQ', 'Extraterrestrial Design Quotas'), ('ENG', 'English'), ('PHY', 'Physics')";
				String query3 = "SELECT * FROM major";
				stmt1.executeUpdate(query1);
				stmt2.executeUpdate(query2);
				ResultSet res = stmt3.executeQuery(query3);
				while(res.next()) {
					System.out.println(res.getString("major_code") + " " + res.getString("major_description"));
				}
			}
			db.close();
		} catch(Exception e) {
			System.out.println("ERROR: " + e.getMessage());
			System.out.println("\n\n--------------------------\n\t\tSTACKTRACE\n--------------------------\n\n");
			e.printStackTrace();
			System.out.println("\n\n--------------------------\n\t\tEND\n--------------------------\n\n");
		}
	}
}
