package ihm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;
/**
 * 
 * @author Colin
 *
 */
public class FirstWindowController implements Initializable{
	Parent root;
	Scene scene;
	Stage primaryStage;

	@FXML
	ComboBox<Integer> firstWinCombobox;

	@FXML
	Button firstWinButton;

	@Override
	public void initialize(URL location, ResourceBundle resources){
		firstWinCombobox.getItems().addAll(2,3,4,5,6,7,8,9,10);
		firstWinCombobox.setValue(2);
		firstWinButton.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
			FXMLLoader loader = new FXMLLoader();
			URL fxmlFileUrl = getClass().getResource("/IHMprojet.fxml");
			if (fxmlFileUrl == null) {
				System.out.println("Impossible de charger le fichier fxml");
				System.exit(-1);
			}
			loader.setLocation(fxmlFileUrl);
			try {
				root = loader.load();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			MainController mainController = loader.getController();
			mainController.setElementVisibilityAndReset(this.firstWinCombobox.getValue());
			mainController.setComboBoxValue(this.firstWinCombobox.getValue());
			scene = new Scene(root);
			primaryStage.setTitle("50 Nuances de Grey");
			primaryStage.setScene(scene);
			primaryStage.show();
			Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
			primaryStage.setX((primScreenBounds.getWidth() - primaryStage.getWidth()) / 2);
			primaryStage.setY((primScreenBounds.getHeight() - primaryStage.getHeight()) / 2);
		});
	}

	public void setStage(Stage primaryStage) {
		this.primaryStage=primaryStage;
	}



}
