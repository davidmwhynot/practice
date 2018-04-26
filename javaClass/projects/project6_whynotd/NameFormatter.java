/*

	File Name:
	NameFormatter.java

	Author:
	David Whynot

	Date Created:
	4/20/18

	Description:
	Page 52 #3 of the Chapter 19 handout.

	Type:
	javaFX

*/


// GUI BASED

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

public class NameFormatter extends Application {
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
		Scene scene = new Scene(pain, 550, 500);
		Date today = new Date();


		// declare vars
		String title = "NameFormatter | By David Whynot | " + today;


		// create ui component objects
		VBox outBox = new VBox(15);

		HBox titleBox = new HBox(15);
		Label titleLbl = new Label("Preferred Title (Dr., Mrs., Ms., Mr., Etc.)");
		TextField titleInp = new TextField();

		HBox firstBox = new HBox(15);
		Label firstLbl = new Label("First name");
		TextField firstInp = new TextField();

		HBox middleBox = new HBox(15);
		Label middleLbl = new Label("Middle name");
		TextField middleInp = new TextField();

		HBox lastBox = new HBox(15);
		Label lastLbl = new Label("Last name");
		TextField lastInp = new TextField();

		Button submit = new Button();


		// sets
		stage.setTitle(title);
		stage.setScene(scene);
		submit.setText("Generate Names");
		pain.setPadding(new Insets(15));


		// add ui componenets to pain
		pain.getChildren().add(titleBox);
			titleBox.getChildren().add(titleLbl);
			titleBox.getChildren().add(titleInp);
		pain.getChildren().add(firstBox);
			firstBox.getChildren().add(firstLbl);
			firstBox.getChildren().add(firstInp);
		pain.getChildren().add(middleBox);
			middleBox.getChildren().add(middleLbl);
			middleBox.getChildren().add(middleInp);
		pain.getChildren().add(lastBox);
			lastBox.getChildren().add(lastLbl);
			lastBox.getChildren().add(lastInp);
		pain.getChildren().add(submit);
		pain.getChildren().add(outBox);


		// add event listeners
		submit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
      public void handle(ActionEvent ae) {
				outBox.getChildren().clear();
				String s = " ";
				String c = ", ";
				String title = titleInp.getText();
				String first = firstInp.getText();
				String middle = middleInp.getText();
				String last = lastInp.getText();
				String[] btns = new String[6];
				btns[0] = title + s + first + s + middle + s + last;
				btns[1] = first + s + middle + s + last;
				btns[2] = first + s + last;
				btns[3] = last + c + first + s + middle + c + title;
				btns[4] = last + c + first + s + middle;
				btns[5] = last + c + first;
				for(String i : btns)
					outBox.getChildren().add(new Button(i));
      }
    });

		stage.show();
	}
}
