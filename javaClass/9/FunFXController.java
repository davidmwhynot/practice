import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;

public class FunFXController {

	@FXML
	private TextField textField;

	@FXML
	public CheckBox checkbox1;

	@FXML
	public CheckBox checkbox2;

	@FXML
	private ComboBox<String> comboBox;

	@FXML
	private Label outputLabel;

	@FXML
	private Label outputLabel2;

	public void initialize() {
    // comboBox.getItems().removeAll(comboBox.getItems());
		comboBox.getItems().addAll("Draven", "Syndra", "Pony");
    comboBox.getSelectionModel().select("Pony");
	}
	public void checkbox1checked() {
		outputLabel.setText("");
		outputLabel.setText(boxClicked(checkbox1.isSelected(), checkbox2.isSelected()));
	}
	public void checkbox2checked() {
		outputLabel.setText("");
		outputLabel.setText(boxClicked(checkbox1.isSelected(), checkbox2.isSelected()));
	}
	public void comboBoxClick() {
		String s = comboBox.getValue();
		if(s.equals("Draven")) {
			outputLabel2.setText("Welcome, to the League of Draven");
		} else if(s.equals("Syndra")) {
			outputLabel2.setText("Big purple balls");
		} else if(s.equals("Pony")) {
			outputLabel2.setText("Correct!");
		} else {
			outputLabel2.setText("Error");
		}
	}
	public String boxClicked(Boolean box1state, Boolean box2state) {
		if(box1state) {
			return "Hi, " + textField.getText() + " you love java!";
		} else if(box2state) {
			return "Hi, " + textField.getText() + " I guess you would rather not say!";
		} else {
			return "Please pick an option, " + textField.getText() + "!";
		}
	}
}
