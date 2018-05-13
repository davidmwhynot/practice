/*

	File Name:
	ConferenceFX.java

	Author:
	David Whynot

	Date Created:
	5/1/18

	Description:
	Page 893 #3
	Recreate the application as a JavaFX application
		a. Use Radio Buttons in a Toggle Group to choose regular or student registration
		b. Use a CheckBox for the optional opening dinner
		c. Use a ListView that is preselected to none and lists the four workshops for selection
		d. Using this information, display the total registration fee in a label
		e. Use some color and different fonts in your layout

	Type:
	javaFX

*/


// GUI BASED

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

public class ConferenceFX extends Application {
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
		Scene scene = new Scene(pain, 550, 350);
		Date today = new Date();


		// declare vars
		String title = "ConferenceFX | By David Whynot | " + today;
		int genReg = 895;
		int stuReg = 495;
		int dinner = 30;
		int[] workPrices = {295, 295, 395, 395};
		String[] workshops = {
			String.format("Introduction to E-commerce ($%,.2f)", (float)workPrices[0]),
			String.format("The Future of the Web ($%,.2f)", (float)workPrices[1]),
			String.format("Advanced Java Programming ($%,.2f)", (float)workPrices[2]),
			String.format("Network Security ($%,.2f)", (float)workPrices[3])
		};
		String defOut = String.format("Total: $%,.2f", (float)genReg);


		// create ui component objects
		Label output = new Label(defOut);

		HBox regBox = new HBox(15);
		Label regLbl = new Label("Select Registration Type:");
		ToggleGroup regGroup = new ToggleGroup();
		RadioButton genRegInp = new RadioButton(String.format("General Registration ($%,.2f)", (float)genReg));
		RadioButton stuRegInp = new RadioButton(String.format("Student Registration ($%,.2f)", (float)stuReg));
		genRegInp.setToggleGroup(regGroup);
		genRegInp.setSelected(true);
		stuRegInp.setToggleGroup(regGroup);

		CheckBox dinnerInp = new CheckBox(String.format("Dinner ($%,.2f)", (float)dinner));
		dinnerInp.setIndeterminate(false);

		Label workLbl = new Label("Optional Workshops");
		ListView<String> workView = new ListView<String>(FXCollections.observableArrayList(workshops));
		workView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		workView.setMaxWidth(300);
		workView.setMaxHeight(125);

		Button submit = new Button("Compute total");


		// sets
		stage.setTitle(title);
		pain.setPadding(new Insets(15));


		// add ui componenets to pain
		pain.getChildren().add(regLbl);
		pain.getChildren().add(regBox);
			regBox.getChildren().add(genRegInp);
			regBox.getChildren().add(stuRegInp);
		pain.getChildren().add(dinnerInp);
		pain.getChildren().add(workLbl);
		pain.getChildren().add(workView);
		pain.getChildren().add(submit);
		pain.getChildren().add(output);


		// add event listeners
		submit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
      public void handle(ActionEvent ae) {
				// event handler
				int total = 0;
				if(genRegInp.isSelected()) {
					total += genReg;
				} else {
					total += stuReg;
				}
				if(dinnerInp.isSelected()) {
					total += dinner;
				}
				for(String i : workView.getSelectionModel().getSelectedItems()) {
					for(int x = 0; x < 4; ++x) {
						if(i.equals(workshops[x])) {
							total += workPrices[x];
							break;
						}
					}
				}

				output.setText(String.format("Total: $%,.2f", (float)total));
      }
		});

		stage.setScene(scene);
		stage.show();
	}
}
