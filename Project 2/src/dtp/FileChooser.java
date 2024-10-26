// Name: Shaivan Bhagat
// This porject is all my own work
// I have not knowingly allowed others to copy my work 

package dtp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FileChooser extends Application {
	public void start(Stage stage) {

		//Creating nodes
		TextField textField1 = new TextField();
		// creating a select button
		Button button = new Button("Select");
		button.setTranslateX(250);
		button.setTranslateY(75);

		//Creating labels
		Label label1 = new Label("Text File: ");

		//Setting the message with read data
		Text text = new Text("");
		//Setting font to the label
		Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15);
		text.setFont(font);
		text.setTranslateX(15);
		text.setTranslateY(125);
		text.setFill(Color.BLACK);
		text.maxWidth(580);
		text.setWrappingWidth(580);

		String s1 = "guests0.txt";
		String s2 = "guests1.txt";
		String s3 = "guests2.txt";  

		//Displaying the message
		button.setOnAction(e -> {
			//Retrieving data
			if(textField1.getText().equals(s1)) {
				text.setText("File: guests0.txt");
			}
			else if(textField1.getText().equals(s2)) {
				text.setText("File: guests1.txt");
			}
			else if(textField1.getText().equals(s3)) {
				text.setText("File: guests2.txt");
			}
			else {
				text.setText("N/A");
			}
		});

		//Adding labels for nodes
		HBox box = new HBox(5);
		box.setPadding(new Insets(25, 5 , 5, 50));
		box.getChildren().addAll(label1, textField1);
		Group root = new Group(box, button, text);
		//Setting the stage
		Scene scene = new Scene(root, 595, 150, Color.WHITESMOKE);
		stage.setTitle("Choose the Text File");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String args[]){
		launch(args);
	}
}