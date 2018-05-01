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
		VBox pain = new VBox(15);
		Scene scene = new Scene(pain, 550, 350);
		java.util.Date today = new java.util.Date();


		// declare vars
		String title = "Project 8 | By David Whynot | " + today;


		// create ui component objects
		HBox sub1 = new HBox(15);
		VBox lCol = new VBox(15);
		VBox rCol = new VBox(15);

		HBox searchInpBox = new HBox(15);
		Label searchLbl = new Label("Search by student ID:");
		TextField searchInp = new TextField();
		Button searchBtn = new Button("Search");

		HBox searchOutBox = new HBox(15);
		Label searchOutName = new Label("");
		Label searchOutMajor = new Label("");

		Label newLbl = new Label("Create a new student record");

		HBox idBox = new HBox(15);
		Label idLbl = new Label("Student ID:");

		HBox fnameBox = new HBox(15);
		Label fnameLbl = new Label("First name:");


		HBox lnameBox = new HBox(15);
		Label lnameLbl = new Label("Last name:");


		HBox majorBox = new HBox(15);
		Label majorLbl = new Label("Major code:");
		ComboBox majorInp = new ComboBox(FXCollections.observableArrayList(getMajorCodes()));

		Button addButton = new Button("Add Student");


		// sets
		stage.setTitle(title);
		pain.setPadding(new Insets(15));


		// add ui componenets to pain
		pain.getChildren().add(sub1);
			sub1.getChildren().add(lCol);
			sub1.getChildren().add(rCol);
				rCol.getChildren().add(searchInpBox);
				rCol.getChildren().add(searchOutBox);


		// add event listeners
		EventHandler<ActionEvent> updateTotal = new EventHandler<ActionEvent>() {
			@Override
      public void handle(ActionEvent ae) {
				// event handler

      }
		};
		genRegInp.setOnAction(updateTotal);
		stuRegInp.setOnAction(updateTotal);
		dinnerInp.setOnAction(updateTotal);

		stage.setScene(scene);
		stage.show();
	}
	private static String[] getMajorCodes() {
		try {
			// Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?useSSL=false","root","");
			Connection db = DriverManager.getConnection("jdbc:derby:college;create=true");
			Statement drops = db.createStatement();
			db.close();
		} catch(Exception e) {
			System.out.println("ERROR: " + e.getMessage());
			System.out.println("\n\n--------------------------\n\t\tSTACKTRACE\n--------------------------\n\n");
			e.printStackTrace();
			System.out.println("\n\n--------------------------\n\t\tEND\n--------------------------\n\n");
		}
	}
	private static void dbSetup() {
		try {
			// Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/college?useSSL=false","root","");
			Connection db = DriverManager.getConnection("jdbc:derby:college;create=true");
			Statement drops = db.createStatement();
			String dq1 = "DROP TABLE student";
			String dq2 = "DROP TABLE major";
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

			} else {
				drops.executeUpdate(dq1);
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
			} else {
				drops.executeUpdate(dq2);
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
