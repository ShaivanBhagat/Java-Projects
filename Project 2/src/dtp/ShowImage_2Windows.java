// Name: Shaivan Bhagat
// This porject is all my own work
// I have not knowingly allowed others to copy my work 

package dtp;

// import java classes to work with GUI
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

// Graphical user interface with two separate windows/stages
// class inherits from Application class with an override method
public class ShowImage_2Windows extends Application{

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		// create a pane and set its properties
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);

		//create a circle and set its properties
		Circle circle = new Circle();
		circle.setRadius(150);
		circle.setStroke(Color.BLACK);
		circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));

		// create a label and set its properties (font,etc)
		Label label = new Label("Welcome to the Dinner Table Problem");
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,15));


		// place nodes in the pane
		pane.add(circle, 0, 0);
		pane.add(label, 0, 0);   
		GridPane.setHalignment(label, HPos.CENTER); // align the label in the center of the circle

		// create a new pane to hold the image views
		Pane pane1 = new HBox(10);
		pane1.setPadding(new Insets(5, 5, 5, 5));
		
		// create and add an image view to the pane
		ImageView imageView = new ImageView("image/dinner.gif");
		pane1.getChildren().add(imageView);
		
		// create a path transition to allow a transition for the image 
		PathTransition pt = new PathTransition(Duration.millis(10000),
				 new Line(100, 200, 100, 0), imageView);
		pt.setCycleCount(Timeline.INDEFINITE); // loop the animation indefinitely
		pt.play(); // run the transition

		// Create a scene and place the circle it in the stage
		Scene scene = new Scene(pane);	    
		primaryStage.setTitle("Project2: Dinner Table Problem"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

		// create a new scene
		Scene scene1 = new Scene (pane1,375,300);
		Stage stage1 = new Stage(); // create a new stage
		stage1.setTitle("Project2: Dinner Table Problem"); // set the title for the new stage
		stage1.setScene(scene1); // set the new scene
		stage1.show(); // display the new stage with the new scene

	}


	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
} 

