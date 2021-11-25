package ihm;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 * 
 * @author Colin
 * 
*/
public class MainController implements Initializable{
	//La declaration @FXML prend pas mal de place, mais afin de ne pas avoir une ligne avec que des vbox et que ce soit imbitable le choix a été fait de tout séparer et espacer pour une meilleur lisibilité 
	//Version opérationnel mais non optimisée, un point d'optimisation qui peut etre fait c'est de rassembler certaines box ou Tf dans des lists et boucler dessus au lieu d ecrire plusieurs fois la meme instruction

	@FXML
	HBox h1,h2,h3,h4,h5,h6,h7,h8,h9,h10;

	@FXML
	VBox vboxConvertedColor1,vboxConvertedColor2,vboxConvertedColor3,vboxConvertedColor4,vboxConvertedColor5,vboxConvertedColor6,vboxConvertedColor7,vboxConvertedColor8,vboxConvertedColor9,vboxConvertedColor10;

	@FXML
	VBox vboxConvertedColor11,vboxConvertedColor12,vboxConvertedColor13,vboxConvertedColor14,vboxConvertedColor15;

	@FXML
	VBox vboxConvertedColor21,vboxConvertedColor22,vboxConvertedColor23,vboxConvertedColor24,vboxConvertedColor25;

	@FXML
	VBox vboxConvertedColor31,vboxConvertedColor32,vboxConvertedColor33,vboxConvertedColor34,vboxConvertedColor35;

	@FXML
	VBox vboxConvertedColor41,vboxConvertedColor42,vboxConvertedColor43,vboxConvertedColor44,vboxConvertedColor45;

	@FXML
	VBox vboxConvertedColor51,vboxConvertedColor52,vboxConvertedColor53,vboxConvertedColor54,vboxConvertedColor55;

	@FXML
	VBox vboxConvertedColor61,vboxConvertedColor62,vboxConvertedColor63,vboxConvertedColor64,vboxConvertedColor65;

	@FXML
	VBox vboxConvertedColor71,vboxConvertedColor72,vboxConvertedColor73,vboxConvertedColor74,vboxConvertedColor75;

	@FXML
	VBox vboxConvertedColor81,vboxConvertedColor82,vboxConvertedColor83,vboxConvertedColor84,vboxConvertedColor85;

	@FXML
	VBox vboxConvertedColor91,vboxConvertedColor92,vboxConvertedColor93,vboxConvertedColor94,vboxConvertedColor95;

	@FXML
	VBox vboxConvertedColor101,vboxConvertedColor102,vboxConvertedColor103,vboxConvertedColor104,vboxConvertedColor105;

	@FXML
	VBox leftColorVbox1,leftColorVbox2,leftColorVbox3,leftColorVbox4,leftColorVbox5,leftColorVbox6,leftColorVbox7,leftColorVbox8,leftColorVbox9,leftColorVbox10;

	@FXML
	VBox rightColorVbox1,rightColorVbox2,rightColorVbox3,rightColorVbox4,rightColorVbox5,rightColorVbox6,rightColorVbox7,rightColorVbox8,rightColorVbox9,rightColorVbox10;

	@FXML
	VBox leftGreyVbox1,leftGreyVbox2,leftGreyVbox3,leftGreyVbox4,leftGreyVbox5,leftGreyVbox6,leftGreyVbox7,leftGreyVbox8,leftGreyVbox9,leftGreyVbox10;

	@FXML
	VBox rightGreyVbox1,rightGreyVbox2,rightGreyVbox3,rightGreyVbox4,rightGreyVbox5,rightGreyVbox6,rightGreyVbox7,rightGreyVbox8,rightGreyVbox9,rightGreyVbox10;

	@FXML	
	ColorPicker colorPick1,colorPick2,colorPick3,colorPick4,colorPick5,colorPick6,colorPick7,colorPick8,colorPick9,colorPick10;

	@FXML
	Button changeNumberConfirm,helpButton,converter,hexaRgbButton;

	@FXML
	Label leftLabel1,leftLabel2,leftLabel3,leftLabel4,leftLabel5,leftLabel6,leftLabel7,leftLabel8,leftLabel9,leftLabel10;

	@FXML
	Label rightLabel1,rightLabel2,rightLabel3,rightLabel4,rightLabel5,rightLabel6,rightLabel7,rightLabel8,rightLabel9,rightLabel10;

	@FXML
	TextField tfConvertedColor11,tfConvertedColor12,tfConvertedColor13,tfConvertedColor14,tfConvertedColor15;

	@FXML
	TextField tfConvertedColor21,tfConvertedColor22,tfConvertedColor23,tfConvertedColor24,tfConvertedColor25;

	@FXML
	TextField tfConvertedColor31,tfConvertedColor32,tfConvertedColor33,tfConvertedColor34,tfConvertedColor35;

	@FXML
	TextField tfConvertedColor41,tfConvertedColor42,tfConvertedColor43,tfConvertedColor44,tfConvertedColor45;

	@FXML
	TextField tfConvertedColor51,tfConvertedColor52,tfConvertedColor53,tfConvertedColor54,tfConvertedColor55;

	@FXML
	TextField tfConvertedColor61,tfConvertedColor62,tfConvertedColor63,tfConvertedColor64,tfConvertedColor65;

	@FXML
	TextField tfConvertedColor71,tfConvertedColor72,tfConvertedColor73,tfConvertedColor74,tfConvertedColor75;

	@FXML
	TextField tfConvertedColor81,tfConvertedColor82,tfConvertedColor83,tfConvertedColor84,tfConvertedColor85;

	@FXML
	TextField tfConvertedColor91,tfConvertedColor92,tfConvertedColor93,tfConvertedColor94,tfConvertedColor95;

	@FXML
	TextField tfConvertedColor101,tfConvertedColor102,tfConvertedColor103,tfConvertedColor104,tfConvertedColor105;

	@FXML
	ComboBox<Integer> mainWinCombobox;

	Grey grey;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mainWinCombobox.getItems().addAll(2,3,4,5,6,7,8,9,10);
		this.resetTf();
		resetVboxColorBackground1();
		resetVboxColorBackground2();
		resetVboxColorBackground3();
		resetVboxColorBackground4();
		resetVboxColorBackground5();
		resetVboxColorBackground6();
		resetVboxColorBackground7();
		resetVboxColorBackground8();
		resetVboxColorBackground9();
		resetVboxColorBackground10();
		changeNumberConfirm.addEventHandler(MouseEvent.MOUSE_CLICKED, e ->{
			this.setElementVisibilityAndReset(mainWinCombobox.getValue());
			hexaRgbButton.setText("Passer en Hexa");		
		});

		this.initialiseTextfieldsEvent();
		hexaRgbButton.setText("Passer en Hexa");
		hexaRgbButton.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(hexaRgbButton.getText().equals("Passer en Hexa")) {
				hexaRgbButton.setText("Passer en RGB");
				this.textFieldToHexa();
			}else {
				hexaRgbButton.setText("Passer en Hexa");
				this.textFieldToRgb();
			}
		});



		converter.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			Alert alertPickerWhite = new Alert(AlertType.WARNING,"Un de vos selecteur de couleur est sur blanc, conversion impossible",ButtonType.OK);
			Alert alertSameColorInPicker = new Alert(AlertType.WARNING,"Vous avez selectionné plusieurs fois la même couleur",ButtonType.OK);

			if(colorPick1.getValue()==Color.WHITE || colorPick1.getValue()==Color.WHITE) {
				alertPickerWhite.showAndWait();
			}else if((h3.isVisible()&& colorPick3.getValue()==Color.WHITE)||(h4.isVisible()&& colorPick4.getValue()==Color.WHITE)||(h5.isVisible()&& colorPick5.getValue()==Color.WHITE)||(h6.isVisible()&& colorPick6.getValue()==Color.WHITE)||(h7.isVisible()&& colorPick7.getValue()==Color.WHITE)||(h8.isVisible()&& colorPick8.getValue()==Color.WHITE)||(h9.isVisible()&& colorPick9.getValue()==Color.WHITE)||(h10.isVisible()&& colorPick10.getValue()==Color.WHITE)) {
				alertPickerWhite.showAndWait();
				//Pour éviter de faire un else if avec une condition enorme qui comprend tous les colorpicker il a été jugé judicieux de le découper en plusieurs else if pour faciliter la lecture
			}else if(colorPick1.getValue().equals(colorPick2.getValue())||colorPick1.getValue().equals(colorPick3.getValue())||colorPick1.getValue().equals(colorPick4.getValue())||colorPick1.getValue().equals(colorPick5.getValue())||colorPick1.getValue().equals(colorPick6.getValue())||colorPick1.getValue().equals(colorPick7.getValue())||colorPick1.getValue().equals(colorPick8.getValue())||colorPick1.getValue().equals(colorPick9.getValue())||colorPick1.getValue().equals(colorPick10.getValue())) {
				System.out.println("ALERTE PICK COLOR 1");
				alertSameColorInPicker.showAndWait();
			}else if(colorPick2.getValue().equals(colorPick3.getValue())||colorPick2.getValue().equals(colorPick4.getValue())||colorPick2.getValue().equals(colorPick5.getValue())||colorPick2.getValue().equals(colorPick6.getValue())||colorPick2.getValue().equals(colorPick7.getValue())||colorPick2.getValue().equals(colorPick8.getValue())||colorPick2.getValue().equals(colorPick9.getValue())||colorPick2.getValue().equals(colorPick10.getValue())) {
				System.out.println("ALERTE PICK COLOR 2");
				alertSameColorInPicker.showAndWait();
			}else if((h3.isVisible())&&(colorPick3.getValue().equals(colorPick4.getValue())||colorPick3.getValue().equals(colorPick5.getValue())||colorPick3.getValue().equals(colorPick6.getValue())||colorPick3.getValue().equals(colorPick7.getValue())||colorPick3.getValue().equals(colorPick8.getValue())||colorPick3.getValue().equals(colorPick9.getValue())||colorPick3.getValue().equals(colorPick10.getValue()))) {
				System.out.println("ALERTE PICK COLOR 3");
				alertSameColorInPicker.showAndWait();
			}else if((h4.isVisible())&&(colorPick4.getValue().equals(colorPick5.getValue())||colorPick4.getValue().equals(colorPick6.getValue())||colorPick4.getValue().equals(colorPick7.getValue())||colorPick4.getValue().equals(colorPick8.getValue())||colorPick4.getValue().equals(colorPick9.getValue())||colorPick4.getValue().equals(colorPick10.getValue()))) {
				alertSameColorInPicker.showAndWait();
			}else if((h5.isVisible())&&(colorPick5.getValue().equals(colorPick6.getValue())||colorPick5.getValue().equals(colorPick7.getValue())||colorPick5.getValue().equals(colorPick8.getValue())||colorPick5.getValue().equals(colorPick9.getValue())||colorPick5.getValue().equals(colorPick10.getValue()))) {
				alertSameColorInPicker.showAndWait();
			}else if((h6.isVisible())&&(colorPick6.getValue().equals(colorPick7.getValue())||colorPick6.getValue().equals(colorPick8.getValue())||colorPick6.getValue().equals(colorPick9.getValue())||colorPick6.getValue().equals(colorPick10.getValue()))) {
				alertSameColorInPicker.showAndWait();
			}else if((h7.isVisible())&&(colorPick7.getValue().equals(colorPick8.getValue())||colorPick7.getValue().equals(colorPick9.getValue())||colorPick7.getValue().equals(colorPick10.getValue()))) {
				alertSameColorInPicker.showAndWait();
			}else if((h8.isVisible())&&(colorPick8.getValue().equals(colorPick9.getValue())||colorPick8.getValue().equals(colorPick10.getValue()))) {
				alertSameColorInPicker.showAndWait();
			}else if((h9.isVisible())&&(colorPick9.getValue().equals(colorPick10.getValue()))) {//les vérifications décroient pour la simple raison qu'on a pas besoin de reverifier si les précedent sont égaux avec celui qu'on test car ca a déja été vérifié dans les else if d'avant
				alertSameColorInPicker.showAndWait();
			}else {
				Map<Integer,Grey> greyMap = Grey.PutInListSorted(colorPick1, colorPick2, colorPick3, colorPick4, colorPick5, colorPick6, colorPick7, colorPick8, colorPick9, colorPick10);
				List<Integer> colorErrorList = Grey.errorlist(greyMap);
				Grey.verifGreatColor(greyMap);

				if(this.hexaRgbButton.getText().equals("Passer en RGB")) {
					hexaRgbButton.setText("Passer en Hexa");
				}
				this.resetTf();
				rightColorVbox1.setBackground(leftColorVbox1.getBackground());
				rightGreyVbox1.setBackground(leftGreyVbox1.getBackground());

				rightColorVbox2.setBackground(leftColorVbox2.getBackground());
				rightGreyVbox2.setBackground(leftGreyVbox2.getBackground());

				rightColorVbox3.setBackground(leftColorVbox3.getBackground());
				rightGreyVbox3.setBackground(leftGreyVbox3.getBackground());

				rightColorVbox4.setBackground(leftColorVbox4.getBackground());
				rightGreyVbox4.setBackground(leftGreyVbox4.getBackground());

				rightColorVbox5.setBackground(leftColorVbox5.getBackground());
				rightGreyVbox5.setBackground(leftGreyVbox5.getBackground());

				rightColorVbox6.setBackground(leftColorVbox6.getBackground());
				rightGreyVbox6.setBackground(leftGreyVbox6.getBackground());

				rightColorVbox7.setBackground(leftColorVbox7.getBackground());
				rightGreyVbox7.setBackground(leftGreyVbox7.getBackground());

				rightColorVbox8.setBackground(leftColorVbox8.getBackground());
				rightGreyVbox8.setBackground(leftGreyVbox8.getBackground());

				rightColorVbox9.setBackground(leftColorVbox9.getBackground());
				rightGreyVbox9.setBackground(leftGreyVbox9.getBackground());

				rightColorVbox10.setBackground(leftColorVbox10.getBackground());
				rightGreyVbox10.setBackground(leftGreyVbox10.getBackground());
				System.out.println(colorErrorList.toString());
				if(vboxConvertedColor1.isVisible()) {				
					if(colorErrorList.contains(1)) {
						Grey[] greyTab = greyMap.get(1).ListGreyLess();
						System.out.println(greyTab[0].toString()+"\n"+greyTab[1].toString()+"\n"+greyTab[2].toString()+"\n"+greyTab[3].toString()+"\n"+greyTab[4].toString()+"\n");
						tfConvertedColor11.setBackground(new Background(new BackgroundFill(new Color(greyTab[0].getRed(), greyTab[0].getGreen(), greyTab[0].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor11.setText((int)(greyTab[0].getRed()*255)+","+(int)(greyTab[0].getGreen()*255)+","+(int)(greyTab[0].getBlue()*255));

						tfConvertedColor12.setBackground(new Background(new BackgroundFill(new Color(greyTab[1].getRed(), greyTab[1].getGreen(), greyTab[1].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor12.setText((int)(greyTab[1].getRed()*255)+","+(int)(greyTab[1].getGreen()*255)+","+(int)(greyTab[1].getBlue()*255));

						tfConvertedColor13.setBackground(new Background(new BackgroundFill(new Color(greyTab[2].getRed(), greyTab[2].getGreen(), greyTab[2].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor13.setText((int)(greyTab[2].getRed()*255)+","+(int)(greyTab[2].getGreen()*255)+","+(int)(greyTab[2].getBlue()*255));

						tfConvertedColor14.setBackground(new Background(new BackgroundFill(new Color(greyTab[3].getRed(), greyTab[3].getGreen(), greyTab[3].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor14.setText((int)(greyTab[3].getRed()*255)+","+(int)(greyTab[3].getGreen()*255)+","+(int)(greyTab[3].getBlue()*255));

						tfConvertedColor15.setBackground(new Background(new BackgroundFill(new Color(greyTab[4].getRed(), greyTab[4].getGreen(), greyTab[4].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor15.setText((int)(greyTab[4].getRed()*255)+","+(int)(greyTab[4].getGreen()*255)+","+(int)(greyTab[4].getBlue()*255));

						if((greyTab[0].getGrey()/255)<0.5 ) {

							tfConvertedColor11.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor11.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[1].getGrey()/255)<0.5) {

							tfConvertedColor12.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor12.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[2].getGrey()/255)<0.5) {

							tfConvertedColor13.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor13.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[3].getGrey()/255)<0.5) {

							tfConvertedColor14.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor14.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[4].getGrey()/255)<0.5) {

							tfConvertedColor15.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor15.setStyle("-fx-text-fill: black;");
						}
					}
				}
				if(vboxConvertedColor2.isVisible()) {
					if(colorErrorList.contains(2)) {
						Grey[] greyTab = greyMap.get(2).ListGreyLess();
						System.out.println(greyTab[0].toString()+"\n"+greyTab[1].toString()+"\n"+greyTab[2].toString()+"\n"+greyTab[3].toString()+"\n"+greyTab[4].toString()+"\n");
						tfConvertedColor21.setBackground(new Background(new BackgroundFill(new Color(greyTab[0].getRed(), greyTab[0].getGreen(), greyTab[0].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor21.setText((int)(greyTab[0].getRed()*255)+","+(int)(greyTab[0].getGreen()*255)+","+(int)(greyTab[0].getBlue()*255));

						tfConvertedColor22.setBackground(new Background(new BackgroundFill(new Color(greyTab[1].getRed(), greyTab[1].getGreen(), greyTab[1].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor22.setText((int)(greyTab[1].getRed()*255)+","+(int)(greyTab[1].getGreen()*255)+","+(int)(greyTab[1].getBlue()*255));

						tfConvertedColor23.setBackground(new Background(new BackgroundFill(new Color(greyTab[2].getRed(), greyTab[2].getGreen(), greyTab[2].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor23.setText((int)(greyTab[2].getRed()*255)+","+(int)(greyTab[2].getGreen()*255)+","+(int)(greyTab[2].getBlue()*255));

						tfConvertedColor24.setBackground(new Background(new BackgroundFill(new Color(greyTab[3].getRed(), greyTab[3].getGreen(), greyTab[3].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor24.setText((int)(greyTab[3].getRed()*255)+","+(int)(greyTab[3].getGreen()*255)+","+(int)(greyTab[3].getBlue()*255));

						tfConvertedColor25.setBackground(new Background(new BackgroundFill(new Color(greyTab[4].getRed(), greyTab[4].getGreen(), greyTab[4].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor25.setText((int)(greyTab[4].getRed()*255)+","+(int)(greyTab[4].getGreen()*255)+","+(int)(greyTab[4].getBlue()*255));

						if((greyTab[0].getGrey()/255)<0.5 ) {

							tfConvertedColor21.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor21.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[1].getGrey()/255)<0.5) {

							tfConvertedColor22.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor22.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[2].getGrey()/255)<0.5) {

							tfConvertedColor23.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor23.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[3].getGrey()/255)<0.5) {

							tfConvertedColor24.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor24.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[4].getGrey()/255)<0.5) {

							tfConvertedColor25.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor25.setStyle("-fx-text-fill: black;");
						}
					}

				}
				if(vboxConvertedColor3.isVisible()) {

					if(colorErrorList.contains(3)) {
						Grey[] greyTab = greyMap.get(3).ListGreyLess();
						System.out.println(greyTab[0].toString()+"\n"+greyTab[1].toString()+"\n"+greyTab[2].toString()+"\n"+greyTab[3].toString()+"\n"+greyTab[4].toString()+"\n");
						tfConvertedColor31.setBackground(new Background(new BackgroundFill(new Color(greyTab[0].getRed(), greyTab[0].getGreen(), greyTab[0].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor31.setText((int)(greyTab[0].getRed()*255)+","+(int)(greyTab[0].getGreen()*255)+","+(int)(greyTab[0].getBlue()*255));

						tfConvertedColor32.setBackground(new Background(new BackgroundFill(new Color(greyTab[1].getRed(), greyTab[1].getGreen(), greyTab[1].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor32.setText((int)(greyTab[1].getRed()*255)+","+(int)(greyTab[1].getGreen()*255)+","+(int)(greyTab[1].getBlue()*255));

						tfConvertedColor33.setBackground(new Background(new BackgroundFill(new Color(greyTab[2].getRed(), greyTab[2].getGreen(), greyTab[2].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor33.setText((int)(greyTab[2].getRed()*255)+","+(int)(greyTab[2].getGreen()*255)+","+(int)(greyTab[2].getBlue()*255));

						tfConvertedColor34.setBackground(new Background(new BackgroundFill(new Color(greyTab[3].getRed(), greyTab[3].getGreen(), greyTab[3].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor34.setText((int)(greyTab[3].getRed()*255)+","+(int)(greyTab[3].getGreen()*255)+","+(int)(greyTab[3].getBlue()*255));

						tfConvertedColor35.setBackground(new Background(new BackgroundFill(new Color(greyTab[4].getRed(), greyTab[4].getGreen(), greyTab[4].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor35.setText((int)(greyTab[4].getRed()*255)+","+(int)(greyTab[4].getGreen()*255)+","+(int)(greyTab[4].getBlue()*255));

						if((greyTab[0].getGrey()/255)<0.5 ) {

							tfConvertedColor31.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor31.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[1].getGrey()/255)<0.5) {

							tfConvertedColor32.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor32.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[2].getGrey()/255)<0.5) {

							tfConvertedColor33.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor33.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[3].getGrey()/255)<0.5) {

							tfConvertedColor34.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor34.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[4].getGrey()/255)<0.5) {

							tfConvertedColor35.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor35.setStyle("-fx-text-fill: black;");
						}
					}

				}
				if(vboxConvertedColor4.isVisible()) {

					if(colorErrorList.contains(4)) {
						Grey[] greyTab = greyMap.get(4).ListGreyLess();
						System.out.println(greyTab[0].toString()+"\n"+greyTab[1].toString()+"\n"+greyTab[2].toString()+"\n"+greyTab[3].toString()+"\n"+greyTab[4].toString()+"\n");
						tfConvertedColor41.setBackground(new Background(new BackgroundFill(new Color(greyTab[0].getRed(), greyTab[0].getGreen(), greyTab[0].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor41.setText((int)(greyTab[0].getRed()*255)+","+(int)(greyTab[0].getGreen()*255)+","+(int)(greyTab[0].getBlue()*255));

						tfConvertedColor42.setBackground(new Background(new BackgroundFill(new Color(greyTab[1].getRed(), greyTab[1].getGreen(), greyTab[1].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor42.setText((int)(greyTab[1].getRed()*255)+","+(int)(greyTab[1].getGreen()*255)+","+(int)(greyTab[1].getBlue()*255));

						tfConvertedColor43.setBackground(new Background(new BackgroundFill(new Color(greyTab[2].getRed(), greyTab[2].getGreen(), greyTab[2].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor43.setText((int)(greyTab[2].getRed()*255)+","+(int)(greyTab[2].getGreen()*255)+","+(int)(greyTab[2].getBlue()*255));

						tfConvertedColor44.setBackground(new Background(new BackgroundFill(new Color(greyTab[3].getRed(), greyTab[3].getGreen(), greyTab[3].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor44.setText((int)(greyTab[3].getRed()*255)+","+(int)(greyTab[3].getGreen()*255)+","+(int)(greyTab[3].getBlue()*255));

						tfConvertedColor45.setBackground(new Background(new BackgroundFill(new Color(greyTab[4].getRed(), greyTab[4].getGreen(), greyTab[4].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor45.setText((int)(greyTab[4].getRed()*255)+","+(int)(greyTab[4].getGreen()*255)+","+(int)(greyTab[4].getBlue()*255));

						if((greyTab[0].getGrey()/255)<0.5 ) {

							tfConvertedColor41.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor41.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[1].getGrey()/255)<0.5) {

							tfConvertedColor42.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor42.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[2].getGrey()/255)<0.5) {

							tfConvertedColor43.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor43.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[3].getGrey()/255)<0.5) {

							tfConvertedColor44.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor44.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[4].getGrey()/255)<0.5) {

							tfConvertedColor45.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor45.setStyle("-fx-text-fill: black;");
						}
					}

				}
				if(vboxConvertedColor5.isVisible()) {

					if(colorErrorList.contains(5)) {
						Grey[] greyTab = greyMap.get(5).ListGreyLess();
						System.out.println(greyTab[0].toString()+"\n"+greyTab[1].toString()+"\n"+greyTab[2].toString()+"\n"+greyTab[3].toString()+"\n"+greyTab[4].toString()+"\n");
						tfConvertedColor51.setBackground(new Background(new BackgroundFill(new Color(greyTab[0].getRed(), greyTab[0].getGreen(), greyTab[0].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor51.setText((int)(greyTab[0].getRed()*255)+","+(int)(greyTab[0].getGreen()*255)+","+(int)(greyTab[0].getBlue()*255));

						tfConvertedColor52.setBackground(new Background(new BackgroundFill(new Color(greyTab[1].getRed(), greyTab[1].getGreen(), greyTab[1].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor52.setText((int)(greyTab[1].getRed()*255)+","+(int)(greyTab[1].getGreen()*255)+","+(int)(greyTab[1].getBlue()*255));

						tfConvertedColor53.setBackground(new Background(new BackgroundFill(new Color(greyTab[2].getRed(), greyTab[2].getGreen(), greyTab[2].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor53.setText((int)(greyTab[2].getRed()*255)+","+(int)(greyTab[2].getGreen()*255)+","+(int)(greyTab[2].getBlue()*255));

						tfConvertedColor54.setBackground(new Background(new BackgroundFill(new Color(greyTab[3].getRed(), greyTab[3].getGreen(), greyTab[3].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor54.setText((int)(greyTab[3].getRed()*255)+","+(int)(greyTab[3].getGreen()*255)+","+(int)(greyTab[3].getBlue()*255));

						tfConvertedColor55.setBackground(new Background(new BackgroundFill(new Color(greyTab[4].getRed(), greyTab[4].getGreen(), greyTab[4].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor55.setText((int)(greyTab[4].getRed()*255)+","+(int)(greyTab[4].getGreen()*255)+","+(int)(greyTab[4].getBlue()*255));

						if((greyTab[0].getGrey()/255)<0.5 ) {

							tfConvertedColor51.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor51.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[1].getGrey()/255)<0.5) {

							tfConvertedColor52.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor52.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[2].getGrey()/255)<0.5) {

							tfConvertedColor53.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor53.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[3].getGrey()/255)<0.5) {

							tfConvertedColor54.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor54.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[4].getGrey()/255)<0.5) {

							tfConvertedColor55.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor55.setStyle("-fx-text-fill: black;");
						}
					}


				}
				if(vboxConvertedColor6.isVisible()) {

					if(colorErrorList.contains(6)) {
						Grey[] greyTab = greyMap.get(6).ListGreyLess();
						System.out.println(greyTab[0].toString()+"\n"+greyTab[1].toString()+"\n"+greyTab[2].toString()+"\n"+greyTab[3].toString()+"\n"+greyTab[4].toString()+"\n");
						tfConvertedColor61.setBackground(new Background(new BackgroundFill(new Color(greyTab[0].getRed(), greyTab[0].getGreen(), greyTab[0].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor61.setText((int)(greyTab[0].getRed()*255)+","+(int)(greyTab[0].getGreen()*255)+","+(int)(greyTab[0].getBlue()*255));

						tfConvertedColor62.setBackground(new Background(new BackgroundFill(new Color(greyTab[1].getRed(), greyTab[1].getGreen(), greyTab[1].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor62.setText((int)(greyTab[1].getRed()*255)+","+(int)(greyTab[1].getGreen()*255)+","+(int)(greyTab[1].getBlue()*255));

						tfConvertedColor63.setBackground(new Background(new BackgroundFill(new Color(greyTab[2].getRed(), greyTab[2].getGreen(), greyTab[2].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor63.setText((int)(greyTab[2].getRed()*255)+","+(int)(greyTab[2].getGreen()*255)+","+(int)(greyTab[2].getBlue()*255));

						tfConvertedColor64.setBackground(new Background(new BackgroundFill(new Color(greyTab[3].getRed(), greyTab[3].getGreen(), greyTab[3].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor64.setText((int)(greyTab[3].getRed()*255)+","+(int)(greyTab[3].getGreen()*255)+","+(int)(greyTab[3].getBlue()*255));

						tfConvertedColor65.setBackground(new Background(new BackgroundFill(new Color(greyTab[4].getRed(), greyTab[4].getGreen(), greyTab[4].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor65.setText((int)(greyTab[4].getRed()*255)+","+(int)(greyTab[4].getGreen()*255)+","+(int)(greyTab[4].getBlue()*255));

						if((greyTab[0].getGrey()/255)<0.5 ) {

							tfConvertedColor61.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor61.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[1].getGrey()/255)<0.5) {

							tfConvertedColor62.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor62.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[2].getGrey()/255)<0.5) {

							tfConvertedColor63.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor63.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[3].getGrey()/255)<0.5) {

							tfConvertedColor64.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor64.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[4].getGrey()/255)<0.5) {

							tfConvertedColor65.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor65.setStyle("-fx-text-fill: black;");
						}
					}


				}
				if(vboxConvertedColor7.isVisible()) {

					if(colorErrorList.contains(7)) {
						Grey[] greyTab = greyMap.get(7).ListGreyLess();
						System.out.println(greyTab[0].toString()+"\n"+greyTab[1].toString()+"\n"+greyTab[2].toString()+"\n"+greyTab[3].toString()+"\n"+greyTab[4].toString()+"\n");
						tfConvertedColor71.setBackground(new Background(new BackgroundFill(new Color(greyTab[0].getRed(), greyTab[0].getGreen(), greyTab[0].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor71.setText((int)(greyTab[0].getRed()*255)+","+(int)(greyTab[0].getGreen()*255)+","+(int)(greyTab[0].getBlue()*255));

						tfConvertedColor72.setBackground(new Background(new BackgroundFill(new Color(greyTab[1].getRed(), greyTab[1].getGreen(), greyTab[1].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor72.setText((int)(greyTab[1].getRed()*255)+","+(int)(greyTab[1].getGreen()*255)+","+(int)(greyTab[1].getBlue()*255));

						tfConvertedColor73.setBackground(new Background(new BackgroundFill(new Color(greyTab[2].getRed(), greyTab[2].getGreen(), greyTab[2].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor73.setText((int)(greyTab[2].getRed()*255)+","+(int)(greyTab[2].getGreen()*255)+","+(int)(greyTab[2].getBlue()*255));

						tfConvertedColor74.setBackground(new Background(new BackgroundFill(new Color(greyTab[3].getRed(), greyTab[3].getGreen(), greyTab[3].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor74.setText((int)(greyTab[3].getRed()*255)+","+(int)(greyTab[3].getGreen()*255)+","+(int)(greyTab[3].getBlue()*255));

						tfConvertedColor75.setBackground(new Background(new BackgroundFill(new Color(greyTab[4].getRed(), greyTab[4].getGreen(), greyTab[4].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor75.setText((int)(greyTab[4].getRed()*255)+","+(int)(greyTab[4].getGreen()*255)+","+(int)(greyTab[4].getBlue()*255));

						if((greyTab[0].getGrey()/255)<0.5 ) {

							tfConvertedColor71.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor71.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[1].getGrey()/255)<0.5) {

							tfConvertedColor72.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor72.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[2].getGrey()/255)<0.5) {

							tfConvertedColor73.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor73.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[3].getGrey()/255)<0.5) {

							tfConvertedColor74.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor74.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[4].getGrey()/255)<0.5) {

							tfConvertedColor75.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor75.setStyle("-fx-text-fill: black;");
						}
					}


				}
				if(vboxConvertedColor8.isVisible()) {

					if(colorErrorList.contains(8)) {
						Grey[] greyTab = greyMap.get(8).ListGreyLess();
						System.out.println(greyTab[0].toString()+"\n"+greyTab[1].toString()+"\n"+greyTab[2].toString()+"\n"+greyTab[3].toString()+"\n"+greyTab[4].toString()+"\n");
						tfConvertedColor81.setBackground(new Background(new BackgroundFill(new Color(greyTab[0].getRed(), greyTab[0].getGreen(), greyTab[0].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor81.setText((int)(greyTab[0].getRed()*255)+","+(int)(greyTab[0].getGreen()*255)+","+(int)(greyTab[0].getBlue()*255));

						tfConvertedColor82.setBackground(new Background(new BackgroundFill(new Color(greyTab[1].getRed(), greyTab[1].getGreen(), greyTab[1].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor82.setText((int)(greyTab[1].getRed()*255)+","+(int)(greyTab[1].getGreen()*255)+","+(int)(greyTab[1].getBlue()*255));

						tfConvertedColor83.setBackground(new Background(new BackgroundFill(new Color(greyTab[2].getRed(), greyTab[2].getGreen(), greyTab[2].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor83.setText((int)(greyTab[2].getRed()*255)+","+(int)(greyTab[2].getGreen()*255)+","+(int)(greyTab[2].getBlue()*255));

						tfConvertedColor84.setBackground(new Background(new BackgroundFill(new Color(greyTab[3].getRed(), greyTab[3].getGreen(), greyTab[3].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor84.setText((int)(greyTab[3].getRed()*255)+","+(int)(greyTab[3].getGreen()*255)+","+(int)(greyTab[3].getBlue()*255));

						tfConvertedColor85.setBackground(new Background(new BackgroundFill(new Color(greyTab[4].getRed(), greyTab[4].getGreen(), greyTab[4].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor85.setText((int)(greyTab[4].getRed()*255)+","+(int)(greyTab[4].getGreen()*255)+","+(int)(greyTab[4].getBlue()*255));

						if((greyTab[0].getGrey()/255)<0.5 ) {

							tfConvertedColor81.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor81.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[1].getGrey()/255)<0.5) {

							tfConvertedColor82.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor82.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[2].getGrey()/255)<0.5) {

							tfConvertedColor83.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor83.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[3].getGrey()/255)<0.5) {

							tfConvertedColor84.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor84.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[4].getGrey()/255)<0.5) {

							tfConvertedColor85.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor85.setStyle("-fx-text-fill: black;");
						}
					}


				}
				if(vboxConvertedColor9.isVisible()) {

					if(colorErrorList.contains(9)) {
						Grey[] greyTab = greyMap.get(9).ListGreyLess();
						System.out.println(greyTab[0].toString()+"\n"+greyTab[1].toString()+"\n"+greyTab[2].toString()+"\n"+greyTab[3].toString()+"\n"+greyTab[4].toString()+"\n");
						tfConvertedColor91.setBackground(new Background(new BackgroundFill(new Color(greyTab[0].getRed(), greyTab[0].getGreen(), greyTab[0].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor91.setText((int)(greyTab[0].getRed()*255)+","+(int)(greyTab[0].getGreen()*255)+","+(int)(greyTab[0].getBlue()*255));

						tfConvertedColor92.setBackground(new Background(new BackgroundFill(new Color(greyTab[1].getRed(), greyTab[1].getGreen(), greyTab[1].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor92.setText((int)(greyTab[1].getRed()*255)+","+(int)(greyTab[1].getGreen()*255)+","+(int)(greyTab[1].getBlue()*255));

						tfConvertedColor93.setBackground(new Background(new BackgroundFill(new Color(greyTab[2].getRed(), greyTab[2].getGreen(), greyTab[2].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor93.setText((int)(greyTab[2].getRed()*255)+","+(int)(greyTab[2].getGreen()*255)+","+(int)(greyTab[2].getBlue()*255));

						tfConvertedColor94.setBackground(new Background(new BackgroundFill(new Color(greyTab[3].getRed(), greyTab[3].getGreen(), greyTab[3].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor94.setText((int)(greyTab[3].getRed()*255)+","+(int)(greyTab[3].getGreen()*255)+","+(int)(greyTab[3].getBlue()*255));

						tfConvertedColor95.setBackground(new Background(new BackgroundFill(new Color(greyTab[4].getRed(), greyTab[4].getGreen(), greyTab[4].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor95.setText((int)(greyTab[4].getRed()*255)+","+(int)(greyTab[4].getGreen()*255)+","+(int)(greyTab[4].getBlue()*255));

						if((greyTab[0].getGrey()/255)<0.5 ) {

							tfConvertedColor91.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor91.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[1].getGrey()/255)<0.5) {

							tfConvertedColor92.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor92.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[2].getGrey()/255)<0.5) {

							tfConvertedColor93.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor93.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[3].getGrey()/255)<0.5) {

							tfConvertedColor94.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor94.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[4].getGrey()/255)<0.5) {

							tfConvertedColor95.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor95.setStyle("-fx-text-fill: black;");
						}
					}


				}
				if(vboxConvertedColor10.isVisible()) {

					if(colorErrorList.contains(10)) {
						Grey[] greyTab = greyMap.get(10).ListGreyLess();
						System.out.println(greyTab[0].toString()+"\n"+greyTab[1].toString()+"\n"+greyTab[2].toString()+"\n"+greyTab[3].toString()+"\n"+greyTab[4].toString()+"\n");
						tfConvertedColor101.setBackground(new Background(new BackgroundFill(new Color(greyTab[0].getRed(), greyTab[0].getGreen(), greyTab[0].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor101.setText((int)(greyTab[0].getRed()*255)+","+(int)(greyTab[0].getGreen()*255)+","+(int)(greyTab[0].getBlue()*255));

						tfConvertedColor102.setBackground(new Background(new BackgroundFill(new Color(greyTab[1].getRed(), greyTab[1].getGreen(), greyTab[1].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor102.setText((int)(greyTab[1].getRed()*255)+","+(int)(greyTab[1].getGreen()*255)+","+(int)(greyTab[1].getBlue()*255));

						tfConvertedColor103.setBackground(new Background(new BackgroundFill(new Color(greyTab[2].getRed(), greyTab[2].getGreen(), greyTab[2].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor103.setText((int)(greyTab[2].getRed()*255)+","+(int)(greyTab[2].getGreen()*255)+","+(int)(greyTab[2].getBlue()*255));

						tfConvertedColor104.setBackground(new Background(new BackgroundFill(new Color(greyTab[3].getRed(), greyTab[3].getGreen(), greyTab[3].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor104.setText((int)(greyTab[3].getRed()*255)+","+(int)(greyTab[3].getGreen()*255)+","+(int)(greyTab[3].getBlue()*255));

						tfConvertedColor105.setBackground(new Background(new BackgroundFill(new Color(greyTab[4].getRed(), greyTab[4].getGreen(), greyTab[4].getBlue(), 1), CornerRadii.EMPTY, Insets.EMPTY)));
						tfConvertedColor105.setText((int)(greyTab[4].getRed()*255)+","+(int)(greyTab[4].getGreen()*255)+","+(int)(greyTab[4].getBlue()*255));

						if((greyTab[0].getGrey()/255)<0.5 ) {

							tfConvertedColor101.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor101.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[1].getGrey()/255)<0.5) {

							tfConvertedColor102.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor102.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[2].getGrey()/255)<0.5) {

							tfConvertedColor103.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor103.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[3].getGrey()/255)<0.5) {

							tfConvertedColor104.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor104.setStyle("-fx-text-fill: black;");
						}
						if((greyTab[4].getGrey()/255)<0.5) {

							tfConvertedColor105.setStyle("-fx-text-fill: white;");
						}else {
							tfConvertedColor105.setStyle("-fx-text-fill: black;");
						}
					}


				}
			}


		});
		helpButton.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			Stage stage = new Stage();
			Parent root2=null;
			FXMLLoader loader = new FXMLLoader();
			URL fxmlFileUrl = getClass().getResource("/Help.fxml");
			if (fxmlFileUrl == null) {
				System.out.println("Impossible de charger le fichier fxml");
				System.exit(-1);
			}
			loader.setLocation(fxmlFileUrl);
			try {
				root2 = loader.load();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			HelpController helpController = loader.getController();
			Scene scene = new Scene(root2);
			stage.setTitle("50 Nuances de Grey | Aide");
			stage.setResizable(false);
			stage.setScene(scene);
			helpController.setComboBoxValue(this.mainWinCombobox.getValue());
			stage.show();
		});
		colorPick1.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				leftColorVbox1.setBackground(new Background(new BackgroundFill(colorPick1.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
				leftGreyVbox1.setBackground(new Background(new BackgroundFill(colorPick1.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));

			}
		});

		colorPick2.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				leftColorVbox2.setBackground(new Background(new BackgroundFill(colorPick2.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
				leftGreyVbox2.setBackground(new Background(new BackgroundFill(colorPick2.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		colorPick3.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				leftColorVbox3.setBackground(new Background(new BackgroundFill(colorPick3.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
				leftGreyVbox3.setBackground(new Background(new BackgroundFill(colorPick3.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		colorPick4.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				leftColorVbox4.setBackground(new Background(new BackgroundFill(colorPick4.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
				leftGreyVbox4.setBackground(new Background(new BackgroundFill(colorPick4.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		colorPick5.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				leftColorVbox5.setBackground(new Background(new BackgroundFill(colorPick5.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
				leftGreyVbox5.setBackground(new Background(new BackgroundFill(colorPick5.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		colorPick6.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				leftColorVbox6.setBackground(new Background(new BackgroundFill(colorPick6.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
				leftGreyVbox6.setBackground(new Background(new BackgroundFill(colorPick6.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		colorPick7.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				leftColorVbox7.setBackground(new Background(new BackgroundFill(colorPick7.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
				leftGreyVbox7.setBackground(new Background(new BackgroundFill(colorPick7.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		colorPick8.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				leftColorVbox8.setBackground(new Background(new BackgroundFill(colorPick8.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
				leftGreyVbox8.setBackground(new Background(new BackgroundFill(colorPick8.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		colorPick9.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				leftColorVbox9.setBackground(new Background(new BackgroundFill(colorPick9.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
				leftGreyVbox9.setBackground(new Background(new BackgroundFill(colorPick9.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		colorPick10.setOnAction(new EventHandler<ActionEvent>() {			
			@Override
			public void handle(ActionEvent event) {			
				leftColorVbox10.setBackground(new Background(new BackgroundFill(colorPick10.getValue(), CornerRadii.EMPTY, Insets.EMPTY)));
				leftGreyVbox10.setBackground(new Background(new BackgroundFill(colorPick10.getValue().grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});

	}
	/**
	 * Transform the TextFields text from RGB to Hexa
	 */
	private void textFieldToHexa() {
		if(((Color)tfConvertedColor11.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor11.setText("#"+ tfConvertedColor11.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor12.setText("#"+ tfConvertedColor12.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor13.setText("#"+ tfConvertedColor13.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor14.setText("#"+ tfConvertedColor14.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor15.setText("#"+ tfConvertedColor15.getBackground().getFills().get(0).getFill().toString().substring(2,8));

		}

		if(((Color)tfConvertedColor21.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor21.setText("#"+ tfConvertedColor21.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor22.setText("#"+ tfConvertedColor22.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor23.setText("#"+ tfConvertedColor23.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor24.setText("#"+ tfConvertedColor24.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor25.setText("#"+ tfConvertedColor25.getBackground().getFills().get(0).getFill().toString().substring(2,8));

		}

		if(((Color)tfConvertedColor31.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor31.setText("#"+ tfConvertedColor31.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor32.setText("#"+ tfConvertedColor32.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor33.setText("#"+ tfConvertedColor33.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor34.setText("#"+ tfConvertedColor34.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor35.setText("#"+ tfConvertedColor35.getBackground().getFills().get(0).getFill().toString().substring(2,8));
		}

		if(((Color)tfConvertedColor41.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor41.setText("#"+ tfConvertedColor41.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor42.setText("#"+ tfConvertedColor42.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor43.setText("#"+ tfConvertedColor43.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor44.setText("#"+ tfConvertedColor44.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor45.setText("#"+ tfConvertedColor45.getBackground().getFills().get(0).getFill().toString().substring(2,8));

		}

		if(((Color)tfConvertedColor51.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor51.setText("#"+ tfConvertedColor51.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor52.setText("#"+ tfConvertedColor52.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor53.setText("#"+ tfConvertedColor53.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor54.setText("#"+ tfConvertedColor54.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor55.setText("#"+ tfConvertedColor55.getBackground().getFills().get(0).getFill().toString().substring(2,8));

		}

		if(((Color)tfConvertedColor61.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor61.setText("#"+ tfConvertedColor61.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor62.setText("#"+ tfConvertedColor62.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor63.setText("#"+ tfConvertedColor63.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor64.setText("#"+ tfConvertedColor64.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor65.setText("#"+ tfConvertedColor65.getBackground().getFills().get(0).getFill().toString().substring(2,8));

		}

		if(((Color)tfConvertedColor71.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor71.setText("#"+ tfConvertedColor71.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor72.setText("#"+ tfConvertedColor72.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor73.setText("#"+ tfConvertedColor73.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor74.setText("#"+ tfConvertedColor74.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor75.setText("#"+ tfConvertedColor75.getBackground().getFills().get(0).getFill().toString().substring(2,8));

		}


		if(((Color)tfConvertedColor81.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor81.setText("#"+ tfConvertedColor81.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor82.setText("#"+ tfConvertedColor82.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor83.setText("#"+ tfConvertedColor83.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor84.setText("#"+ tfConvertedColor84.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor85.setText("#"+ tfConvertedColor85.getBackground().getFills().get(0).getFill().toString().substring(2,8));

		}

		if(((Color)tfConvertedColor91.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor91.setText("#"+ tfConvertedColor91.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor92.setText("#"+ tfConvertedColor92.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor93.setText("#"+ tfConvertedColor93.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor94.setText("#"+ tfConvertedColor94.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor95.setText("#"+ tfConvertedColor95.getBackground().getFills().get(0).getFill().toString().substring(2,8));

		}


		if(((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor101.setText("#"+ tfConvertedColor101.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor102.setText("#"+ tfConvertedColor102.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor103.setText("#"+ tfConvertedColor103.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor104.setText("#"+ tfConvertedColor104.getBackground().getFills().get(0).getFill().toString().substring(2,8));
			tfConvertedColor105.setText("#"+ tfConvertedColor105.getBackground().getFills().get(0).getFill().toString().substring(2,8));
		}

	}

	/**
	 * Transform the TextFields text from  Hexa to RGB
	 */
	private void textFieldToRgb() {
		if(((Color)tfConvertedColor11.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor11.setText((int) (((Color)tfConvertedColor11.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor11.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor11.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor12.setText((int) (((Color)tfConvertedColor12.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor12.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor12.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor13.setText((int) (((Color)tfConvertedColor13.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor13.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor13.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor14.setText((int) (((Color)tfConvertedColor14.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor14.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor14.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor15.setText((int) (((Color)tfConvertedColor15.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor15.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor15.getBackground().getFills().get(0).getFill()).getBlue()*255));
		}

		if(((Color)tfConvertedColor21.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor21.setText((int) (((Color)tfConvertedColor21.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor21.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor21.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor22.setText((int) (((Color)tfConvertedColor22.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor22.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor22.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor23.setText((int) (((Color)tfConvertedColor23.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor23.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor23.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor24.setText((int) (((Color)tfConvertedColor24.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor24.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor24.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor25.setText((int) (((Color)tfConvertedColor25.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor25.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor25.getBackground().getFills().get(0).getFill()).getBlue()*255));

		}

		if(((Color)tfConvertedColor31.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor31.setText((int) (((Color)tfConvertedColor31.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor31.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor31.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor32.setText((int) (((Color)tfConvertedColor32.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor32.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor32.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor33.setText((int) (((Color)tfConvertedColor33.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor33.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor33.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor34.setText((int) (((Color)tfConvertedColor34.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor34.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor34.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor35.setText((int) (((Color)tfConvertedColor35.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor35.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor35.getBackground().getFills().get(0).getFill()).getBlue()*255));

		}

		if(((Color)tfConvertedColor41.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor41.setText((int) (((Color)tfConvertedColor41.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor41.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor41.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor42.setText((int) (((Color)tfConvertedColor42.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor42.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor42.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor43.setText((int) (((Color)tfConvertedColor43.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor43.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor43.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor44.setText((int) (((Color)tfConvertedColor44.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor44.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor44.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor45.setText((int) (((Color)tfConvertedColor45.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor45.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor45.getBackground().getFills().get(0).getFill()).getBlue()*255));

		}

		if(((Color)tfConvertedColor51.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor51.setText((int) (((Color)tfConvertedColor51.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor51.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor51.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor52.setText((int) (((Color)tfConvertedColor52.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor52.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor52.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor53.setText((int) (((Color)tfConvertedColor53.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor53.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor53.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor54.setText((int) (((Color)tfConvertedColor54.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor54.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor54.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor55.setText((int) (((Color)tfConvertedColor55.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor55.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor55.getBackground().getFills().get(0).getFill()).getBlue()*255));

		}

		if(((Color)tfConvertedColor61.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor61.setText((int) (((Color)tfConvertedColor61.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor61.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor61.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor62.setText((int) (((Color)tfConvertedColor62.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor62.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor62.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor63.setText((int) (((Color)tfConvertedColor63.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor63.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor63.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor64.setText((int) (((Color)tfConvertedColor64.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor64.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor64.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor65.setText((int) (((Color)tfConvertedColor65.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor65.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor65.getBackground().getFills().get(0).getFill()).getBlue()*255));

		}

		if(((Color)tfConvertedColor71.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor71.setText((int) (((Color)tfConvertedColor71.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor71.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor71.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor72.setText((int) (((Color)tfConvertedColor72.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor72.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor72.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor73.setText((int) (((Color)tfConvertedColor73.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor73.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor73.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor74.setText((int) (((Color)tfConvertedColor74.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor74.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor74.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor75.setText((int) (((Color)tfConvertedColor75.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor75.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor75.getBackground().getFills().get(0).getFill()).getBlue()*255));

		}

		if(((Color)tfConvertedColor81.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor81.setText((int) (((Color)tfConvertedColor81.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor81.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor81.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor82.setText((int) (((Color)tfConvertedColor82.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor82.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor82.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor83.setText((int) (((Color)tfConvertedColor83.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor83.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor83.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor84.setText((int) (((Color)tfConvertedColor84.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor84.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor84.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor85.setText((int) (((Color)tfConvertedColor85.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor85.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor85.getBackground().getFills().get(0).getFill()).getBlue()*255));

		}

		if(((Color)tfConvertedColor91.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor91.setText((int) (((Color)tfConvertedColor91.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor91.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor91.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor92.setText((int) (((Color)tfConvertedColor92.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor92.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor92.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor93.setText((int) (((Color)tfConvertedColor93.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor93.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor93.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor94.setText((int) (((Color)tfConvertedColor94.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor94.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor94.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor95.setText((int) (((Color)tfConvertedColor95.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor95.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor95.getBackground().getFills().get(0).getFill()).getBlue()*255));

		}

		if(((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
			tfConvertedColor101.setText((int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor102.setText((int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor103.setText((int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor104.setText((int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getBlue()*255));
			tfConvertedColor105.setText((int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getRed()*255)+","+(int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getGreen()*255)+","+(int) (((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).getBlue()*255));	
		}

	}
	/**
	 * reset all the TextFields (set background to white, text to null and text color ton black)
	 */
	public void resetTf() {

		tfConvertedColor11.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor11.setText("");
		tfConvertedColor11.setStyle("-fx-text-fill: black;");
		tfConvertedColor12.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor12.setText("");
		tfConvertedColor12.setStyle("-fx-text-fill: black;");
		tfConvertedColor13.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor13.setText("");
		tfConvertedColor13.setStyle("-fx-text-fill: black;");
		tfConvertedColor14.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor14.setText("");
		tfConvertedColor14.setStyle("-fx-text-fill: black;");
		tfConvertedColor15.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor15.setText("");
		tfConvertedColor15.setStyle("-fx-text-fill: black;");


		tfConvertedColor21.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor21.setText("");
		tfConvertedColor21.setStyle("-fx-text-fill: black;");
		tfConvertedColor22.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor22.setText("");
		tfConvertedColor22.setStyle("-fx-text-fill: black;");
		tfConvertedColor23.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor23.setText("");
		tfConvertedColor23.setStyle("-fx-text-fill: black;");
		tfConvertedColor24.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor24.setText("");
		tfConvertedColor24.setStyle("-fx-text-fill: black;");
		tfConvertedColor25.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor25.setText("");
		tfConvertedColor25.setStyle("-fx-text-fill: black;");

		tfConvertedColor31.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor31.setText("");
		tfConvertedColor31.setStyle("-fx-text-fill: black;");
		tfConvertedColor32.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor32.setText("");
		tfConvertedColor32.setStyle("-fx-text-fill: black;");
		tfConvertedColor33.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor33.setText("");
		tfConvertedColor33.setStyle("-fx-text-fill: black;");
		tfConvertedColor34.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor34.setText("");
		tfConvertedColor34.setStyle("-fx-text-fill: black;");
		tfConvertedColor35.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor35.setText("");
		tfConvertedColor35.setStyle("-fx-text-fill: black;");


		tfConvertedColor41.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor41.setText("");
		tfConvertedColor41.setStyle("-fx-text-fill: black;");
		tfConvertedColor42.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor42.setText("");
		tfConvertedColor42.setStyle("-fx-text-fill: black;");
		tfConvertedColor43.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor43.setText("");
		tfConvertedColor43.setStyle("-fx-text-fill: black;");
		tfConvertedColor44.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor44.setText("");
		tfConvertedColor44.setStyle("-fx-text-fill: black;");
		tfConvertedColor45.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor45.setText("");
		tfConvertedColor45.setStyle("-fx-text-fill: black;");

		tfConvertedColor51.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor51.setText("");
		tfConvertedColor51.setStyle("-fx-text-fill: black;");
		tfConvertedColor52.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor52.setText("");
		tfConvertedColor52.setStyle("-fx-text-fill: black;");
		tfConvertedColor53.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor53.setText("");
		tfConvertedColor53.setStyle("-fx-text-fill: black;");
		tfConvertedColor54.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor54.setText("");
		tfConvertedColor54.setStyle("-fx-text-fill: black;");
		tfConvertedColor55.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor55.setText("");
		tfConvertedColor55.setStyle("-fx-text-fill: black;");


		tfConvertedColor61.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor61.setText("");
		tfConvertedColor61.setStyle("-fx-text-fill: black;");
		tfConvertedColor62.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor62.setText("");
		tfConvertedColor62.setStyle("-fx-text-fill: black;");
		tfConvertedColor63.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor63.setText("");
		tfConvertedColor63.setStyle("-fx-text-fill: black;");
		tfConvertedColor64.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor64.setText("");
		tfConvertedColor64.setStyle("-fx-text-fill: black;");
		tfConvertedColor65.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor65.setText("");
		tfConvertedColor65.setStyle("-fx-text-fill: black;");


		tfConvertedColor71.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor71.setText("");
		tfConvertedColor71.setStyle("-fx-text-fill: black;");
		tfConvertedColor72.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor72.setText("");
		tfConvertedColor72.setStyle("-fx-text-fill: black;");
		tfConvertedColor73.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor73.setText("");
		tfConvertedColor73.setStyle("-fx-text-fill: black;");
		tfConvertedColor74.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor74.setText("");
		tfConvertedColor74.setStyle("-fx-text-fill: black;");
		tfConvertedColor75.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor75.setText("");
		tfConvertedColor75.setStyle("-fx-text-fill: black;");


		tfConvertedColor81.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor81.setText("");
		tfConvertedColor81.setStyle("-fx-text-fill: black;");
		tfConvertedColor82.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor82.setText("");
		tfConvertedColor82.setStyle("-fx-text-fill: black;");
		tfConvertedColor83.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor83.setText("");
		tfConvertedColor83.setStyle("-fx-text-fill: black;");
		tfConvertedColor84.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor84.setText("");
		tfConvertedColor84.setStyle("-fx-text-fill: black;");
		tfConvertedColor85.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor85.setText("");
		tfConvertedColor85.setStyle("-fx-text-fill: black;");


		tfConvertedColor91.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor91.setText("");
		tfConvertedColor91.setStyle("-fx-text-fill: black;");
		tfConvertedColor92.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor92.setText("");
		tfConvertedColor92.setStyle("-fx-text-fill: black;");
		tfConvertedColor93.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor93.setText("");
		tfConvertedColor93.setStyle("-fx-text-fill: black;");
		tfConvertedColor94.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor94.setText("");
		tfConvertedColor94.setStyle("-fx-text-fill: black;");
		tfConvertedColor95.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor95.setText("");
		tfConvertedColor95.setStyle("-fx-text-fill: black;");

		tfConvertedColor101.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor101.setText("");
		tfConvertedColor101.setStyle("-fx-text-fill: black;");
		tfConvertedColor102.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor102.setText("");
		tfConvertedColor102.setStyle("-fx-text-fill: black;");
		tfConvertedColor103.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor103.setText("");
		tfConvertedColor103.setStyle("-fx-text-fill: black;");
		tfConvertedColor104.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor104.setText("");
		tfConvertedColor104.setStyle("-fx-text-fill: black;");
		tfConvertedColor105.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		tfConvertedColor105.setText("");
		tfConvertedColor105.setStyle("-fx-text-fill: black;");


	}
	/**
	 * Change the visibility of elements and reset all color to white
	 * @param colorNumber used for know wich box need to be visible
	 */
	public void setElementVisibilityAndReset(int colorNumber) {
		resetVboxColorBackground1();
		resetVboxColorBackground2();
		resetVboxColorBackground3();
		resetVboxColorBackground4();
		resetVboxColorBackground5();
		resetVboxColorBackground6();
		resetVboxColorBackground7();
		resetVboxColorBackground8();
		resetVboxColorBackground9();
		resetVboxColorBackground10();
		this.resetTf();
		colorPick1.valueProperty().set(Color.WHITE);
		colorPick2.valueProperty().set(Color.WHITE);
		colorPick3.valueProperty().set(Color.WHITE);
		colorPick4.valueProperty().set(Color.WHITE);
		colorPick5.valueProperty().set(Color.WHITE);
		colorPick6.valueProperty().set(Color.WHITE);
		colorPick7.valueProperty().set(Color.WHITE);
		colorPick8.valueProperty().set(Color.WHITE);
		colorPick9.valueProperty().set(Color.WHITE);
		colorPick10.valueProperty().set(Color.WHITE);
		leftColorVbox1.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftColorVbox2.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftColorVbox3.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftColorVbox4.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftColorVbox5.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftColorVbox6.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftColorVbox7.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftColorVbox8.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftColorVbox9.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftColorVbox10.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox1.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox2.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox3.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox4.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox5.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox6.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox7.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox8.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox9.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox10.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

		rightColorVbox1.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightColorVbox2.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightColorVbox3.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightColorVbox4.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightColorVbox5.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightColorVbox6.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightColorVbox7.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightColorVbox8.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightColorVbox9.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightColorVbox10.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

		leftGreyVbox1.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox2.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox3.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox4.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox5.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox6.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox7.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox8.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox9.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		leftGreyVbox10.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

		rightGreyVbox1.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightGreyVbox2.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightGreyVbox3.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightGreyVbox4.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightGreyVbox5.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightGreyVbox6.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightGreyVbox7.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightGreyVbox8.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightGreyVbox9.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		rightGreyVbox10.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

		switch (colorNumber) {	
		case 2:

			h3.setVisible(false);
			h4.setVisible(false);			
			h5.setVisible(false);
			h6.setVisible(false);
			h7.setVisible(false);
			h8.setVisible(false);
			h9.setVisible(false);
			h10.setVisible(false);
			leftLabel3.setVisible(false);
			leftLabel4.setVisible(false);
			leftLabel5.setVisible(false);
			leftLabel6.setVisible(false);
			leftLabel7.setVisible(false);
			leftLabel8.setVisible(false);
			leftLabel9.setVisible(false);
			leftLabel10.setVisible(false);

			rightLabel3.setVisible(false);
			rightLabel4.setVisible(false);
			rightLabel5.setVisible(false);
			rightLabel6.setVisible(false);
			rightLabel7.setVisible(false);
			rightLabel8.setVisible(false);
			rightLabel9.setVisible(false);
			rightLabel10.setVisible(false);

			vboxConvertedColor3.setVisible(false);
			vboxConvertedColor4.setVisible(false);
			vboxConvertedColor5.setVisible(false);
			vboxConvertedColor6.setVisible(false);
			vboxConvertedColor7.setVisible(false);
			vboxConvertedColor8.setVisible(false);
			vboxConvertedColor9.setVisible(false);
			vboxConvertedColor10.setVisible(false);

			break;
		case 3:
			h3.setVisible(true);
			h4.setVisible(false);			
			h5.setVisible(false);
			h6.setVisible(false);
			h7.setVisible(false);
			h8.setVisible(false);
			h9.setVisible(false);
			h10.setVisible(false);

			leftLabel3.setVisible(true);
			leftLabel4.setVisible(false);
			leftLabel5.setVisible(false);
			leftLabel6.setVisible(false);
			leftLabel7.setVisible(false);
			leftLabel8.setVisible(false);
			leftLabel9.setVisible(false);
			leftLabel10.setVisible(false);


			rightLabel3.setVisible(true);
			rightLabel4.setVisible(false);
			rightLabel5.setVisible(false);
			rightLabel6.setVisible(false);
			rightLabel7.setVisible(false);
			rightLabel8.setVisible(false);
			rightLabel9.setVisible(false);
			rightLabel10.setVisible(false);
			vboxConvertedColor3.setVisible(true);
			vboxConvertedColor4.setVisible(false);
			vboxConvertedColor5.setVisible(false);
			vboxConvertedColor6.setVisible(false);
			vboxConvertedColor7.setVisible(false);
			vboxConvertedColor8.setVisible(false);
			vboxConvertedColor9.setVisible(false);
			vboxConvertedColor10.setVisible(false);
			break;
		case 4:
			h3.setVisible(true);
			h4.setVisible(true);			
			h5.setVisible(false);
			h6.setVisible(false);
			h7.setVisible(false);
			h8.setVisible(false);
			h9.setVisible(false);
			h10.setVisible(false);

			leftLabel3.setVisible(true);
			leftLabel4.setVisible(true);
			leftLabel5.setVisible(false);
			leftLabel6.setVisible(false);
			leftLabel7.setVisible(false);
			leftLabel8.setVisible(false);
			leftLabel9.setVisible(false);
			leftLabel10.setVisible(false);


			rightLabel3.setVisible(true);
			rightLabel4.setVisible(true);
			rightLabel5.setVisible(false);
			rightLabel6.setVisible(false);
			rightLabel7.setVisible(false);
			rightLabel8.setVisible(false);
			rightLabel9.setVisible(false);
			rightLabel10.setVisible(false);
			vboxConvertedColor3.setVisible(true);
			vboxConvertedColor4.setVisible(true);
			vboxConvertedColor5.setVisible(false);
			vboxConvertedColor6.setVisible(false);
			vboxConvertedColor7.setVisible(false);
			vboxConvertedColor8.setVisible(false);
			vboxConvertedColor9.setVisible(false);
			vboxConvertedColor10.setVisible(false);
			break;
		case 5:
			h3.setVisible(true);
			h4.setVisible(true);			
			h5.setVisible(true);
			h6.setVisible(false);
			h7.setVisible(false);
			h8.setVisible(false);
			h9.setVisible(false);
			h10.setVisible(false);


			leftLabel3.setVisible(true);
			leftLabel4.setVisible(true);
			leftLabel5.setVisible(true);
			leftLabel6.setVisible(false);
			leftLabel7.setVisible(false);
			leftLabel8.setVisible(false);
			leftLabel9.setVisible(false);
			leftLabel10.setVisible(false);


			rightLabel3.setVisible(true);
			rightLabel4.setVisible(true);
			rightLabel5.setVisible(true);
			rightLabel6.setVisible(false);
			rightLabel7.setVisible(false);
			rightLabel8.setVisible(false);
			rightLabel9.setVisible(false);
			rightLabel10.setVisible(false);

			vboxConvertedColor3.setVisible(true);
			vboxConvertedColor4.setVisible(true);
			vboxConvertedColor5.setVisible(true);
			vboxConvertedColor6.setVisible(false);
			vboxConvertedColor7.setVisible(false);
			vboxConvertedColor8.setVisible(false);
			vboxConvertedColor9.setVisible(false);
			vboxConvertedColor10.setVisible(false);
			break;
		case 6:
			h3.setVisible(true);
			h4.setVisible(true);			
			h5.setVisible(true);
			h6.setVisible(true);
			h7.setVisible(false);
			h8.setVisible(false);
			h9.setVisible(false);
			h10.setVisible(false);


			leftLabel3.setVisible(true);
			leftLabel4.setVisible(true);
			leftLabel5.setVisible(true);
			leftLabel6.setVisible(true);
			leftLabel7.setVisible(false);
			leftLabel8.setVisible(false);
			leftLabel9.setVisible(false);
			leftLabel10.setVisible(false);


			rightLabel3.setVisible(true);
			rightLabel4.setVisible(true);
			rightLabel5.setVisible(true);
			rightLabel6.setVisible(true);
			rightLabel7.setVisible(false);
			rightLabel8.setVisible(false);
			rightLabel9.setVisible(false);
			rightLabel10.setVisible(false);

			vboxConvertedColor3.setVisible(true);
			vboxConvertedColor4.setVisible(true);
			vboxConvertedColor5.setVisible(true);
			vboxConvertedColor6.setVisible(true);
			vboxConvertedColor7.setVisible(false);
			vboxConvertedColor8.setVisible(false);
			vboxConvertedColor9.setVisible(false);
			vboxConvertedColor10.setVisible(false);
			break;
		case 7:
			h3.setVisible(true);
			h4.setVisible(true);			
			h5.setVisible(true);
			h6.setVisible(true);
			h7.setVisible(true);
			h8.setVisible(false);
			h9.setVisible(false);
			h10.setVisible(false);


			leftLabel3.setVisible(true);
			leftLabel4.setVisible(true);
			leftLabel5.setVisible(true);
			leftLabel6.setVisible(true);
			leftLabel7.setVisible(true);
			leftLabel8.setVisible(false);
			leftLabel9.setVisible(false);
			leftLabel10.setVisible(false);


			rightLabel3.setVisible(true);
			rightLabel4.setVisible(true);
			rightLabel5.setVisible(true);
			rightLabel6.setVisible(true);
			rightLabel7.setVisible(true);
			rightLabel8.setVisible(false);
			rightLabel9.setVisible(false);
			rightLabel10.setVisible(false);

			vboxConvertedColor3.setVisible(true);
			vboxConvertedColor4.setVisible(true);
			vboxConvertedColor5.setVisible(true);
			vboxConvertedColor6.setVisible(true);
			vboxConvertedColor7.setVisible(true);
			vboxConvertedColor8.setVisible(false);
			vboxConvertedColor9.setVisible(false);
			vboxConvertedColor10.setVisible(false);
			break;
		case 8:
			h3.setVisible(true);
			h4.setVisible(true);			
			h5.setVisible(true);
			h6.setVisible(true);
			h7.setVisible(true);
			h8.setVisible(true);
			h9.setVisible(false);
			h10.setVisible(false);


			leftLabel3.setVisible(true);
			leftLabel4.setVisible(true);
			leftLabel5.setVisible(true);
			leftLabel6.setVisible(true);
			leftLabel7.setVisible(true);
			leftLabel8.setVisible(true);
			leftLabel9.setVisible(false);
			leftLabel10.setVisible(false);


			rightLabel3.setVisible(true);
			rightLabel4.setVisible(true);
			rightLabel5.setVisible(true);
			rightLabel6.setVisible(true);
			rightLabel7.setVisible(true);
			rightLabel8.setVisible(true);
			rightLabel9.setVisible(false);
			rightLabel10.setVisible(false);

			vboxConvertedColor3.setVisible(true);
			vboxConvertedColor4.setVisible(true);
			vboxConvertedColor5.setVisible(true);
			vboxConvertedColor6.setVisible(true);
			vboxConvertedColor7.setVisible(true);
			vboxConvertedColor8.setVisible(true);
			vboxConvertedColor9.setVisible(false);
			vboxConvertedColor10.setVisible(false);
			break;
		case 9:
			h3.setVisible(true);
			h4.setVisible(true);			
			h5.setVisible(true);
			h6.setVisible(true);
			h7.setVisible(true);
			h8.setVisible(true);
			h9.setVisible(true);
			h10.setVisible(false);


			leftLabel3.setVisible(true);
			leftLabel4.setVisible(true);
			leftLabel5.setVisible(true);
			leftLabel6.setVisible(true);
			leftLabel7.setVisible(true);
			leftLabel8.setVisible(true);
			leftLabel9.setVisible(true);
			leftLabel10.setVisible(false);


			rightLabel3.setVisible(true);
			rightLabel4.setVisible(true);
			rightLabel5.setVisible(true);
			rightLabel6.setVisible(true);
			rightLabel7.setVisible(true);
			rightLabel8.setVisible(true);
			rightLabel9.setVisible(true);
			rightLabel10.setVisible(false);

			vboxConvertedColor3.setVisible(true);
			vboxConvertedColor4.setVisible(true);
			vboxConvertedColor5.setVisible(true);
			vboxConvertedColor6.setVisible(true);
			vboxConvertedColor7.setVisible(true);
			vboxConvertedColor8.setVisible(true);
			vboxConvertedColor9.setVisible(true);
			vboxConvertedColor10.setVisible(false);
			break;
		case 10:
			h3.setVisible(true);
			h4.setVisible(true);			
			h5.setVisible(true);
			h6.setVisible(true);
			h7.setVisible(true);
			h8.setVisible(true);
			h9.setVisible(true);
			h10.setVisible(true);


			leftLabel3.setVisible(true);
			leftLabel4.setVisible(true);
			leftLabel5.setVisible(true);
			leftLabel6.setVisible(true);
			leftLabel7.setVisible(true);
			leftLabel8.setVisible(true);
			leftLabel9.setVisible(true);
			leftLabel10.setVisible(true);


			rightLabel3.setVisible(true);
			rightLabel4.setVisible(true);
			rightLabel5.setVisible(true);
			rightLabel6.setVisible(true);
			rightLabel7.setVisible(true);
			rightLabel8.setVisible(true);
			rightLabel9.setVisible(true);
			rightLabel10.setVisible(true);

			vboxConvertedColor3.setVisible(true);
			vboxConvertedColor4.setVisible(true);
			vboxConvertedColor5.setVisible(true);
			vboxConvertedColor6.setVisible(true);
			vboxConvertedColor7.setVisible(true);
			vboxConvertedColor8.setVisible(true);
			vboxConvertedColor9.setVisible(true);
			vboxConvertedColor10.setVisible(true);
			break;		
		}
	}
	/**
	 * Serving to set the combobox value to the value selected in the First window
	 * @param val the value selected previously and set to the main window
	 */
	void setComboBoxValue(int val) {
		this.mainWinCombobox.setValue(val);
	}
	/**
	 * delegated method for all TextField EventHandler initialisation
	 */
	private void initialiseTextfieldsEvent() {
		tfConvertedColor11.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor11.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox1.setBackground(tfConvertedColor11.getBackground());						
				rightGreyVbox1.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor11.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground1();
				vboxConvertedColor11.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor12.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor12.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox1.setBackground(tfConvertedColor12.getBackground());				
				rightGreyVbox1.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor12.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground1();
				vboxConvertedColor12.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor13.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor13.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox1.setBackground(tfConvertedColor13.getBackground());			
				rightGreyVbox1.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor13.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground1();
				vboxConvertedColor13.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor14.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor14.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox1.setBackground(tfConvertedColor14.getBackground());			
				rightGreyVbox1.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor14.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground1();
				vboxConvertedColor14.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor15.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor15.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox1.setBackground(tfConvertedColor15.getBackground());			
				rightGreyVbox1.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor15.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground1();
				vboxConvertedColor15.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});

		
		tfConvertedColor21.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor21.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox2.setBackground(tfConvertedColor21.getBackground());			
				rightGreyVbox2.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor21.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground2();
				vboxConvertedColor21.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor22.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor22.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox2.setBackground(tfConvertedColor22.getBackground());			
				rightGreyVbox2.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor22.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground2();
				vboxConvertedColor22.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor23.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor23.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox2.setBackground(tfConvertedColor23.getBackground());				
				rightGreyVbox2.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor23.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground2();
				vboxConvertedColor23.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor24.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor24.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox2.setBackground(tfConvertedColor24.getBackground());			
				rightGreyVbox2.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor24.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground2();
				vboxConvertedColor24.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor25.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor25.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox2.setBackground(tfConvertedColor25.getBackground());			
				rightGreyVbox2.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor25.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground2();
				vboxConvertedColor25.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});

		tfConvertedColor31.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor31.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox3.setBackground(tfConvertedColor31.getBackground());			
				rightGreyVbox3.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor31.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground3();
				vboxConvertedColor31.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor32.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor32.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox3.setBackground(tfConvertedColor32.getBackground());			
				rightGreyVbox3.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor32.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground3();
				vboxConvertedColor32.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));			
			}
		});
		tfConvertedColor33.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor33.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox3.setBackground(tfConvertedColor33.getBackground());			
				rightGreyVbox3.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor33.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground3();
				vboxConvertedColor33.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor34.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor34.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox3.setBackground(tfConvertedColor34.getBackground());			
				rightGreyVbox3.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor34.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground3();
				vboxConvertedColor34.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor35.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor35.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox3.setBackground(tfConvertedColor35.getBackground());			
				rightGreyVbox3.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor35.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground3();
				vboxConvertedColor35.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});

		
		tfConvertedColor41.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor41.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox4.setBackground(tfConvertedColor41.getBackground());			
				rightGreyVbox4.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor41.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground4();
				vboxConvertedColor41.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor42.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor42.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox4.setBackground(tfConvertedColor42.getBackground());			
				rightGreyVbox4.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor42.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground4();
				vboxConvertedColor42.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor43.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor43.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox4.setBackground(tfConvertedColor43.getBackground());			
				rightGreyVbox4.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor43.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground4();
				vboxConvertedColor43.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor44.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor44.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox4.setBackground(tfConvertedColor44.getBackground());			
				rightGreyVbox4.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor44.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground4();
				vboxConvertedColor44.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor45.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor45.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox4.setBackground(tfConvertedColor45.getBackground());			
				rightGreyVbox4.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor45.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground4();
				vboxConvertedColor45.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});


		tfConvertedColor51.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor51.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox5.setBackground(tfConvertedColor51.getBackground());			
				rightGreyVbox5.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor51.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground5();
				vboxConvertedColor51.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor52.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor52.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox5.setBackground(tfConvertedColor52.getBackground());			
				rightGreyVbox5.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor52.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground5();
				vboxConvertedColor52.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor53.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor53.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox5.setBackground(tfConvertedColor53.getBackground());			
				rightGreyVbox5.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor53.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground5();
				vboxConvertedColor53.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor54.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor54.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox5.setBackground(tfConvertedColor54.getBackground());			
				rightGreyVbox5.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor54.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground5();
				vboxConvertedColor54.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor55.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor55.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox5.setBackground(tfConvertedColor55.getBackground());			
				rightGreyVbox5.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor55.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground5();
				vboxConvertedColor55.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});


		tfConvertedColor61.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor61.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox6.setBackground(tfConvertedColor61.getBackground());				
				rightGreyVbox6.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor61.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground6();
				vboxConvertedColor61.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor62.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor62.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox6.setBackground(tfConvertedColor62.getBackground());			
				rightGreyVbox6.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor62.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground6();
				vboxConvertedColor62.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor63.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor63.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox6.setBackground(tfConvertedColor63.getBackground());			
				rightGreyVbox6.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor63.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground6();
				vboxConvertedColor63.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor64.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor64.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox6.setBackground(tfConvertedColor64.getBackground());		
				rightGreyVbox6.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor64.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground6();
				vboxConvertedColor64.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor65.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor65.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox6.setBackground(tfConvertedColor65.getBackground());			
				rightGreyVbox6.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor65.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground6();
				vboxConvertedColor65.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});

		tfConvertedColor71.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor71.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox7.setBackground(tfConvertedColor71.getBackground());			
				rightGreyVbox7.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor71.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground7();
				vboxConvertedColor71.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor72.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor72.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox7.setBackground(tfConvertedColor72.getBackground());			
				rightGreyVbox7.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor72.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground7();
				vboxConvertedColor72.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor73.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor73.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox7.setBackground(tfConvertedColor73.getBackground());			
				rightGreyVbox7.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor73.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground7();
				vboxConvertedColor73.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor74.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor74.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox7.setBackground(tfConvertedColor74.getBackground());				
				rightGreyVbox7.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor74.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground7();
				vboxConvertedColor74.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor75.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor75.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox7.setBackground(tfConvertedColor75.getBackground());			
				rightGreyVbox7.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor75.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground7();
				vboxConvertedColor75.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});

		tfConvertedColor81.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor81.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox8.setBackground(tfConvertedColor81.getBackground());				
				rightGreyVbox8.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor81.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground8();
				vboxConvertedColor81.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor82.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor82.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox8.setBackground(tfConvertedColor82.getBackground());			
				rightGreyVbox8.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor82.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground8();
				vboxConvertedColor82.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor83.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor83.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox8.setBackground(tfConvertedColor83.getBackground());			
				rightGreyVbox8.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor83.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground8();
				vboxConvertedColor83.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor84.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor84.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox8.setBackground(tfConvertedColor84.getBackground());		
				rightGreyVbox8.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor84.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground8();
				vboxConvertedColor84.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor85.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor85.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox8.setBackground(tfConvertedColor85.getBackground());		
				rightGreyVbox8.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor85.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground8();
				vboxConvertedColor85.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});


		tfConvertedColor91.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor91.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox9.setBackground(tfConvertedColor91.getBackground());				
				rightGreyVbox9.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor91.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground9();
				vboxConvertedColor91.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor92.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor92.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox9.setBackground(tfConvertedColor92.getBackground());			
				rightGreyVbox9.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor92.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground9();
				vboxConvertedColor92.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor93.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor93.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox9.setBackground(tfConvertedColor93.getBackground());			
				rightGreyVbox9.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor93.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground9();
				vboxConvertedColor93.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor94.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor94.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox9.setBackground(tfConvertedColor94.getBackground());			
				rightGreyVbox9.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor94.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground9();
				vboxConvertedColor94.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor95.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor95.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox9.setBackground(tfConvertedColor95.getBackground());				
				rightGreyVbox9.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor95.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground9();
				vboxConvertedColor95.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});

		tfConvertedColor101.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox10.setBackground(tfConvertedColor101.getBackground());				
				rightGreyVbox10.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor101.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground10();
				vboxConvertedColor101.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor102.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor102.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox10.setBackground(tfConvertedColor102.getBackground());				
				rightGreyVbox10.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor102.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground10();
				vboxConvertedColor102.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor103.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor103.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox10.setBackground(tfConvertedColor103.getBackground());				
				rightGreyVbox10.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor103.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground10();
				vboxConvertedColor103.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor104.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor104.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox10.setBackground(tfConvertedColor104.getBackground());				
				rightGreyVbox10.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor104.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground10();
				vboxConvertedColor104.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
		tfConvertedColor105.addEventHandler(MouseEvent.MOUSE_CLICKED, e->{
			if(e.getButton()==MouseButton.MIDDLE && ((Color)tfConvertedColor105.getBackground().getFills().get(0).getFill())!=Color.WHITE) {
				rightColorVbox10.setBackground(tfConvertedColor105.getBackground());			
				rightGreyVbox10.setBackground(new Background(new BackgroundFill(((Color)tfConvertedColor105.getBackground().getFills().get(0).getFill()).grayscale(), CornerRadii.EMPTY, Insets.EMPTY)));
				resetVboxColorBackground10();
				vboxConvertedColor105.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, Insets.EMPTY)));
			}
		});
	}
	private void resetVboxColorBackground1() {
		vboxConvertedColor11.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor12.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor13.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor14.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor15.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	private void resetVboxColorBackground2() {
		vboxConvertedColor21.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor22.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor23.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor24.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor25.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	private void resetVboxColorBackground3() {
		vboxConvertedColor31.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor32.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor33.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor34.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor35.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	private void resetVboxColorBackground4() {
		vboxConvertedColor41.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor42.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor43.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor44.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor45.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	private void resetVboxColorBackground5() {
		vboxConvertedColor51.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor52.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor53.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor54.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor55.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	private void resetVboxColorBackground6() {
		vboxConvertedColor61.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor62.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor63.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor64.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor65.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	private void resetVboxColorBackground7() {
		vboxConvertedColor71.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor72.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor73.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor74.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor75.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	private void resetVboxColorBackground8() {
		vboxConvertedColor81.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor82.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor83.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor84.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor85.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	private void resetVboxColorBackground9() {
		vboxConvertedColor91.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor92.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor93.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor94.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor95.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	private void resetVboxColorBackground10() {
		vboxConvertedColor101.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor102.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor103.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor104.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		vboxConvertedColor105.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
}
