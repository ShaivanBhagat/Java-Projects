// Name: Shaivan Bhagat
// This porject is all my own work
// I have not knowingly allowed others to copy my work 

package dtp;

// import java SDE classes to run GUI
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
// import all required javafx classes to run a graphical user interface
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

// display the images in a single window/stage
// class ShowImages inherits constructor properties from the built-in Application class
public class ShowImages extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		// Create a border pane
		BorderPane pane = new BorderPane();

		// Place nodes in the pane 
		pane.setTop(getHBox()); 
		pane.setBottom(getVBox());

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Project2: Dinner Table Problem"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	// create a method to display the circle image
	private HBox getHBox() {

		// create a horizontal box with 
		HBox hBox = new HBox(15); 
		hBox.setPadding(new Insets(10, 10, 10, 10));

		//create a circle and set its properties
		Circle circle = new Circle();
		circle.setRadius(150);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITESMOKE);

		hBox.getChildren().add(circle); // add circle to the pane

		// create a text and set its properties
		Text text = new Text ("Welcome to the Dinner Table Problem ");
		text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,15));
		text.setFill(Color.BLACK);

		StackPane stack = new StackPane();  // create a stackpane to stack the text on the circle
		stack.getChildren().addAll(circle,text); // stack the text on the circle

		stack.setAlignment(Pos.CENTER); // center align the stack containing the circle and text
		hBox.getChildren().add(stack);  // add the stack to the hBox pane in the layout
		hBox.setHgrow(stack, Priority.ALWAYS); // give the stack space 

		return hBox;  
	}

	// create a verticle box method to display the dinner table image
	private VBox getVBox() {

		// create a vertical box in the border pane layout
		VBox vBox = new VBox(20);
		vBox.setPadding(new Insets(20,20,20,20));
		vBox.setAlignment(Pos.CENTER);

		// create an imageview  to read the image and display the image in the vertical box
		ImageView imageView = new ImageView("image/dinner.gif");
		vBox.getChildren().add(imageView);

		// create a path transition
		PathTransition pt = new PathTransition(Duration.millis(10000),
				new Line(240,200,240,0), imageView);
		pt.setCycleCount(Timeline.INDEFINITE); // run the path transition animation for an indefinite loop
		pt.play(); // run the transition animation

		return vBox;
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
} 









