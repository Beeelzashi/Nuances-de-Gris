package ihm;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class HelpController implements Initializable{

	@FXML
	Button helpHexaRgbButton;
	
	@FXML
	TextField helpTextfield;
	
	@FXML
	ComboBox<Integer> helpComboBox;
	
	@FXML
	ColorPicker helpColorPicker;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		helpComboBox.getItems().addAll(2,3,4,5,6,7,8,9,10);
		helpComboBox.setValue(2);
		helpTextfield.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		helpHexaRgbButton.setText("Passer en Hexa");
		helpHexaRgbButton.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(helpHexaRgbButton.getText().equals("Passer en Hexa")) {
				helpHexaRgbButton.setText("Passer en RGB");
				helpTextfield.setText("#"+ helpTextfield.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			}else {
				helpHexaRgbButton.setText("Passer en Hexa");
				helpTextfield.setText((int) (((Color)helpTextfield.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)helpTextfield.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)helpTextfield.getBackground().getFills().get(0).getFill()).getBlue()*255));

			}
		});
		
		
		helpColorPicker.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				helpTextfield.setBackground(new Background(new BackgroundFill(helpColorPicker.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));				
				helpHexaRgbButton.setText("Passer en Hexa");
				helpTextfield.setText((int) (helpColorPicker.getValue().getRed()*255)+","+(int) (helpColorPicker.getValue().getGreen()*255)+","+(int) (helpColorPicker.getValue().getBlue()*255));
				if(helpColorPicker.getValue().grayscale().getBrightness()<0.5) {

					helpTextfield.setStyle("-fx-text-fill: white;");
				}else {
					helpTextfield.setStyle("-fx-text-fill: black;");
				}
			}
		});
		
	}
	public void setComboBoxValue(int val) {
		helpComboBox.setValue(val);
	}

}
