/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author gmein
 */
public class Threads1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Start finding primes!");
        btn.setOnAction((e) -> {});
        
        Text t = new Text("no primes found so far");
        
        VBox ui = new VBox();
        ui.getChildren().addAll(btn, ui);
        
        StackPane root = new StackPane();
        root.getChildren().add(ui);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Prime finder");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
