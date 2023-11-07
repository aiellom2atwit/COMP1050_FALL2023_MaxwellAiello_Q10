package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos; 
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleWindow extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		//Third window circle
        final Circle c = new Circle();
        
        Pane pane = new Pane();
        c.setCenterX(100);
        c.setCenterY(100);
        c.setRadius(50);
        //c.setStroke(Color.BLACK);
        c.setFill(Color.hsb(40, .5, .8));
        c.setStroke(Color.rgb(255, 80, 150));
        c.setStrokeWidth(3);
        
        c.centerXProperty().bind(pane.widthProperty().divide(2));
        c.centerYProperty().bind(pane.heightProperty().divide(2));
        
        pane.getChildren().add(c);
        
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Circle!");
        primaryStage.setScene(scene);
        primaryStage.show();
	}

}
