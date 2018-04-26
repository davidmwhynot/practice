/*

	File Name:
	JoeAuto.java

	Author:
	David Whynot

	Date Created:
	4/20/18

	Description:
	This version of the application should use JavaFX techniques and should NOT use any dialog boxes.
	For a little extra credit and fun, display a picture of a cookie in the window

	Type:
	javaFX

*/


// GUI BASED

import javafx.scene.image.*;
import java.io.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import java.util.*;
import javafx.application.Application;
import javax.swing.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class JoeAuto extends Application {
	Stage stage;

	public static void main(String[] args) {
		// MAIN
		launch(args);

		System.exit(0);
	}

  @Override
  public void start(Stage stage) throws Exception {
		// create objects
		VBox pain = new VBox(15);
		Scene scene = new Scene(pain, 500, 400);
		Date today = new Date();


		// declare vars
		String title = "JoeAuto | By David Whynot | " + today;
		String defOut = "Please fill out the form to obtain an invoice";


		// create ui component objects
		VBox checkBox = new VBox(15);
			CheckBox oil = new CheckBox("Oil Change");
	    CheckBox lube = new CheckBox("Lube Job");
	    CheckBox radiator = new CheckBox("Radiator Flush");
	    CheckBox transmission = new CheckBox("Transmission Flash");
	    CheckBox inspect = new CheckBox("Inspection");
	    CheckBox muffler = new CheckBox("Muffler Replacement");
	    CheckBox tire = new CheckBox("Tire Rotation");

		HBox outBox = new HBox(15);
			Label output = new Label(defOut);

		HBox hoursBox = new HBox(15);
			Label hoursLbl = new Label("Hours Billed:");
			TextField hoursInp = new TextField();

		HBox partsBox = new HBox(15);
			Label partsLbl = new Label("Cost of additional parts used:");
			TextField partsInp = new TextField();

		Button submit = new Button("Create Invoice");


		// sets
		stage.setTitle(title);
		stage.setScene(scene);
		pain.setPadding(new Insets(15));


		// add ui componenets to pain
		pain.getChildren().add(checkBox);
			checkBox.getChildren().add(oil);
			checkBox.getChildren().add(lube);
			checkBox.getChildren().add(radiator);
			checkBox.getChildren().add(transmission);
			checkBox.getChildren().add(inspect);
			checkBox.getChildren().add(muffler);
			checkBox.getChildren().add(tire);
		pain.getChildren().add(hoursBox);
			hoursBox.getChildren().add(hoursLbl);
			hoursBox.getChildren().add(hoursInp);
		pain.getChildren().add(partsBox);
			partsBox.getChildren().add(partsLbl);
			partsBox.getChildren().add(partsInp);
		pain.getChildren().add(submit);
		pain.getChildren().add(outBox);
			outBox.getChildren().add(output);


		// add event listeners
		submit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
      public void handle(ActionEvent ae) {
				double total = 0;
				try {
					if(oil.isSelected()) {
			      total += 35;
			    }
			    if(lube.isSelected()) {
			      total += 25;
			    }
			    if(radiator.isSelected()) {
			      total += 50;
			    }
			    if(transmission.isSelected()) {
			      total += 120;
			    }
			    if(inspect.isSelected()) {
			      total += 35;
			    }
			    if(muffler.isSelected()) {
			      total += 50;
			    }
			    if(tire.isSelected()) {
			      total += 50;
			    }
					if(!hoursInp.getText().equals("")) {
						total += 60 * Double.parseDouble(hoursInp.getText());
					}
					if(!partsInp.getText().equals("")) {
						total += Double.parseDouble(partsInp.getText());
					}
					String finalOut = String.format("Total: $%,.2f%n", total);
					output.setText(finalOut);
				} catch(NumberFormatException e) {
					output.setText("Please provide numeric values for hours and cost of additional parts!");
				}
      }
    });

		stage.show();
	}
}
