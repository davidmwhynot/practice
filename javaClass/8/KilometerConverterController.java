import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KilometerConverterController {

    @FXML
    private Label promptLabel;

    @FXML
    private TextField kilometerTextField;

    @FXML
    private Label outputLabel;

    @FXML
    private Button convertButton;

		public void initialize() {

		}
		public void convertButtonListener() {
			final double CONVERSION_FACTOR = 0.6214;
			String str = kilometerTextField.getText();
			double miles = Double.parseDouble(str) * CONVERSION_FACTOR;
			outputLabel.setText(str + " kilometers is " + miles + " miles.");
		}
}
