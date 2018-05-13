/*

	File Name:
	DormMealFX.java

	Author:
	David Whynot

	Date Created:
	5/1/18

	Description:
	Page 892 #1

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
import javafx.collections.*;
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

public class DormMealFX extends Application {
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
		Scene scene = new Scene(pain, 550, 150);
		Date today = new Date();


		// declare vars
		String title = "DormMealFX | By David Whynot | " + today;
		String[] dormOpts = {
			"Allen Hall",
			"Pike Hall",
			"Farthing Hall",
			"University Suites"
		};
		String[] mealOpts = {
			"7 meals per week",
			"14 meals per week",
			"Unlimited meals"
		};
		int[] dormPrices = {1800, 2200, 2800, 3000};
		int[] mealPrices = {600, 1100, 1800};
		String defDormOut = String.format("Price (per semester): $%,.2f", (float)dormPrices[0]);
		String defMealOut = String.format("Price (per semester): $%,.2f", (float)mealPrices[0]);
		String defOut = String.format("Total (per semester): $%,.2f", (float)(dormPrices[0] + mealPrices[0]));


		// create ui component objects

		HBox outBox = new HBox(15);
		Label output = new Label(defOut);

		HBox dormBox = new HBox(15);
		Label dormLbl = new Label("Select Dormitory:");
		ComboBox dormInp = new ComboBox(FXCollections.observableArrayList(dormOpts));
		Label dormOut = new Label(defDormOut);

		HBox mealBox = new HBox(15);
		Label mealLbl = new Label("Select Meal Plan:");
		ComboBox mealInp = new ComboBox(FXCollections.observableArrayList(mealOpts));
		Label mealOut = new Label(defMealOut);


		// sets
		stage.setTitle(title);
		pain.setPadding(new Insets(15));


		// add ui componenets to pain
		pain.getChildren().add(dormBox);
			dormBox.getChildren().add(dormLbl);
			dormBox.getChildren().add(dormInp);
			dormBox.getChildren().add(dormOut);
			dormInp.setValue(dormOpts[0]);
		pain.getChildren().add(mealBox);
			mealBox.getChildren().add(mealLbl);
			mealBox.getChildren().add(mealInp);
			mealBox.getChildren().add(mealOut);
			mealInp.setValue(mealOpts[0]);
		pain.getChildren().add(outBox);
			outBox.getChildren().add(output);


		// add event listeners
		EventHandler<ActionEvent> updateTotal = new EventHandler<ActionEvent>() {
			@Override
      public void handle(ActionEvent ae) {
				// event handler
				int total = 0;
				for(int i = 0; i < 4; ++i) {
					if(dormInp.getValue().equals(dormOpts[i])) {
						total += dormPrices[i];
						dormOut.setText(String.format("Price (per semester): $%,.2f", (float)dormPrices[i]));
					}
				}
				for(int i = 0; i < 3; ++i) {
					if(mealInp.getValue().equals(mealOpts[i])) {
						total += mealPrices[i];
						mealOut.setText(String.format("Price (per semester): $%,.2f", (float)mealPrices[i]));
					}
				}
				output.setText(String.format("Total (per semester): $%,.2f", (float)total));
      }
		};
		dormInp.setOnAction(updateTotal);
		mealInp.setOnAction(updateTotal);

		stage.setScene(scene);
		stage.show();
	}
}
