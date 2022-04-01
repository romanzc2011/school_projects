
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/*
 * File:
 * Author: Roman Campbell
 * Concentration: Cybersecurity and Networking
 * Date: 
 * Java class description:
 */


public class Cell extends Application {
    
    public void start(Stage primaryStage) {
        Snake s = new Snake();
        Group root;
        
        //Scene scene = new Scene(600, 600, Color.BLACK);
        primaryStage.setTitle("Snake Game");
        primaryStage.setScene(scene);
    }

}
