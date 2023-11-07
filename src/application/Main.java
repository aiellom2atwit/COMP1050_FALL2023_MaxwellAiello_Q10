package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		//creates instances of the window classes
		CircleWindow circleWin = new CircleWindow();
		PasswordWindow passWin = new PasswordWindow();
		
		//initializes the circle window
		circleWin.start(primaryStage);
		
		//creates a second stage for the second window
		Stage stage2 = new Stage();
		//initializes the second window
		passWin.start(stage2);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
