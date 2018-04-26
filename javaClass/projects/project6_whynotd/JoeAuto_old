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
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class JoeAuto extends Application {
	// calculateButton;
	Stage joeWindow;
	Scene joeScene;

  public static void main(String args[]) {
    launch(args);
    Date today = new Date();
		System.out.println("DemoPlayers.java by Luke Bonner "+today);
  }

  @Override
  public void start(Stage joeStage) throws Exception {
		double hourscharge=0.0;
		double partscharge=0.0;
    CheckBox oil = new CheckBox("Oil Change");
    CheckBox lube = new CheckBox("Lube Job");
    CheckBox radFlush = new CheckBox("Radiator Flush");
    CheckBox tranFlush = new CheckBox("Transmission Flash");
    CheckBox inspection = new CheckBox("Inspection");
    CheckBox muffler = new CheckBox("Muffler Replacement");
    CheckBox tireRotation = new CheckBox("Tire Rotation");
    TextField hours = new TextField("Enter hours billed");
    TextField parts = new TextField("Enter cost of parts Used");

		Button calculateButton = new Button();
		calculateButton.setText("calculate");

    Pane joeLayout = new Pane();


		joeStage.setTitle("Joe's Auto *Fully customizable* Checkout");

		joeLayout.getChildren().add(hours);
		joeLayout.getChildren().add(parts);
		joeLayout.getChildren().add(calculateButton);
		joeLayout.getChildren().add(oil);
		joeLayout.getChildren().add(lube);
		joeLayout.getChildren().add(radFlush);
		joeLayout.getChildren().add(tranFlush);
		joeLayout.getChildren().add(inspection);
		joeLayout.getChildren().add(muffler);
		joeLayout.getChildren().add(tireRotation);

    //Joe's "fully customizable" GUI
		calculateButton.setOnMouseDragged(e -> {
			calculateButton.setLayoutX(e.getX());
			calculateButton.setLayoutY(e.getY());
		});
		hours.setOnMouseDragged(e -> {
			hours.setLayoutX(e.getX());
			hours.setLayoutY(e.getY());
		});
		parts.setOnMouseDragged(e -> {
			parts.setLayoutX(e.getX());
			parts.setLayoutY(e.getY());
		});
		oil.setOnMouseDragged(e -> {
			oil.setLayoutX(e.getX());
			oil.setLayoutY(e.getY());
		});
		lube.setOnMouseDragged(e -> {
			lube.setLayoutX(e.getX());
			lube.setLayoutY(e.getY());
		});
		radFlush.setOnMouseDragged(e -> {
			radFlush.setLayoutX(e.getX());
			radFlush.setLayoutY(e.getY());
		});
		tranFlush.setOnMouseDragged(e -> {
			tranFlush.setLayoutX(e.getX());
			tranFlush.setLayoutY(e.getY());
		});
		inspection.setOnMouseDragged(e -> {
			inspection.setLayoutX(e.getX());
			inspection.setLayoutY(e.getY());
		});
		muffler.setOnMouseDragged(e -> {
			muffler.setLayoutX(e.getX());
			muffler.setLayoutY(e.getY());
		});
		tireRotation.setOnMouseDragged(e -> {
			tireRotation.setLayoutX(e.getX());
			tireRotation.setLayoutY(e.getY());
		});

    EventHandler<ActionEvent> buttonHandler = new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event){
	    	double subtotalcharge = 0.0;
		    if(oil.isSelected()) {
		      subtotalcharge += 35;
		    }
		    if(lube.isSelected()) {
		      subtotalcharge += 25;
		    }
		    if(radFlush.isSelected()) {
		      subtotalcharge += 50;
		    }
		    if(tranFlush.isSelected()) {
		      subtotalcharge += 120;
		    }
		    if(inspection.isSelected()) {
		      subtotalcharge += 35;
		    }
		    if(muffler.isSelected()) {
		      subtotalcharge += 50;
		    }
		    if(tireRotation.isSelected()) {
		      subtotalcharge += 50;
		    }
		    subtotalcharge = partscharge + (hourscharge * 60);
        JOptionPane.showMessageDialog(null, "your total charge is: $" + subtotalcharge);
      }
    };
    calculateButton.setOnAction(buttonHandler);
    Scene joeScene = new Scene(joeLayout, 300, 250);
    joeStage.setScene(joeScene);
    joeStage.show();
  }
}
