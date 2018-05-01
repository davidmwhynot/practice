/*

	File Name:
	CookiesFX.java

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

public class CookiesFX extends Application {
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
		Scene scene = new Scene(pain, 1920, 1080);
		Date today = new Date();


		// declare vars
		int bag = 40;
		int servings = 10;
		int servingCals = 300;
		double servingSize = bag / servings;
		double cals = servingCals / servingSize;
		String title = "CookiesFX | By David Whynot | " + today;
		String defOut = "Please provide a type of cookie and number of cookies consumed";


		// create ui component objects
		FileInputStream input = new FileInputStream("cookie.png");
		Image image = new Image(input);
		BackgroundImage bgImg = new BackgroundImage(image, null, null, null, null);

		HBox outBox = new HBox(15);
		Label output = new Label(defOut);

		HBox typeBox = new HBox(15);
		Label typeLbl = new Label("Cookie type");
		TextField cookieType = new TextField();

		HBox numBox = new HBox(15);
		Label numLbl = new Label("Number of cookies");
		TextField cookieNum = new TextField();

		Button submit = new Button();


		// sets
		stage.setMaximized(true);
		stage.setTitle(title);
		stage.setScene(scene);
		submit.setText("Calculate Calories");
		pain.setPadding(new Insets(15));


		// add ui componenets to pain
		pain.getChildren().add(outBox);
			outBox.getChildren().add(output);
		pain.getChildren().add(typeBox);
			typeBox.getChildren().add(typeLbl);
			typeBox.getChildren().add(cookieType);
		pain.getChildren().add(numBox);
			numBox.getChildren().add(numLbl);
			numBox.getChildren().add(cookieNum);
		pain.getChildren().add(submit);
		pain.setBackground(new Background(bgImg));


		// add event listeners
		submit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
      public void handle(ActionEvent ae) {
				try {
					String type = cookieType.getText();
					int num = Integer.parseInt(cookieNum.getText());
					if(!type.equals("")) {
						if(num >= 0) {
							output.setText("You ate " + num * cals + " calories of " + type + " cookies.");
						} else {
							output.setText("Please enter a number of cookies that is positive");
						}
					} else {
						output.setText("Please provide a type of cookie");
					}
				} catch(NumberFormatException e) {
					output.setText(defOut);
				}
      }
    });

		stage.show();
	}
}
